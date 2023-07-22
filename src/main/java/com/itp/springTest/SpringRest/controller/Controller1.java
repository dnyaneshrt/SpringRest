
package com.itp.springTest.SpringRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itp.springTest.SpringRest.entity.Employee;
import com.itp.springTest.SpringRest.service.EmployeeService;

@RestController
public class Controller1 {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/sayhello1/{name}")
	public String sayHello1(@PathVariable String name)
	{
		return "Welcome Everyone in Spring REST second controller:::"+name;
	}
	@GetMapping("/sayhello1")
	public String sayHi1()
	{
		return "Welcome Everyone in Spring REST:::";
	}
	@PostMapping("/sayhello1")
	public String sayBy()
	{
		return "Welcome Everyone in Spring REST:::";
	}
 
	@GetMapping("/getemployees1")
	public List<Employee> getEmployees1()
	{
		return employeeService.getEmps();
	}
	
}
