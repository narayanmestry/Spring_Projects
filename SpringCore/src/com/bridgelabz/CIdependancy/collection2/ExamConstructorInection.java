package com.bridgelabz.CIdependancy.collection2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExamConstructorInection {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Question q = context.getBean("q6",Question.class);
		q.display();
	}
}
