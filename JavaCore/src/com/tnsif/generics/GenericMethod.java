package com.tnsif.generics;

public class GenericMethod {
	public<T>void displayArrayELements(T[] elements){  //generic method
		for(T ele:elements) {
			System.out.println("elements is"+ele);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericMethod obj = new GenericMethod();
		Integer[] intarr= {10,20,30};
		
		String[] strarr = {"hello","hi","bye"};
		obj.displayArrayELements(intarr);
		obj.displayArrayELements(strarr);
	}

}
