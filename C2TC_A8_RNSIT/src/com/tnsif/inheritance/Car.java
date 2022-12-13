package com.tnsif.inheritance;

public class Car
{
static final String type="4 wheeler";
int speed;
}

class Maruti extends Car
{
	String brand="Maruti";
}

class Maruti800 extends Maruti
{
	String name="Maruti800";
	void information()
	{
		super.speed=120;
		System.out.println("The vehicle type is "+type);
		System.out.println("The vehicle speed is "+speed);
		System.out.println("The vehicle brand is "+brand);
		System.out.println("The vehicle model is "+name);
	}
}
