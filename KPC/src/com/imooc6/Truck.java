package com.imooc6;


public class Truck extends Car {
	public Truck(String theName, double DailyRent, double theCargoCapacity) {
		this.setName(theName);
		this.setDailyRent(DailyRent);
		this.setPassagerCapacity(0);
		this.setCargoCapacity(theCargoCapacity);
	}

	
}