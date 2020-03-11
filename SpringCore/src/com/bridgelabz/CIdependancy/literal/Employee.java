package com.bridgelabz.CIdependancy.literal;

public class Employee {
	private int id;
	private String name;

	
	
	public Employee() {
		System.out.println("I am Default");
	}
	
	public Employee(int id) {
		System.out.println("I am int");
		this.id = id;
	}
	
	public Employee(String name) {
		System.out.println("I am String");
		this.name = name;
	}
	
	public Employee(int id, String name) {
		System.out.println("I am Both");
		this.id = id;
		this.name = name;
	}



	public void Display()
	{
		System.out.println("Id  :"+id);
		System.out.println("Name  :"+name);
		
	}
}
