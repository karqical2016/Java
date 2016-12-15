package com.imooc6;

/**
 * @author SDSC
 * @version 1.0
 * @created 15-Ê®¶þÔÂ-2016 13:46:49
 */
public class Pickup extends Car {

	
	public Pickup(String theName, double DailyRent, int thePassgerCarCapacity, double theCargoCapacity) {
		this.setName(theName);
		this.setDailyRent(DailyRent);
		this.setPassagerCapacity(thePassgerCarCapacity);
		this.setCargoCapacity(theCargoCapacity);
	}


}