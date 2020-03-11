package com.bridgelabz.CIdependancy.dependantObject;


public class Employee {
	
	private int id;
	private String name ;
	private Address address ;
	
	
	public Employee(int id, String name, Address address) {
	
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public void display()
	{
		System.out.println("id :"+id);
		System.out.println("name :"+name);
		System.out.println("Address :"+address.toString());
	}
	
}
