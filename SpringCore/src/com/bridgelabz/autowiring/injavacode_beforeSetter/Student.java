package com.bridgelabz.autowiring.injavacode_beforeSetter;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private String name;
	private Marklist marks;

	@Autowired 
	public void setName(String name) {
		this.name = name;
	}
	@Autowired
	public void setMarks(Marklist marks) {
		this.marks = marks;
	}

	public void display() {
		if(marks!=null)
		{
		System.out.println("Name :"+name);
		System.out.println("Marks :\n\t" + marks.toString());
		}
		else
		{
			System.out.println("Error ");
		}
	}

}
