package com.tnsif.inheritance;

 class Bicycle {
	int speed;
	int gears;
	public Bicycle(int speed, int gears) {
		this.speed = speed;
		this.gears = gears;
	}	
	void applyBreak(int decrementValue)
	{
		this.speed-=decrementValue;
	}
	void accelerate(int incrementValue)
	{
		this.speed+=incrementValue;
	}
	@Override
	public String toString() {
		return "Bicycle [speed=" + speed + ", gears=" + gears + "]";
	}
}
class MountainBike extends Bicycle{
	int adjustableSeatHeight;

	public MountainBike(int speed, int gears, int adjustableSeatHeight) {

super(speed, gears);
		this.adjustableSeatHeight = adjustableSeatHeight;
	}

	@Override
	public String toString() {
		return "MountainBike [seatHeight=" + adjustableSeatHeight + ", speed=" + speed + ", gears=" + gears + "]";
	}	
}

class ElectricBike extends Bicycle{
	int batteryCapacity;
	int initialBatteryCapacity;
	
	public ElectricBike(int speed, int gears, int batteryCapacity, int initialBatteryCapacity) {
		super(speed, gears);
		this.batteryCapacity = batteryCapacity;
		this.initialBatteryCapacity = initialBatteryCapacity;
	}

	@Override
	public String toString() {
		return "ElectricBike [batteryCapacity=" + batteryCapacity + ", initialBatteryCapacity=" + initialBatteryCapacity
				+ ", speed=" + speed + ", gears=" + gears + "]";
	}
}