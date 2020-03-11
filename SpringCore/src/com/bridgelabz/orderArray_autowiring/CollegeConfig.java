package com.bridgelabz.orderArray_autowiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class CollegeConfig {
	
	@Bean
	public College collegeBean()
	{
		College c = new College();
		return c;
		
	}
	@Bean
	public String[] nameList()
	{
		return new String[] {"Chetan","Ganesh","sahil","Hanumant"};
		
	}
}
