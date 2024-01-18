package com.journaldev.domain.entity;



import com.journaldev.domain.BaseEntity;
import com.journaldev.domain.entity.enums.AgeUnit;
import com.journaldev.domain.entity.enums.GalaxyType;


import javax.persistence.*;

@Entity
@Table(name = "galaxy")
public class Galaxy extends BaseEntity {
    private String name;
    private GalaxyType type;
    private double age;
    private AgeUnit ageUnit;

    public Galaxy() {
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
    public GalaxyType getType() {
        return type;
    }

    public void setType(GalaxyType type) {
        this.type = type;
    }

    @Column(name = "age", nullable = false)
    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    @Column(name = "age_unit", nullable = false)
    @Enumerated(EnumType.STRING)
    public AgeUnit getAgeUnit() {
        return ageUnit;
    }

    public void setAgeUnit(AgeUnit ageUnit) {
        this.ageUnit = ageUnit;
    }

    @Override
    public String toString() {
        return "Galaxy{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", age=" + age +
                ageUnit +
                '}';
    }
}
