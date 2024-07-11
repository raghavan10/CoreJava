// program to demonstrate try multiple catch block

package com.tnsif.exceptionhandling;

public class WithoutException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d =0;
		try {
		int a = 42/d;	//exception is raised
		}
		catch(ArithmeticException e) {
			System.out.println("Exception handled successfully"+e.getMessage());
		}
		System.out.println("Will not be printed");
	}

}
