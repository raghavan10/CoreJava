package com.tnsif.generics;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generic <String> strobj=new Generic();
		strobj.setData("hello");
		System.out.println("the string object"+strobj.getData());
		
		Generic <Integer> intobj=new Generic();
		intobj.setData(454);
		System.out.println("the integer object"+intobj.getData());
		
		Generic <Double> doubobj=new Generic();
		doubobj.setData(2326.1541);
		System.out.println("the double object"+doubobj.getData());
	}

}
