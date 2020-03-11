package com.bridgelabz.autowiring.byname;

public class Employee {
	private int id;
	private String name;

	private Address address;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(Address addr) {
		this.address = addr;
	}

	public void display()
	{
		System.out.println("Id is :"+id);
		System.out.println("Name is :"+name);
		System.out.println("Address is :"+address.toString());
		
	}
	
}
