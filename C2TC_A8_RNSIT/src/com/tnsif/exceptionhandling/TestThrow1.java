package com.tnsif.exceptionhandling;

public class TestThrow1
{
static void validate(int age)
{
if(age<18)
throw new ArithmeticException("not valid");
else
System.out.println("welcome to vote");
}
public static void main(String args[])
{
	try {
validate(17);
	}
	catch(Exception ex)
	{
	System.out.println(ex.getMessage());
	}
System.out.println("rest of the code...");
}
}
