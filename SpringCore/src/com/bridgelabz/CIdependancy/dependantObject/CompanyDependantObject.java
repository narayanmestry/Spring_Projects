package com.bridgelabz.CIdependancy.dependantObject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CompanyDependantObject {
	public static void main(String[] args) {
		System.out.println("Constructor injection with Dependant Object ");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Employee e = context.getBean("e4", Employee.class);
		e.display();
	}
}
