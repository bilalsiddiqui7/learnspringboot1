package com.example.learnspringboot1;

import org.springframework.stereotype.Component;

@Component
public class DiscountServiceImplDI implements DiscountServiceDI{

	@Override
	public String getDiscountMessage() {
		// TODO Auto-generated method stub
		return "The current discount is 20 %";
	}

}
