package com.pankaj.onlinecv.api.core.profile;

public class ProfilePerson {
    private Integer id;
    private String name;
    private String serviceAddress;

    public ProfilePerson() {
        id = null;
        name = null;
        serviceAddress = null;
    }

    public ProfilePerson(Integer id, String name, String serviceAddress) {
        this.id = id;
        this.name = name;
        this.serviceAddress = serviceAddress;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getServiceAddress() {
        return serviceAddress;
    }

    public void setServiceAddress(String serviceAddress) {
        this.serviceAddress = serviceAddress;
    }
}
