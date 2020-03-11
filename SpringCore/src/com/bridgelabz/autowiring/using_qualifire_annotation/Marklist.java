package com.bridgelabz.autowiring.using_qualifire_annotation;

public class Marklist {
	private String sname;
	private String smarks;
 
	public void setSname(String sname) {
		this.sname = sname;
	}

	public void setSmarks(String smarks) {
		this.smarks = smarks;
	}

	public String toString() {
		return "Subject name : " + sname + "\n\t" + "Subject marks :" + smarks;

	}

}
