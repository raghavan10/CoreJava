package com.tnsif.lambdaexp;
import java.util.*;
public class FindFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number:");
		int num = sc.nextInt();
		
		Factorial fact = (n)->{
			int f=1;
			for (int i =1;i<=num;i++) {
				f = f*i;
			}
			return f;
		};
		
		System.out.println(fact.cal(num));
		}

}
