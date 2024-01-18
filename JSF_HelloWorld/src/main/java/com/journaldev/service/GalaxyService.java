package com.journaldev.service;


import com.journaldev.domain.entity.Galaxy;
import com.journaldev.domain.entity.enums.AgeUnit;
import com.journaldev.domain.entity.enums.GalaxyType;

import java.util.List;

public interface GalaxyService {
    void registerGalaxy(String name, GalaxyType type, double age, AgeUnit ageUnit);
    List<Galaxy> getAllGalaxies();

}
