package com.bridgelabz.SIdependancy.collection2;

import java.util.List;

public class Question {
	private String name;
	private List<Answer> answer;

	public void setName(String name) {
		this.name = name;
	}

	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}

	public void display() {
		System.out.println("Question is: " + name);
		for (Answer a : answer) {
			System.out.println(a.toString());
			System.out.println("------------------------------------------------");

		}
	}

}
