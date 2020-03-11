package com.bridgelabz.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.main.dto.Employee;
import com.bridgelabz.main.service.IEmployeeService;

@RestController
public class EmployeeController {

//lkjsdojfdfsj
	@Autowired
	IEmployeeService empServiceRef;

	@RequestMapping(value ="/welcome")
	public String welcomeEmployeee() {
		return "Welcome!!!";
	}

	@RequestMapping("/employees")
	public List<Employee> getAllEmployee() {
		return empServiceRef.getEmployeeList();

	}

	@RequestMapping("/employees/id/{empId}")
	public Employee getEmployeeById(@PathVariable int empId) // @PathVariable check Url empId and Function parameter
																// empId and assign url empId value to function empId
	{
		return empServiceRef.getEmplyeeById(empId);
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/employees")
	public void createEmployee(@RequestBody Employee e)
	{
		empServiceRef.createEmployee(e);
		
	}
	
	
	@RequestMapping(method = RequestMethod.DELETE , value = "/employees/{empId}")
	public void deleteEmployeeById(@PathVariable int empId)
	{
		empServiceRef.deleteEmployeeById(empId);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/employees/{empId}")
	public void updateEmployee(@RequestBody Employee e , @PathVariable int empId)   // @RequestBody : convert the body of the HTTP request to the java class object 
	{
		empServiceRef.updateEmployeeById(e,empId);
	}
	
	@RequestMapping("/employees/city/{city}")
	public List<Employee> getEmployeeByCity(@PathVariable String  city)
	{
		return empServiceRef.getEmployeeListByCity(city);
		
	}
}
