package com.tnsif.generics;

import java.util.ArrayList;

public class GenericsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		//ArrayList <String>list = new ArrayList<String>();//if used generics we get error in compiletime
		list.add("JAVA");
		list.add(132); // compile time error
		for (Object object:list) {
			String str=(String) object;
			System.out.println(str);
		}
	}

}
