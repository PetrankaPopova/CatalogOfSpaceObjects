package com.journaldev.jsf.beans;


import com.journaldev.domain.entity.Galaxy;
import com.journaldev.domain.entity.enums.AgeUnit;
import com.journaldev.domain.entity.enums.GalaxyType;
import com.journaldev.service.GalaxyService;


import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;


@ManagedBean(name = "galaxyBean")
@SessionScoped
public class GalaxyBean implements Serializable {
    private String name;
    private GalaxyType type;
    private double age;
    private AgeUnit ageUnit;

    @Inject
    private GalaxyService galaxyService;

    public GalaxyBean() {
    }

    @Inject
    public GalaxyBean(GalaxyService galaxyService) {
        this.galaxyService = galaxyService;
    }

    @Transactional
    public String registerGalaxy() {
        galaxyService.registerGalaxy(name, type, age, ageUnit);

        return "success"; // Navigation rule to redirect to a success page
    }
    public String getRegisteredGalaxyStatistics() {
        List<Galaxy> galaxies = galaxyService.getAllGalaxies();
        int totalGalaxies = galaxies.size();
        String statistics = String.format("Total Galaxies: %d", totalGalaxies);
        return statistics;
    }

    @PostConstruct
    public void init() {
        loadInitialData();
    }

    private void loadInitialData() {
        for (int i = 0; i < 100000; i++) {
            Galaxy galaxy = new Galaxy();
            galaxyService.registerGalaxy(galaxy);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GalaxyType getType() {
        return type;
    }

    public void setType(GalaxyType type) {
        this.type = type;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public AgeUnit getAgeUnit() {
        return ageUnit;
    }

    public void setAgeUnit(AgeUnit ageUnit) {
        this.ageUnit = ageUnit;
    }

    public GalaxyService getGalaxyService() {
        return galaxyService;
    }

    public void setGalaxyService(GalaxyService galaxyService) {
        this.galaxyService = galaxyService;
    }

    // Add more methods for statistics and searching
}

