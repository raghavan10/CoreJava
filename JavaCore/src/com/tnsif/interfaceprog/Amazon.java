//program to demonstrate interface

package com.tnsif.interfaceprog;

public interface Amazon {
	int a=10;
	void welcome(); //abstract methods
	void thankyou(); //abstract methods
	
	default void servicecharge() {
		int amt = 100;
		System.out.println("the service charge is"+amt);
	}
	static void aboutUs() {
		System.out.println("its a ecommerce website");
	}
}
