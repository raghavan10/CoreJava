package com.tnsif.threads;

public class SecondWay implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondWay t=new SecondWay();
		Thread th=new Thread(t);
		th.start();// runnable
		//th.start();// illegal thread state exception
		th.run();
	}
	public void run() {
		System.out.println("creation of thread by extending the thread class");
	}
}
