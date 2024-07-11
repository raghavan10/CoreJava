package com.tnsif.polymorphismprog;

public class PolyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point pone = new Point();
		System.out.println(pone);
		Point ptwo = new Point(5,3);
		System.out.println(ptwo);
		main(54);
		
	}
	//main method can be overloaded
	public static void main(int arg) {
		System.out.println("hello"+arg);
	}

}
