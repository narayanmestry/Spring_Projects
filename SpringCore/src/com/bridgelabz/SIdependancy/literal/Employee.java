package com.bridgelabz.SIdependancy.literal;

public class Employee {
	private int id;				//Primitive value for dependancy Injection 
	private String ename ; 		// Primitive as well as String Based Value for Dependancy Injection
	
	private Address address;		// address is a Dependant Object 
	
 

	public void setId(int id) {
		this.id = id;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	
	
	
	public void setAddress(Address address) {
		this.address = address;
	}

	public void display()
	{
		System.out.println("Student name is : "+ename+" and Id is "+id);
		System.out.println("Address is :"+address.toString());
	}
	
}
