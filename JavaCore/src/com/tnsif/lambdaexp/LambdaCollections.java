package com.tnsif.lambdaexp;

import java.util.ArrayList;

public class LambdaCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> li=new ArrayList<>();
		li.add(22);
		li.add(36);
		li.add(44);
		li.forEach(c->System.out.println(c)); // using lambda
//		for(Integer number:li) {    without using lambda
//			System.out.println(number);
//		}
	}

}
