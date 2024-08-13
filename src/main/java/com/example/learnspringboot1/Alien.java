package com.example.learnspringboot1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Alien {
	int aid;
	String aname;
	@Autowired()
	@Qualifier("lappy")
	Laptop laptopObj;

	public Alien() {
		super();
		System.out.println("Alien object created");
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public void running() {
		System.out.println("Alien is running");
		laptopObj.compile();
	}

}
