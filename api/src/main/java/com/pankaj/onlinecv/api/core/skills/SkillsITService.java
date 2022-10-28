package com.pankaj.onlinecv.api.core.skills;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import reactor.core.publisher.Flux;

public interface SkillsITService {
    SkillsIT createSkills(@RequestBody SkillsIT body);

    @GetMapping(value = "/techskills", produces = "application/json")
    Flux<SkillsIT> getProfileBasedSkills(@RequestParam(value = "profileId", required = true) String profileId);

    @DeleteMapping(value = "/removeskills")
    void deleteSkills(@RequestParam(value = "profileId", required = true) String profileId);
}
