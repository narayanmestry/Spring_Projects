package com.bridgelabz.main.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.main.dto.Employee;

@Repository
public interface IEmployeeDAO extends JpaRepository<Employee, Integer>{
	

	List<Employee> findByCity(String city);

	Employee findAllById(int empId);
	 	


}
