package com.pankaj.onlinecv.api.composite.profile;

public final class ServiceAddresses {
    private final String compositeServiceAddress;
    private final String profileServiceAddress;
    private final String skillsServiceAddress;

    public ServiceAddresses(String compositeServiceAddress, String profileServiceAddress,
                            String skillsServiceAddress) {
        this.compositeServiceAddress = compositeServiceAddress;
        this.profileServiceAddress = profileServiceAddress;
        this.skillsServiceAddress = skillsServiceAddress;
    }

    public String getCompositeServiceAddress() {
        return compositeServiceAddress;
    }

    public String getProfileServiceAddress() {
        return profileServiceAddress;
    }

    public String getSkillsServiceAddress() {
        return skillsServiceAddress;
    }
}
