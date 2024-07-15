package com.tnsif.threads;

public class FirstWay extends Thread{
	
	public void run() {
		System.out.println("creation of thread by extending the thread class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstWay ob=new FirstWay();// thread is born - new state
		//ob.stop();
		ob.start();// runnable
		ob.stop();
		ob.start();
	}

}
