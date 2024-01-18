package com.journaldev.service;

import com.journaldev.domain.entity.Planet;
import com.journaldev.domain.entity.Star;
import com.journaldev.domain.entity.enums.StarClass;

import java.util.List;

public interface StarService {
    public void registerStar(String name, StarClass starClass, double mass, double size, int temperature, boolean compatibility);
    List<Star> getAllStar();
    public void registerStar(Star star);
}
