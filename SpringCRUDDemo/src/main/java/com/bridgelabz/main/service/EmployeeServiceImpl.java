package com.bridgelabz.main.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.main.dao.IEmployeeDAO;
import com.bridgelabz.main.dto.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	static List<Employee> elist =new ArrayList<>(Arrays.asList(
			 new Employee(1,"Chetan","Pune",1200000.33),
			 new Employee(2,"Vishu","Mumbai",123000.33)
			 ));

	@Autowired
	private IEmployeeDAO  empDaoRef;
	
	
	
	
	@Override
	public List<Employee> getEmployeeList() {	
//		return elist;
		return empDaoRef.findAll();
	}

	@Override
	public Employee getEmplyeeById(int empId) {
//		return elist.stream().filter(e -> e.getId()==empId).findFirst().get(); 	
		//stream() : Process the Collection Object 
		//filter :  filter stream elements on the basis of given predicate.
		// e -> e.getId()==empId : predicate 

		return empDaoRef.findById(empId).get();
				
	}

	@Override
	public void createEmployee(Employee employee) {
//		   elist.add(employee);
		empDaoRef.save(employee);
	}


	@Override
	public void deleteEmployeeById(int empId) {
		
//		elist.removeIf(e->e.getId()==empId);
		
		/*
		 * for(Employee e : elist) { if(e.getId()==empId) { elist.remove(empId); break;
		 * } }
		 */
		
		empDaoRef.deleteById(empId)	;
	}

	@Override
	public Employee updateEmployeeById(Employee employee, int empId) {
		/*for(int i =0 ; i<elist.size();i++)
		{
			Employee emp = elist.get(i);
			if(emp.getId()==empId)
			{
				elist.set(i,employee);
				return;
			}
		}*/
		return empDaoRef.findById(empId).map(r-> 
		{
			r.setId(r.getId());
			r.setName(employee.getName());
			r.setCity(employee.getCity());
			r.setSalary(employee.getSalary());
			return empDaoRef.save(r);
		}).orElseGet(() -> {
            employee.setId(empId);
            return empDaoRef.save(employee);
        });
				
//		
//		System.out.println("Id :"+r.getId()+"==>"+employee.getId() );
//		System.out.println("name :"+r.getName()+"==>"+employee.getName());
//		System.out.println("city :"+r.getCity()+"==>"+employee.getCity());
//		System.out.println("Salary :"+r.getSalary()+"==>"+employee.getSalary();

					
	}


	@Override
	public List<Employee> getEmployeeListByCity(String city) {
		return empDaoRef.findByCity(city);
	}
	
	
	
	
	 
	 
}
