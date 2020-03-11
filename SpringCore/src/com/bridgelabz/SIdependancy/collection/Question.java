package com.bridgelabz.SIdependancy.collection;

import java.util.List;

public class Question {
	private String name;
	private List<String> answer;
	
	
	
	public void setName(String name) {
		this.name = name;
	}



	public void setAnswer(List<String> answer) {
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
