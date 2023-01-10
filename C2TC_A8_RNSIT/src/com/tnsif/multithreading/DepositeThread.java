package com.tnsif.multithreading;

public class DepositeThread extends Thread {

	int amt;
	SavingsAccount obj;
	
	public DepositeThread(int amt, SavingsAccount obj) {
		this.amt = amt;
		this.obj = obj;
	}

	@Override
	public void run() {
		try {
			 Thread.sleep(2000);
		 }
		 catch(Exception e)
		 {
			 System.out.println(e.getMessage());
		 }
		obj.deposite(amt);
		
	}
	
	
}
