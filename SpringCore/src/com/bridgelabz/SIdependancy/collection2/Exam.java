package com.bridgelabz.SIdependancy.collection2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Question q = context.getBean("q2",Question.class);
		q.display();
	}
}
