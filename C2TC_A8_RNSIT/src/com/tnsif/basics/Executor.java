package com.tnsif.basics;

public class Executor {

	public static void main(String[] args) {
		Citizen one=new Citizen();
        one.name="Gayatri";
        one.uniqueId=1234567;
        one.age=28;
        one.address="Bangalore";
        one.country="India"; 
        one.doVote();
        
        Citizen two=new Citizen();
        two.name="Meena";
        two.uniqueId=76589;
        two.age=21;
        two.address="Chennai";
        two.country="India";
        
        two.doVote();
        
	}
}
