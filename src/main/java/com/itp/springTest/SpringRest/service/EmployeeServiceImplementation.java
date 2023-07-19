package com.itp.springTest.SpringRest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.itp.springTest.SpringRest.entity.Employee;

@Service
public class EmployeeServiceImplementation implements EmployeeService{

	List<Employee> list=null;
	
	EmployeeServiceImplementation()
	{
		list=new ArrayList<>();
		list.add(new Employee(11, "Akshay", "Developer", "Pune"));
		
	}
	@Override
	public List<Employee> getEmps() {
		return list;
	}

}
