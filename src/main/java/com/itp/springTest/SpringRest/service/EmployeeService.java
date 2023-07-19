package com.itp.springTest.SpringRest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.itp.springTest.SpringRest.entity.Employee;


public interface EmployeeService {

	public List<Employee> getEmps();
	
}
