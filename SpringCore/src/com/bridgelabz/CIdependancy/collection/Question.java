package com.bridgelabz.CIdependancy.collection;

import java.util.List;

public class Question {
	private String name;
	private List<String> answer;
	
	


	public Question() {
		System.out.println("Hi I am First");
	}

	public Question(String name) {
		this.name = name;
		System.out.println("I am String only");
	} 

	public Question(List<String> answer) {
		System.out.println("I am String only");
		this.answer = answer;
	}

	public Question(String name, List<String> answer) {
		this.name = name;
		this.answer = answer;
	}




	public void display()
	{
		int i =0;
		System.out.println("Question is : "+name);
		for(String s : answer)
		{
			i++;
			System.out.println(i+"."+s);
		}
	}
	
}
