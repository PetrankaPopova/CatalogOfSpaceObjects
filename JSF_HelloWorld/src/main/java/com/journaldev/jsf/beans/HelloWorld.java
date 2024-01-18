package com.journaldev.jsf.beans;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "helloWorld")
@SessionScoped
public class HelloWorld implements Serializable {

	private static final long serialVersionUID = -6913972022251814607L;

	private String s1 = "Planet Software!!";

	public String getS1() {
		return s1;
	}

	public void setS1(String s1) {
		this.s1 = s1;
	}

	public void test(){
		System.out.println("Test");
	}

}
