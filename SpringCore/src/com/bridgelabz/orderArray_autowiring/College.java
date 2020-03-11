package com.bridgelabz.orderArray_autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class College {

	
	private String[] nameList;

	
	@Autowired
	public void setNameList(String[] nameList) {
		this.nameList = nameList;
	}



	public void displayList()
	{
		for(String s :nameList)
		{
			System.out.print(s+",");
		}
	}
	
}
