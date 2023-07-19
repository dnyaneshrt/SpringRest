package com.itp.springTest.SpringRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.itp.springTest.SpringRest.entity.Employee;
import com.itp.springTest.SpringRest.service.EmployeeServiceImplementation;

@RestController
public class Controller {
	
	@Autowired
	EmployeeServiceImplementation employeeServiceImplementation;
	
	@GetMapping("/sayhello/{name}")
	public String sayHello(@PathVariable String name)
	{
		return "Welcome Everyone in Spring REST:::"+name;
	}
 
	@GetMapping("/getemployee")
	public List<Employee> getEmployees()
	{
		return this.employeeServiceImplementation.getEmps();
	}
	
}
