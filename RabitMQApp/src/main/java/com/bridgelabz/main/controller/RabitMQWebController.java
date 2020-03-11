package com.bridgelabz.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.main.model.Employee;
import com.bridgelabz.main.service.RabitMQSender;

@RestController
@RequestMapping(value = "/rabbitmq")
public class RabitMQWebController {

		@Autowired
		RabitMQSender rabitmqsender;
		
		@PostMapping("/register")
		public String Register(@RequestParam("empId") String empId,@RequestParam("empName") String empName)
		{
			Employee e = new Employee();
			e.setEmpId(empId);
			e.setEmpName(empName);
			rabitmqsender.send(e);
			
			return "Message Sent Successfully............";
			
			
		}
			
}
