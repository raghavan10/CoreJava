package com.tnsif.encapsulationprogram;

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation ob = new Encapsulation();
//		ob.name="Ronit";
//		ob.age=33;
//		ob.serialNum=21;
		
		ob.setAge(21);
		ob.setName("Ronit");
		ob.setSerialNum(55);
		System.out.println(ob);

	}
     
}
