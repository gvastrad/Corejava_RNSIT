package com.tnsif.multithreading;

public class RunnableDemo {

	public static void main(String[] args) {
		UsingRunnable obj1=new UsingRunnable(2000,"FIRST");
		UsingRunnable obj2=new UsingRunnable(4000,"SECOND");
		
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		
		t1.start();
		t2.start();
		
		try {			
		t1.join();
		t2.join();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
System.out.println("In main Thread");
	}
	}


