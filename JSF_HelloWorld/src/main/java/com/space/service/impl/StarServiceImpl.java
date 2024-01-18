package com.space.service.impl;

import com.space.domain.entity.Star;
import com.space.domain.entity.enums.StarClass;
import com.space.repository.StarRepository;
import com.space.service.StarService;
import org.springframework.stereotype.Service;

import java.util.List;

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


    @Override
    public List<Star> getAllStar() {
        return this.starRepository.getAllStar();
    }

    @Override
    public void registerStar(Star star) {
        this.starRepository.save(star);
    }


}

