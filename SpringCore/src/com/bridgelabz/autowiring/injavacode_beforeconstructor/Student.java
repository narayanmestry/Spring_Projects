package com.bridgelabz.autowiring.injavacode_beforeconstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Student {

	private Marklist marks;

	public Student() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
	public Student(Marklist marks) {
		super();
	
		this.marks = marks;
	}
	

	/*
	 * public void setMarks(Marklist marks) { this.marks = marks;
	 * System.out.println("Setter called"); }
	 */

	public void display()
	{
		System.out.println("Marks :\n\t"+marks.toString());
	}
	
}
