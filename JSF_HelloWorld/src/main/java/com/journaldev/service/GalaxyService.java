package com.journaldev.service;


import com.journaldev.domain.entity.enums.AgeUnit;
import com.journaldev.domain.entity.enums.GalaxyType;

public interface GalaxyService {
    void registerGalaxy(String name, GalaxyType type, double age, AgeUnit ageUnit);
}
