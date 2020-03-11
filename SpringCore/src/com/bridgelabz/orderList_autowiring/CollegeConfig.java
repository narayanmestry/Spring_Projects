package com.bridgelabz.orderList_autowiring;

import java.util.Arrays;
import java.util.List;

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
	public List<String> nameList()
	{
		return Arrays.asList("Chetan","Ganesh","sahil","Hanumant");
		
	}
}
