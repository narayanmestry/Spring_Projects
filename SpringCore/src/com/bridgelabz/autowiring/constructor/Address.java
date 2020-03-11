package com.bridgelabz.autowiring.constructor;

public class Address {
	private int pincode;
	private String city;


	public Address(int pincode, String city) {

		this.pincode = pincode;
		this.city = city;
	}

	
	public String toString() {
		return "Pincode : " + pincode + "\n" + "City : " + city;
	}
}
