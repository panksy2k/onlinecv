package com.pankaj.onlinecv.api.core.skills;

public class SkillsIT {
    private String name;
    private Short rank;
    private String profileID;
    private String serviceAddress;

    public SkillsIT() {
        super();
        this.name = null;
        this.rank = 0;
        this.profileID = null;
        this.serviceAddress = null;
    }

    public SkillsIT(String profileID, String name, Short rank, String serviceAddress) {
        this.profileID = profileID;
        this.serviceAddress = serviceAddress;
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getRank() {
        return rank;
    }

    public void setRank(Short rank) {
        this.rank = rank;
    }

    public String getProfileID() {
        return profileID;
    }

    public void setProfileID(String profileID) {
        this.profileID = profileID;
    }

    public String getServiceAddress() {
        return serviceAddress;
    }

    public void setServiceAddress(String serviceAddress) {
        this.serviceAddress = serviceAddress;
    }
}
