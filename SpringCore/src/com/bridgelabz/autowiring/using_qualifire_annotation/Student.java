package com.bridgelabz.autowiring.using_qualifire_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	String name;
	Marklist marks;

	@Autowired
	@Qualifier("hindimarks")
	public void setName(String name) {
		this.name = name;
	}

	@Autowired
	@Qualifier("hindimarks")
	public void setMarks(Marklist marks) {
		this.marks = marks;
	}

	public void display() {
		System.out.println("Marks :\n\t" + marks.toString());
	}

}
