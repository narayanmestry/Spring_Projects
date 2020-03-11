package com.bridgelabz.springioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Mobile {
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		System.out.println("Context Loaded");
//	
		// Using BeanFactory .
		System.out.println("Using Bean Factory\n");
		Resource resource = new ClassPathResource("bean.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		
		Sim  sim= (Sim) factory.getBean("sim");
		sim.calling();
		sim.data();
		
		// Using Application Context 
		System.out.println("\n\nUsing Application ApplicationContext\n ");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Sim sim1 = context.getBean("sim",Sim.class);
		sim1.calling();
		sim1.data();
	}
}
