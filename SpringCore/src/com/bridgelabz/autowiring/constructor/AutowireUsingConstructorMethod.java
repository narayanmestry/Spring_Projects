package com.bridgelabz.autowiring.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireUsingConstructorMethod {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autowireBean.xml");
		Employee e = context.getBean("emp5", Employee.class);
		e.display();
	} 
}
