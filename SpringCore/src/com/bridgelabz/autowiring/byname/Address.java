package com.bridgelabz.autowiring.byname;

public class Address {
	private int pincode;
	private String city;

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String toString()
	{
		return "Pincode : "+pincode+"\n"
				+"City : "+city;
	}
}
