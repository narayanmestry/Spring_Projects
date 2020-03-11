package com.bridgelabz.main.service;

import java.util.List;

import com.bridgelabz.main.dto.Employee;

public interface IEmployeeService {
	List<Employee> getEmployeeList();
	
	Employee getEmplyeeById(int empId);

	void createEmployee(Employee e);

	void deleteEmployeeById(int empId);

	Employee updateEmployeeById(Employee e, int empId);

	List<Employee> getEmployeeListByCity(String city);

	
}
 