package com.imooc6;

/**
 * @author SDSC
 * @version 1.0
 * @created 15-Ê®¶þÔÂ-2016 13:46:49
 */
public class Truck extends Car {

	public Truck(String theName, double DailyRent, double theCargoCapacity) {
		this.setName(theName);
		this.setDailyRent(DailyRent);
		this.setPassagerCapacity(0);
		this.setCargoCapacity(theCargoCapacity);
	}

	
}