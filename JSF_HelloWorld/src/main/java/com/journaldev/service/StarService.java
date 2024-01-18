package com.journaldev.service;

import com.journaldev.domain.entity.enums.StarClass;

public interface StarService {
    public void registerStar(String name, StarClass starClass, double mass, double size, int temperature, boolean compatibility);
}
