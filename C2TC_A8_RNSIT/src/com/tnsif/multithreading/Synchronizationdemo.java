package com.tnsif.multithreading;

public class Synchronizationdemo {
static float BALANCE=5000;
	public static void main(String[] args) {
		SavingsAccount sa1=new SavingsAccount();
		DepositeThread dt1=new DepositeThread(20000,sa1);
		DepositeThread dt2=new DepositeThread(30000,sa1);
		DepositeThread dt3=new DepositeThread(3000,sa1);
		
		dt1.start();
		dt2.start();
		dt3.start();
		
		try {
			dt1.join();
			dt2.join();
			dt3.join();
		}
		catch(Exception e)
		 {
			 System.out.println(e.getMessage());
		 }
		
		
		System.out.println("Total Balance "+BALANCE);
	}

}
