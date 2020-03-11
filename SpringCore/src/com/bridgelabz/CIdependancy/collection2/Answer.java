package com.bridgelabz.CIdependancy.collection2;

public class Answer {
	private int id;
	private String ans;
	private String author;

	

	public Answer(int id, String ans, String author) {
		
		this.id = id;
		this.ans = ans;
		this.author = author;
	}



	public String toString() {
		return "Answer id is :" + id + "\nauthor name  :" + author+"\nAnswer : "+ans;

	}
}
