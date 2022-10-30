package com.pankaj.onlinecv.composite.profile.services;

import com.pankaj.onlinecv.api.composite.profile.ProfileAggregate;
import com.pankaj.onlinecv.api.composite.profile.ProfileAggregateService;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class ProfileAggregateServiceImpl implements ProfileAggregateService {
    private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());


    @Override
    public void createCompleteProfile(ProfileAggregate body) {

    }

    @Override
    public Mono<ProfileAggregate> getCompleteProfile(Integer profileId) {
        return null;
    }

    @Override
    public void deleteCompleteProfile(Integer profileId) {

    }
}
