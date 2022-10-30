package com.pankaj.onlinecv.api.composite.profile;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import reactor.core.publisher.Mono;

public interface ProfileAggregateService {
    @PostMapping(value = "/profile-composite", consumes = "application/json")
    void createCompleteProfile(@RequestBody ProfileAggregate body);

    @GetMapping(value = "/profile-composite/{profileId}", produces = "application/json")
    Mono<ProfileAggregate> getCompleteProfile(@PathVariable Integer profileId);

    @DeleteMapping(value = "/profile-composite/{profileId}")
    void deleteCompleteProfile(@PathVariable Integer profileId);
}
