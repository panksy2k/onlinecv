package com.pankaj.onlinecv.composite.profile.message;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface MessageTopics {
    String SINK_PROFILE_CORE_TOPIC = "profile-core";
    String SINK_SKILLS_TOPIC = "skills";

    @Output(SINK_PROFILE_CORE_TOPIC)
    MessageChannel coreProfile();

    @Output(SINK_SKILLS_TOPIC)
    MessageChannel coreSkills();
}
