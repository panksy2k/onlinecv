package com.pankaj.onlinecv.profile.persistence;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "profiles")
public class ProfileEntity {
    @Id
    private String id;

    @Version
    private Integer version;

    private String name;

    private String jobTitle;

    private String jobDescription;

    public ProfileEntity() {}

    public ProfileEntity(String name, String jobTitle, String jobDescription) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.jobDescription = jobDescription;
    }

    @Override
    public String toString() {
        return "ProfileEntity{" +
                "id='" + id + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }
}
