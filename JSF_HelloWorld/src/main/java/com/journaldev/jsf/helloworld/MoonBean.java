package com.journaldev.jsf.helloworld;



import com.journaldev.service.MoonService;

import javax.annotation.ManagedBean;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import java.io.Serializable;

@ManagedBean
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

    public String registerMoon(){
        this.moonService.registerMoon(name);
        return "success";
    }
}
