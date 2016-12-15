package com.imooc6;

/**
 * @author SDSC
 * @version 1.0
 * @created 15-Ê®¶şÔÂ-2016 13:46:49
 */
public class PassagerCar extends Car {


	public PassagerCar(String theName, int thePassgerCarCapacity, double DailyRent) {
		this.setName(theName);
		this.setDailyRent(DailyRent);
		this.setPassagerCapacity(thePassgerCarCapacity);
		this.setCargoCapacity(0.0);
	}

	

}