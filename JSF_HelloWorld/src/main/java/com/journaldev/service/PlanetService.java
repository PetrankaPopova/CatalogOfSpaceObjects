package com.journaldev.service;

import com.journaldev.domain.entity.Planet;
import com.journaldev.domain.entity.enums.PlanetType;

import java.util.List;

public interface PlanetService {
    public void registerPlanet(String name, PlanetType type, boolean habitable);
    List<Planet> getAllPlanet();
}
