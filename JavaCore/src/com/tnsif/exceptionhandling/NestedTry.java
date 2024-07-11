package com.tnsif.exceptionhandling;

public class NestedTry {

	public static void check() {
		String str="tns";
		int arr[] = null;
		int y=6;
		try {// outer try
			//int z=y/0;// exception raised in outer try block
			try {//inner try
				//System.out.println(arr[0]);
				System.out.println(str.charAt(y));
			}
//			catch(StringIndexOutOfBoundsException e) {//inner catch
//				System.out.println("exception caught"+e.getMessage());
//			}
			catch(NullPointerException e) {//inner catch
				System.out.println("exception caught"+e.getMessage());
			}
		}
		catch(ArithmeticException e) {// outer catch
			System.out.println("Exception caught"+e.getMessage());
		}
		

	}

}
