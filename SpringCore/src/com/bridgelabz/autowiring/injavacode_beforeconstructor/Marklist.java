package com.bridgelabz.autowiring.injavacode_beforeconstructor;

import org.springframework.beans.factory.annotation.Value;

public class Marklist {
	private String sname ;
	private String smarks; 
	
	public Marklist() {
		// TODO Auto-generated constructor stub
	}

	public Marklist(String sname, String smarks) {
		super();
		this.sname = sname;
		this.smarks = smarks;
		

	}

	
	public void setSname(String sname) {
		this.sname = sname;
	
	}

	public void setSmarks(String smarks) {
		this.smarks = smarks;
		

	}

	public String toString()
	{
		return "Subject name : "+sname+"\n\t"
				+ "Subject marks :"+smarks;
		
		
	}
		
} 
