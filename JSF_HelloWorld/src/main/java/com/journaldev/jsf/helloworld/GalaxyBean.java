package com.journaldev.jsf.helloworld;


import com.journaldev.domain.entity.enums.AgeUnit;
import com.journaldev.domain.entity.enums.GalaxyType;
import com.journaldev.service.GalaxyService;


import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import java.io.Serializable;


@ManagedBean(name = "galaxyBean")
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


    public String registerGalaxy() {
        galaxyService.registerGalaxy(name, type, age, ageUnit);

        return "success"; // Navigation rule to redirect to a success page
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

