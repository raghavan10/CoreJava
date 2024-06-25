package com.ronit.assignment;
import com.ronit.assignment.employees.Developer;
import com.ronit.assignment.employees.Manager;
import com.ronit.assignment.utilities.EmployeeUtilities;

public class AssignmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager = new Manager("Rohan",201,90000,"HR");
		Developer developer = new Developer("Rahul",202,75000,"Analysis");
		
		System.out.println("Before Salary Increase:");
        EmployeeUtilities.printemp(manager);
        EmployeeUtilities.printemp(developer);

        EmployeeUtilities.raisesal(manager, 10);
        EmployeeUtilities.raisesal(developer, 15);

        System.out.println("\nAfter Salary Increase:");
        EmployeeUtilities.printemp(manager);
        EmployeeUtilities.printemp(developer);
	}

}
