package com.journaldev.service.impl;

import com.journaldev.domain.entity.Star;
import com.journaldev.domain.entity.enums.StarClass;
import com.journaldev.repository.StarRepository;
import com.journaldev.service.StarService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public List<Star> searchStars(String name, StarClass starClass) {
        List<Star> starEntities;

        if (name != null && starClass != null) {
            starEntities = starRepository.findByNameAndStarClass(name, starClass);
        } else if (name != null) {
            starEntities = starRepository.findByName(name);
        } else if (starClass != null) {
            starEntities = starRepository.findByStarClass(starClass);
        } else {
            starEntities = starRepository.findAll();
        }

        return starEntities.stream()
                .map(this::convertToStar)
                .collect(Collectors.toList());
    }


    private Star convertToStar(Star starEntity) {
        Star star = new Star();
        star.setName(starEntity.getName());
        star.setStarClass(starEntity.getStarClass());
        star.setMass(starEntity.getMass());
        star.setSize(starEntity.getSize());
        star.setTemperature(starEntity.getTemperature());

        return star;
    }
}

