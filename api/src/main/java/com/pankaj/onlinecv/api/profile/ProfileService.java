package com.pankaj.onlinecv.api.profile;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface ProfileService {
    @PostMapping(value = "/profile/add", produces = "application/json", consumes = "application/json")
    ProfilePerson createNewProfile(@RequestBody ProfilePerson body);

    @DeleteMapping(value = "/profile/{profileId}", produces = "application/json")
    Boolean deleteProfile(@PathVariable String profileId);
}
