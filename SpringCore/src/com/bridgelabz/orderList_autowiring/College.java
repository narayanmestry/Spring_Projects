package com.bridgelabz.orderList_autowiring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class College {

	@Autowired
	private List<String> nameList;
	
	public void displayList()
	{
		System.out.println(nameList);
	}
	
}
