package com.journaldev.service.impl;

import com.journaldev.domain.entity.Star;
import com.journaldev.domain.entity.enums.StarClass;
import com.journaldev.repository.StarRepository;
import com.journaldev.service.StarService;
import org.springframework.stereotype.Service;

@Service
public class StarServiceImpl implements StarService {
    private final StarRepository starRepository;

    public StarServiceImpl(StarRepository starRepository) {
        this.starRepository = starRepository;
    }

    @Override
    public void registerStar(String name, StarClass starClass, double mass, double size, int temperature, boolean compatibility) {
        Star star = new Star();
        star.setName(name);
        star.setStarClass(starClass);
        star.setMass(mass);
        star.setSize(size);
        star.setTemperature(temperature);
        star.setCompatibility(compatibility);
        this.starRepository.save(star);
    }
}
