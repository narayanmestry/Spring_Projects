package com.bridgelabz.SIdependancy.literal;

public class Address {
	private int pincode;
	private String City ;
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public void setCity(String city) {
		City = city;
	}
	
	public String toString()
	{
		return pincode+" "+City;
		
	}
}
