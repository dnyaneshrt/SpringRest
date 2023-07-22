package com.itp.springTest.SpringRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.itp.springTest.SpringRest.entity.Employee;
import com.itp.springTest.SpringRest.service.EmployeeService;

@RestController
public class Controller {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/sayhello/{name}")
	public String sayHello(@PathVariable String name)
	{
		return "Welcome Everyone in Spring REST:::"+name;
	}
	@GetMapping("/sayhello")
	public String sayHi()
	{
		return "Welcome Everyone in Spring REST:::";
	}
	@GetMapping("/getemployees")
	public List<Employee> getEmployees()
	{
		return employeeService.getEmps();
	}
	@GetMapping("/getemployeeByid/{empId}")
	public Employee getEmployeeById(@PathVariable int empId)
	{
		return employeeService.getEmpById(empId);
	}
	@PostMapping("/addemp")
	public List<Employee> addEmployee(@RequestBody Employee emmployee)
	{
		return employeeService.addEmployee(emmployee);
	}
	@PutMapping("/updateemp")
	public Employee updateEmployee(@RequestBody Employee employee)
	{
		return employeeService.updateEmployee(employee);
	}
}
