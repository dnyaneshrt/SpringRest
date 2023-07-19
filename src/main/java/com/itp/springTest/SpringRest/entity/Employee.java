package com.itp.springTest.SpringRest.entity;

public class Employee {

	private int empId;
	private String empName;
	private String empDesig;
	private String empAddress;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDesig() {
		return empDesig;
	}
	public void setEmpDesig(String empDesig) {
		this.empDesig = empDesig;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empName, String empDesig, String empAddress) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDesig = empDesig;
		this.empAddress = empAddress;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDesig=" + empDesig + ", empAddress="
				+ empAddress + "]";
	}
	
}
