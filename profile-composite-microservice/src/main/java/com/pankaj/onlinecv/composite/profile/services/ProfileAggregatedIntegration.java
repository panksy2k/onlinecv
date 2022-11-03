package com.pankaj.onlinecv.composite.profile.services;

import com.pankaj.onlinecv.api.core.profile.ProfilePerson;
import com.pankaj.onlinecv.api.core.profile.ProfileService;
import com.pankaj.onlinecv.api.core.skills.SkillsIT;
import com.pankaj.onlinecv.api.core.skills.SkillsITService;
import com.pankaj.onlinecv.api.event.MessageEvent;
import com.pankaj.onlinecv.composite.profile.message.MessageTopics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Component
public class ProfileAggregatedIntegration implements ProfileService, SkillsITService {

    private final WebClient webClient;
    private final MessageTopics messageTopic;
    private final String profileServiceURL;
    private final String skillServiceURL;

    @Autowired
    public ProfileAggregatedIntegration(WebClient.Builder webClient,
                                        MessageTopics messageTopics,
                                        @Value("${app.profile-service.host}")
                                        String profileServiceHost,
                                        @Value("${app.profile-service.port}")
                                        int profileServicePort,
                                        @Value("${app.skills-service.host}")
                                        String skillsServiceHost,
                                        @Value("${app.skills-service.port}")
                                        int skillsServicePort) {

        this.webClient = webClient.build();
        this.messageTopic = messageTopics;
        this.profileServiceURL = String.format("http://%s:%d", profileServiceHost, profileServicePort);
        this.skillServiceURL = String.format("http://%s:%d", skillsServiceHost, skillsServicePort);
    }

    @Override
    public ProfilePerson createNewProfile(ProfilePerson body) {
        this.messageTopic.coreProfile().send(MessageBuilder.withPayload(new MessageEvent(
                MessageEvent.MessageEventType.CREATE, body.getId(), body)).build());

        return body;
    }

    @Override
    public Boolean deleteProfile(Integer profileId) {
        return this.messageTopic.coreProfile().send(MessageBuilder.withPayload(new MessageEvent(
                MessageEvent.MessageEventType.DELETE, profileId, null)).build());
    }

    @Override
    public SkillsIT createSkills(SkillsIT body) {
        this.messageTopic.coreSkills().send(MessageBuilder.withPayload(new MessageEvent(
                MessageEvent.MessageEventType.CREATE, body.getProfileID(), body)).build());

        return body;
    }

    @Override
    public Flux<SkillsIT> getProfileBasedSkills(String profileId) {
        String url = new StringBuilder(skillServiceURL).append("/techskills").append("?")
                .append("profileId=").append(profileId).toString();

        return this.webClient.get().uri(url).retrieve().bodyToFlux(SkillsIT.class).log()
                .onErrorResume(error -> Flux.empty());
    }

    @Override
    public void deleteSkills(String profileId) {
        this.messageTopic.coreSkills().send(MessageBuilder.withPayload(new MessageEvent(
                MessageEvent.MessageEventType.DELETE, profileId, null)).build());
    }
}
