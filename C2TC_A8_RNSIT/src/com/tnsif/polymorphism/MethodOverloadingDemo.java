package com.tnsif.polymorphism;

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		Math obj=new Math();
		System.out.println("The sum is :"+obj.add(10, 10));
		System.out.println("The sum is :"+obj.add(10.34f, 10));
		System.out.println("The sum is :"+obj.add(3.4f, 10.7f));
		System.out.println("The sum is :"+obj.add(10, 6.8f));
	}
}
