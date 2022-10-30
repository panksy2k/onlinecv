package com.pankaj.onlinecv.api.composite.profile;

public class TechnicalSkillsSummary {
    private final String name;
    private final short rank;
    private final int skillsID;

    public TechnicalSkillsSummary(String name, short rank, int skillsID) {
        this.name = name;
        this.rank = rank;
        this.skillsID = skillsID;
    }

    public String getName() {
        return name;
    }

    public short getRank() {
        return rank;
    }

    public int getSkillsID() {
        return skillsID;
    }
}
