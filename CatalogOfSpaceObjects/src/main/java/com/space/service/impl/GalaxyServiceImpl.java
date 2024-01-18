package com.space.service.impl;


import com.space.domain.entity.Galaxy;
import com.space.domain.entity.enums.AgeUnit;
import com.space.domain.entity.enums.GalaxyType;
import com.space.repository.GalaxyRepository;
import com.space.service.GalaxyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GalaxyServiceImpl implements GalaxyService {
    private final GalaxyRepository galaxyRepository;


    @Autowired
    public GalaxyServiceImpl(GalaxyRepository galaxyRepository) {
        this.galaxyRepository = galaxyRepository;
    }

    @Override
    public void registerGalaxy(String name, GalaxyType type, double age, AgeUnit ageUnit) {
        Galaxy galaxy = new Galaxy();
        galaxy.setName(name);
        galaxy.setType(type);
        galaxy.setAge(age);
        galaxy.setAgeUnit(ageUnit);
        galaxyRepository.save(galaxy);

    }

    @Override
    public void registerGalaxy(Galaxy galaxy) {
        this.galaxyRepository.save(galaxy);
    }

    @Override
    public List<Galaxy> getAllGalaxies() {
        return this.galaxyRepository.getAllGalaxies();
    }
}
