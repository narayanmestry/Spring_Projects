package com.bridgelabz.autowiring.using_qualifire_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireText {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autowireBean.xml");
		Student s = context.getBean("ss", Student.class);
		s.display();
	} 
}
   