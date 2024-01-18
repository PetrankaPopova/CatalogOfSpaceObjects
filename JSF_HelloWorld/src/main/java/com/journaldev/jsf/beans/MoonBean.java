package com.journaldev.jsf.beans;



import com.journaldev.domain.entity.Galaxy;
import com.journaldev.domain.entity.Moon;
import com.journaldev.service.MoonService;

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
        String statistics = String.format("Total Moon: %d", totalMoon);
        return statistics;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
