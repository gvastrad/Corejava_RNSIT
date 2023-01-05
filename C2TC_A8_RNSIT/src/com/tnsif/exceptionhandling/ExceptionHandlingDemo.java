package com.tnsif.exceptionhandling;

public class ExceptionHandlingDemo {

	public static void main (String[] args)
	{
	// array of size 4.
	int[] arr = new int[4];
	int i=0;
	arr[3]=56;
	try
	{
	 i = arr[3];
	// this statement will never execute
	// as exception is raised by above statement
	System.out.println("Inside try block");
	}
	
	finally // always executed
	{
	System.out.println("finally block executed");
	}
	// rest program will be executed
	System.out.println("Outside try-catch-finally clause");
	System.out.println("Val;ue of i is "+i);
	}
	}

