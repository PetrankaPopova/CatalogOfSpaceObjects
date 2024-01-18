package com.journaldev.service.impl;


import com.journaldev.domain.entity.Moon;
import com.journaldev.repository.MoonRepository;
import com.journaldev.service.MoonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MoonServiceImpl implements MoonService {
    private final MoonRepository moonRepository;

    @Autowired
    public MoonServiceImpl(MoonRepository moonRepository) {
        this.moonRepository = moonRepository;
    }

    @Override
    public void registerMoon(String name) {
        Moon moon = new Moon();
        moon.setName(name);
        this.moonRepository.save(moon);
    }
}