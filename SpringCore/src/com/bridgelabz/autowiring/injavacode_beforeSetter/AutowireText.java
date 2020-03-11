package com.bridgelabz.autowiring.injavacode_beforeSetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireText {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autowireBean.xml");
		Student s = context.getBean("s1", Student.class);
		s.display();
	}
}
  