package com.tnsif.basics;

   class Citizen {
	String name;
	int uniqueId;
	int age;
	String address;
	String country;
	
	void doVote() {
		System.out.println(name+" is an "+country+"n "+" an eligible candidate for voting ");
	}
}
