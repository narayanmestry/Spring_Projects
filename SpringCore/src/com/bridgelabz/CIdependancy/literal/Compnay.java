package com.bridgelabz.CIdependancy.literal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Compnay {
	public static void main(String[] args) {
		System.out.println("Dependancy Injection of Primitive and String based value : ");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Employee e = context.getBean("e3",Employee.class);
		e.Display();
	}
}
