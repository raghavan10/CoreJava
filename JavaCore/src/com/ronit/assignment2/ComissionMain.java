package com.ronit.assignment2;

public class ComissionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comission obj=new Comission();
		obj.employee_details_entry();
		double commission = obj.calculate_commission();
		System.out.println("Commission is : "+commission);
	}

}
