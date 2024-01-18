package com.journaldev.service;

import com.journaldev.domain.entity.enums.PlanetType;

public interface PlanetService {
    public void registerPlanet(String name, PlanetType type, boolean habitable);
}
