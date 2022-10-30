package com.pankaj.onlinecv.api.composite.profile;

import java.util.List;

public class ProfileAggregate {
    private final Integer profileID;
    private final String personName;
    private final List<TechnicalSkillsSummary> skills;
    private final ServiceAddresses serviceAddresses;

    public ProfileAggregate(Integer profileID, String personName,
                            List<TechnicalSkillsSummary> skills,
                            ServiceAddresses serviceAddresses) {
        this.profileID = profileID;
        this.personName = personName;
        this.skills = skills;
        this.serviceAddresses = serviceAddresses;
    }

    public Integer getProfileID() {
        return profileID;
    }

    public String getPersonName() {
        return personName;
    }

    public List<TechnicalSkillsSummary> getSkills() {
        return skills;
    }

    public ServiceAddresses getServiceAddresses() {
        return serviceAddresses;
    }
}
