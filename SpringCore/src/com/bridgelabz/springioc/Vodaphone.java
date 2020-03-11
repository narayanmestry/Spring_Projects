package com.bridgelabz.springioc;

public class Vodaphone implements Sim {

	public Vodaphone() {
		System.out.println("I am vodaphone");
	}
	@Override
	public void calling() {
		System.out.println("Calling Using Vodaphone mobile");
	}

	@Override
	public void data() {
		System.out.println("Brawsing Data Using Vodaphone mobile");
			
	}
	
}
