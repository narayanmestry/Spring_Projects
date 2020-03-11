package com.bridgelabz.CIdependancy.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExamCIDependantObject {
	public static void main(String[] args) {
		System.out.println("Constructor Injection with Non-String Collection (having Dependent Object) Example");
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Question q = context.getBean("q5",Question.class);
		q.display();
	}
}
