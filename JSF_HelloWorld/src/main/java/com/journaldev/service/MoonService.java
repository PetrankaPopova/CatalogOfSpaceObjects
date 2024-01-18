package com.journaldev.service;

import com.journaldev.domain.entity.Galaxy;
import com.journaldev.domain.entity.Moon;

import java.util.List;

public interface MoonService {
    void registerMoon(String name);

    List<Moon> getAllMoon();
}
