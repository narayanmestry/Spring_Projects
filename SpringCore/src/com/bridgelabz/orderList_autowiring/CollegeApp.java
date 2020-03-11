package com.bridgelabz.orderList_autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class CollegeApp {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		College c = context.getBean("collegeBean",College.class);
		c.displayList();
		((AbstractApplicationContext) context).close();
	}
}
