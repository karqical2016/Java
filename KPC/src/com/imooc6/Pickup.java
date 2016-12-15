package com.imooc6;

/**
 * @author SDSC
 * @version 1.0
 * @created 15-Ê®¶þÔÂ-2016 13:46:49
 */
public class Pickup extends Car {

	public double cargoCapacity;
	public double dailyRent;
	public String name;
	public int passagerCapacity;

	public Pickup() {

	}

	/**
	 * 
	 * @param theName
	 * @param theRent
	 * @param thePassgerCarCapacity
	 */
	public Pickup(String theName, double theRent, int thePassgerCapacity, double theCargoCapacity) {
		this.name = theName;
		this.dailyRent = theRent;
		this.cargoCapacity = theCargoCapacity;
		this.passagerCapacity = thePassgerCapacity;
	}

	public double getCargoCapacity() {
		return this.cargoCapacity;
	}

	public double getDailyRent() {
		return this.dailyRent;
	}

	public String getName() {
		return this.name;
	}

	public int getPassagerCapacity() {
		return this.passagerCapacity;
	}

	/**
	 * 
	 * @param theCargoCapacity
	 */
	public void setCargoCapacity(double theCargoCapacity) {
		this.cargoCapacity = theCargoCapacity;
	}

	/**
	 * 
	 * @param theDailyRent
	 */
	public void setDailyRent(double theDailyRent) {
		this.dailyRent = theDailyRent;
	}

	/**
	 * 
	 * @param theName
	 */
	public void setName(String theName) {
		this.name = theName;
	}

	/**
	 * 
	 * @param thePassagerCapacity
	 */
	public void setPassagerCapacity(int thePassagerCapacity) {
		this.passagerCapacity = thePassagerCapacity;
	}

}