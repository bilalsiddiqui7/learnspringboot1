package com.example.learnspringboot1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Learnspringboot1Application {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Learnspringboot1Application.class, args);
		Alien obj = context.getBean(Alien.class);
		obj.running();
		
		Alien obj1 = context.getBean(Alien.class);

		Alien obj2 = context.getBean(Alien.class);
		obj.running();
		
		//DEPENDENCY INJECTION
		ClassDI ClassDIObj=context.getBean(ClassDI.class);
		System.out.println(ClassDIObj.getDiscountMessage());
	}

}
