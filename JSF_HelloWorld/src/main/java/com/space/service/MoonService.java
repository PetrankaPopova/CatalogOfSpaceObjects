package com.space.service;

import com.space.domain.entity.Moon;

import java.util.List;

public interface MoonService {
    void registerMoon(String name);
    void registerMoon(Moon moon);

    List<Moon> getAllMoon();
}
