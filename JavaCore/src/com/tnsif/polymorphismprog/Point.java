// program to demonstrate constructor overloading

package com.tnsif.polymorphismprog;

public class Point {
	private float x,y;
	public Point() {
		x=0.0f;
		y=0.0f;
	}
	
	public Point(float x) {
		this.x=x;
	}
	
	public Point(float x,float y) {
		this.x=x;
		this.y=y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}
