package com.bridgelabz.springioc;

public class Airtel implements Sim {

	// Constructor 
	public Airtel() {
	
	}
	
	@Override
	public void calling() {
		System.out.println("Calling Using Airtell mobile");
	}

	@Override
	public void data() {
		System.out.println("Brawsing Data Using Airtell mobile");
			
	}
	
}
