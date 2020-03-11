 package com.bridgelabz.autowiring.byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireUsingSetterMethod {
	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("autowireBean.xml");
		Employee e = context.getBean("emp1", Employee.class);
		e.display();
	}
	
	
}
