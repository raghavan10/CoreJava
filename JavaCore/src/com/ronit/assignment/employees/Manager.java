package com.ronit.assignment.employees;

public class Manager extends Employee{
	private String department;
	
	// Constructor
	public Manager(String name,int empid,int salary,String department) {
		super(name,empid,salary);
		this.department = department;
		
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
}
