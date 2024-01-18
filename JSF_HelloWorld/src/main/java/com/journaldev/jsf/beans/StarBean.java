package com.journaldev.jsf.beans;

import com.journaldev.domain.entity.enums.StarClass;
import com.journaldev.service.StarService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

@ManagedBean(name = "starBean")
@SessionScoped
public class StarBean {
    private String name;
    private StarClass starClass;
    private double mass;
    private double size;
    private int temperature;
    private boolean compatibility;

    @Inject
    private StarService service;

    public StarBean() {
    }
    @Transactional
    public String registerStar() {
       service.registerStar(name, starClass , mass, size, temperature, compatibility);

        return "success"; // Navigation rule to redirect to a success page
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StarClass getStarClass() {
        return starClass;
    }

    public void setStarClass(StarClass starClass) {
        this.starClass = starClass;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public boolean isCompatibility() {
        return compatibility;
    }

    public void setCompatibility(boolean compatibility) {
        this.compatibility = compatibility;
    }

    @Inject
    public StarService getService() {
        return service;
    }

    public void setService(StarService service) {
        this.service = service;
    }
}
