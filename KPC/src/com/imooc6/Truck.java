package com.imooc6;

/**
 * @author SDSC
 * @version 1.0
 * @created 15-Ê®¶þÔÂ-2016 13:46:49
 */
public class Truck extends Car {

	public double cargoCapacity;
	public double dailyRent;
	public String name;
	public int passagerCapacity;

	/**
	 * 
	 * @param theName
	 * @param theRent
	 * @param thePassgerCapacity
	 * @param theCargoCapacity
	 */
	public Truck(String theName, double theRent, double theCargoCapacity) {
		this.name = theName;
		this.dailyRent = theRent;
		this.passagerCapacity = 0;
		this.cargoCapacity = theCargoCapacity;
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