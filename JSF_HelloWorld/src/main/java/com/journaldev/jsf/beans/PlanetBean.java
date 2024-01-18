package com.journaldev.jsf.beans;

import com.journaldev.domain.entity.enums.PlanetType;
import com.journaldev.service.PlanetService;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import java.io.Serializable;

@ManagedBean(name = "planetBean")
@SessionScoped
public class PlanetBean implements Serializable {
    private String name;
    private PlanetType type;
    private boolean habitable;
    @Inject
    private PlanetService planetService;

    public PlanetBean() {
    }
    public String registerPlanet() {
        planetService.registerPlanet(name, type, habitable);

        return "success"; // Navigation rule to redirect to a success page
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlanetType getType() {
        return type;
    }

    public void setType(PlanetType type) {
        this.type = type;
    }

    public boolean isHabitable() {
        return habitable;
    }

    public void setHabitable(boolean habitable) {
        this.habitable = habitable;
    }

    @Inject
    public PlanetService getPlanetService() {
        return planetService;
    }

    public void setPlanetService(PlanetService planetService) {
        this.planetService = planetService;
    }
}
