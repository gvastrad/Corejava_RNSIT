package com.tnsif.multithreading;

public class SavingsAccount {
	float bal;
synchronized void deposite(int amt)
{
	bal=getBal();
	System.out.println("Initial Balance in the Acoount is "+bal);
	if(amt>25000)
	{
		System.out.println("Daily limit exceeded");
	}
	else
	bal=bal+amt;
	setBal(bal);
}
 float getBal() {
	return Synchronizationdemo.BALANCE;
	
}
 void setBal(float amt) {
	 try {
		 Thread.sleep(2000);
	 }
	 catch(Exception e)
	 {
		 System.out.println(e.getMessage());
	 }
 
	 Synchronizationdemo.BALANCE=amt;
	
}
}
