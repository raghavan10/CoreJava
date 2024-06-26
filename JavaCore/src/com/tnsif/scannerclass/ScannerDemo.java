// program to demonstrate scanner class
package com.tnsif.scannerclass;
import java.util.Scanner;
public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		System.out.println("ENter the customer name:");
		String name = ob.nextLine();
		System.out.println("ENter the source name:");
		String source = ob.nextLine();
		System.out.println("ENter the destination name:");
		String destination = ob.nextLine();
		
		System.out.println("Dear "+name+" welcome onboard with service from \n"+source+" to "+destination+"Thank you for\r\n"
				+ "choosing Sky Airlines. Enjoy your flight.");
		}

}
