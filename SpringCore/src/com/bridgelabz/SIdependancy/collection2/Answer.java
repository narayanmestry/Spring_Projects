package com.bridgelabz.SIdependancy.collection2;

public class Answer {
	private int id;
	private String ans;
	private String author;

	public void setId(int id) {
		this.id = id;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String toString() {
		return "Answer id is :" + id + "\nauthor name  :" + author+"\nAnswer : "+ans;

	}
}
