package com.journaldev.service;

import com.journaldev.domain.entity.Galaxy;
import com.journaldev.domain.entity.Moon;

import java.util.List;

public interface MoonService {
    void registerMoon(String name);
    void registerMoon(Moon moon);

    List<Moon> getAllMoon();
}
