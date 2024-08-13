package com.example.learnspringboot1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassDI {

//	//FIELD INJECTION
//	@Autowired
	private DiscountServiceDI discountServiceDI;

//	//CONSTRUCTOR INJECTION
//	@Autowired
//	public ClassDI(DiscountServiceDI discountServiceDI) {
//		this.discountServiceDI = discountServiceDI;
//	}
//
	//SETTER INJECTION
	@Autowired
	public void setDiscountServiceDI(DiscountServiceDI discountServiceDI) {
		this.discountServiceDI = discountServiceDI;
	}

	public String getDiscountMessage() {
		return discountServiceDI.getDiscountMessage();
	}
}
