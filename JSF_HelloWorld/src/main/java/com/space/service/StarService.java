package com.space.service;


import com.space.domain.entity.Star;
import com.space.domain.entity.enums.StarClass;

import java.util.List;

public interface StarService {
    public void registerStar(String name, StarClass starClass, double mass, double size, int temperature, boolean compatibility);
    List<Star> getAllStar();
    public void registerStar(Star star);


}
