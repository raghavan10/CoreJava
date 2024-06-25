package com.ronit.assignment.utilities;
import com.ronit.assignment.employees.Employee;
public class EmployeeUtilities {
	
	public static void raisesal(Employee employee,int percentage) {
		int newSalary = employee.getSalary() + employee.getSalary() * (percentage/100);
		employee.setSalary(newSalary);
		
	}
	
	
	public static void printemp(Employee employee) {
		System.out.println("Name:"+ employee.getName());
		System.out.println("EmpID:"+ employee.getEmpid());
		System.out.println("Salary:"+ employee.getSalary());
	}
}
