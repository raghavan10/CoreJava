package com.tnsif.collections;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList ob=new ArrayList();
//		System.out.println("the size of the arraylist"+ob.size());
//		ob.add(2);
//		ob.add('a');
//		ob.add(22.350);
//		System.out.println("the elements of the array are"+ob);
//		System.out.println("check the elements existence"+ob.contains(2));
//		System.out.println("remove the specified element from the list"+ob.remove(0));
//		System.out.println("the elements of the array are"+ob);
		
		ArrayList <String> ob=new ArrayList<String>();
		ob.add("bangalore");
		ob.add("mysore");
		ob.add("hubli");
		ob.add("karwar");
		System.out.println("the elements of the array are"+ob);
		Collections.sort(ob);
		System.out.println("the elements of the array are"+ob);
		
		for (int i=0;i<ob.size();i++) {
			System.out.println(ob);
		}
		
		Iterator<String> i= ob.iterator();
		while(i.hasNext()) {
			String nm = i.next();
			System.out.println(nm);
		}
	}

}
