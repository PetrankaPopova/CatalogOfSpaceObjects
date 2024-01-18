package com.journaldev.domain.entity;

import com.journaldev.domain.BaseEntity;
import com.journaldev.domain.entity.enums.StarClass;

import javax.persistence.*;


@Entity
@Table(name = "star")
public class Star extends BaseEntity {
    private String name;
    private StarClass starClass;
    private double mass;
    private double size;
    private int temperature;
    private boolean compatibility;

    public Star() {
    }

    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "star_Class", nullable = false)
    @Enumerated(EnumType.STRING)
    public StarClass getStarClass() {
        return starClass;
    }

    public void setStarClass(StarClass starClass) {
        this.starClass = starClass;
    }

    @Column(name = "mass", nullable = false)
    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    @Column(name = "size", nullable = false)
    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Column(name = "temperature", nullable = false)
    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    @Column(name = "compatibility", nullable = false)
    public boolean isCompatibility() {
        return compatibility;
    }

    public void setCompatibility(boolean compatibility) {
        this.compatibility = compatibility;
    }
}
