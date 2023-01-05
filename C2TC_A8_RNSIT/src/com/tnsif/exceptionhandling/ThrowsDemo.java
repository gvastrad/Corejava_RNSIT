package com.tnsif.exceptionhandling;

import java.io.IOException;

public class ThrowsDemo {
	void m()throws IOException
	{
	throw new IOException("device error !");//checked exception
	}
	void n()throws IOException
	{
	m();
	}
	void p()
	{
	try
	{
	n();
	}
	catch(Exception e){
		System.out.println("exception handled");
		System.out.println(e.getMessage());
		}
	}
	public static void main(String args[])
	{
		ThrowsDemo obj=new ThrowsDemo();
	obj.p();
	System.out.println("normal flow...");
	}
	}


