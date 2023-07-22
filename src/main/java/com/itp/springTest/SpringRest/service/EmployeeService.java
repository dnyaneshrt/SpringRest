package com.itp.springTest.SpringRest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.itp.springTest.SpringRest.entity.Employee;


public interface EmployeeService {

	public List<Employee> getEmps();
	
	public Employee getEmpById(int id);

	public List<Employee> addEmployee(Employee employee);

	public Employee updateEmployee(Employee employee);
}
