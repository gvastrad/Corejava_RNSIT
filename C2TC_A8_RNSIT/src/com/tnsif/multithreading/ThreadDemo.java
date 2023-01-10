package com.tnsif.multithreading;

public class ThreadDemo {
	public static void main(String[] args) {
		ChildThread ct1=new ChildThread(2000,"First");
		ChildThread ct2=new ChildThread(3000,"Second");
		
		ct1.start();
		ct2.start();
		
		try {			
		ct1.join();
		ct1.join();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
System.out.println("In main Thread");
	}
}
