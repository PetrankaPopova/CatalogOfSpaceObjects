package com.space.jsf.beans;



import com.space.domain.entity.Moon;
import com.space.service.MoonService;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

@ManagedBean(name = "moonBean")
@SessionScoped
public class MoonBean implements Serializable {
    private String name;

    @Inject
    private MoonService moonService;

    public MoonBean() {
    }

    @Inject
    public MoonBean(MoonService moonService) {
        this.moonService = moonService;
    }
    @Transactional
    public String registerMoon(){
        this.moonService.registerMoon(name);
        return "success";
    }
    public String getRegisteredMoonStatistics() {
        List<Moon> moons = moonService.getAllMoon();
        int totalMoon = moons.size();
        String statistics = String.format("Total Moons: %d", totalMoon);
        return statistics;
    }
    @PostConstruct
    public void init() {
        loadInitialData();
    }

    private void loadInitialData() {
        for (int i = 0; i < 100000; i++) {
            Moon moon = new Moon();
            moon.setName("New Moon");
            moonService.registerMoon(moon);

        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
