package com.space.domain.entity;


import com.space.domain.entity.enums.PlanetType;


import javax.persistence.*;


@Entity
@Table(name = "planet")
public class Planet extends BaseEntity {
    private String name;
    private PlanetType type;
    private boolean habitable;

    public Planet() {
    }

    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "type", nullable = false)
    @Enumerated(EnumType.STRING)
    public PlanetType getType() {
        return type;
    }

    public void setType(PlanetType type) {
        this.type = type;
    }

    @Column(name = "is_habitable")
    public boolean isHabitable() {
        return habitable;
    }

    public void setHabitable(boolean habitable) {
        this.habitable = habitable;
    }
}


