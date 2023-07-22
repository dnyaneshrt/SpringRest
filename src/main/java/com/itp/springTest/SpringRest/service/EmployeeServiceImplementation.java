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
		list.add(new Employee(12, "ghanshyam", "Developer", "Mumbai"));
		list.add(new Employee(13, "manoj", "Tester", "latur"));
		list.add(new Employee(14, "neha", "Tester", "Mumbai"));
		
	}
	@Override
	public List<Employee> getEmps() {
		return list;
	}
	@Override
	public Employee getEmpById(int id) {
		Employee e=null;
		
		for(Employee emp:list)
		{
			if(emp.getEmpId()==id)
			{
				e=emp;
				break;
			}
		}
		return e;
	}
	@Override
	public List<Employee> addEmployee(Employee employee) {
		list.add(employee);
		return list;
	}
	
	@Override
	public Employee updateEmployee(Employee employee) {
	
		for(Employee emp:list)
		{
			if(emp.getEmpId()==employee.getEmpId())
			{
				emp.setEmpName(employee.getEmpName());
				emp.setEmpDesig(employee.getEmpDesig());
				emp.setEmpAddress(employee.getEmpAddress());
			}
		}
	return employee;
	}
}
