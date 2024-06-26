// program to demonstrate constructor

package com.tnsif.constructor;

public class Customer {

	private int id;
	private String name;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Customer() {
		super();
		System.out.println("----default constructor----");
	}


	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	

}
