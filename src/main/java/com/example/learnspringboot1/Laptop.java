package com.example.learnspringboot1;

import org.springframework.stereotype.Component;

@Component("lappy")
public class Laptop {
	private int lid;
	private int lname;

	public Laptop() {
		System.out.println("Laptop object created");
	}

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public int getLname() {
		return lname;
	}

	public void setLname(int lname) {
		this.lname = lname;
	}

	public void compile() {
		System.out.println("Compiling in laptop class");
	}
}
