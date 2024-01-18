package com.journaldev.jsf.helloworld;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

@ManagedBean(name = "newPage")
@SessionScoped
public class NewPage implements Serializable {
    private static final long serialVersionUID = -6913972022251814607L;

    private String s1 = "New Page!!";

    public String getS1() {
        System.out.println(s1);
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }
}
