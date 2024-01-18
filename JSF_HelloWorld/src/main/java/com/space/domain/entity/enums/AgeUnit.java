package com.space.domain.entity.enums;

public enum AgeUnit {
    BILLIONS("B"),
    MILLIONS("M");

    private final String abbreviation;

    AgeUnit(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
