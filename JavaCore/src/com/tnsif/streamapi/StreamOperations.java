package com.tnsif.streamapi;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//   using of method
		Stream<Integer> ob = Stream.of(10,20,30,40,50);
//		System.out.println(ob);
//		ob.forEach(System.out::println);
		
		Integer[] values= new Integer[] {2,3,4,5};
		ob=Arrays.stream(values);
		ob.forEach(System.out::println);
		
		
		Integer[] ele = new Integer[] {1,2,3,4,5}; // get input from arrays
		Stream<Integer> stream= Arrays.stream(ele);// create a stream using stream function
		
		//map function
		
		System.out.println("Square of a number:"+Arrays.toString(ele));
		stream.map(num->num*num).forEach(System.out::println);
		
		Integer[] eles = new Integer[] {1,2,3,4,5}; // get input from arrays
		Stream<Integer> streams= Arrays.stream(eles);
		
		System.out.println("even no.");
		streams.filter(val->val%2==0).forEach(System.out::println);
		
		System.out.println("limit operation");
		Integer[] valu= new Integer[] {1,2,3,4,4,5};
		Stream<Integer> streamobj = Arrays.stream(valu);
		
		System.out.println("skip 1st 2 elemensts");
		Arrays.stream(valu).skip(2).forEach(System.out::println);
		
		}

}
