package com.bridgelabz.CIdependancy.collection2;

import java.util.List;

public class Question {
	private String name;
	private List<Answer> answer;

	public Question() {
		System.out.println("SSSS");
	}
	public Question(String name) {
		this.name = name;
		
	}
	public Question(List<Answer> answer) {
		this.answer = answer;
	}
	public Question(String name, List<Answer> answer) {
		this.name = name;
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
