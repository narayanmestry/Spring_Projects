package com.bridgelabz.SIdependancy.literal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Company {
	public static void main(String[] args) {
		
	ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
	Employee emp = context.getBean("e",Employee.class);
	emp.display();
	
	}
}
