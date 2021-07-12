package com.hb.gestiongarage.pojos;

import java.time.LocalDate;

/**
 * car POJO
 * @author elfindel69
 *
 */
public class Car extends Vehicle {
	
	/**
	 * fiscal power
	 */
	private int fiscalPower;
	
	/**
	 * number of doors
	 */
	private int nbDoors;
	
	/**
	 * number of seats
	 */
	private int nbSeats;
	
	/**
	 * booth size (L)
	 */
	private double boothSize;
	
	
	/**
	 * getter fiscal power
	 * @return car fiscal power
	 */
	public int getFiscalPower() {
		return fiscalPower;
	}

	/**
	 * setter fiscal power
	 * @param fiscalPower new fiscal power
	 */
	public void setFiscalPower(int fiscalPower) {
		this.fiscalPower = fiscalPower;
	}

	/**
	 * getter nb of doors
	 * @return car nb of doors
	 */
	public int getNbDoors() {
		return nbDoors;
	}

	/**
	 * setter nb of doors
	 * @param nbDoors new nb of doors
	 */
	public void setNbDoors(int nbDoors) {
		this.nbDoors = nbDoors;
	}

	/**
	 * getter nb of seats
	 * @return car nb of seats
	 */
	public int getNbSeats() {
		return nbSeats;
	}

	/**
	 * setter nb of seats
	 * @param nbSeats new nb of seats
	 */
	public void setNbSeats(int nbSeats) {
		this.nbSeats = nbSeats;
	}

	/**
	 * getter booth size (L)
	 * @return car booth size
	 */
	public double getBoothSize() {
		return boothSize;
	}

	/**
	 * setter booth size
	 * @param boothSize new booth size
	 */
	public void setBoothSize(double boothSize) {
		this.boothSize = boothSize;
	}
	
	/**
	 * default constructor
	 * generates car id
	 */
	public Car() {
		super();
	}

	/**
	 * parameter constructor
	 * @param name car name 
	 * @param price car price
	 * @param brand car brand
	 * @param engine car engine
	 * @param regDate car registration date
	 * @param fiscalPower car fiscal power
	 * @param nbDoors car nb of doors
	 * @param nbSeats car nb of seats
	 * @param boothSize car booth size (L)
	 */
	public Car(String name, double price, Brand brand, Engine engine,LocalDate regDate,
			int fiscalPower, int nbDoors, int nbSeats, double boothSize) {
		super(name, price, brand, engine, regDate);
		this.fiscalPower = fiscalPower;
		this.nbDoors = nbDoors;
		this.nbSeats = nbSeats;
		this.boothSize = boothSize;
	}
	
	
	/**
	 * toString method
	 * returns the object arguments values
	 */
	@Override
	public String toString() {
		
		return "Car: "+super.toString()+"\n horsePower=" + fiscalPower + ",\n nbDoors=" + nbDoors + ",\n nbSeats=" + nbSeats +
				",\n boothSize="+ boothSize+"]";
	}

	/**
	 * calculates the vehicle's taxes
	 * @return the calculated tax
	 */
	@Override
	public int calcTaxes() {
		return fiscalPower*10;
	}

	/**
	 * show the car arguments
	 */
	@Override
	public void showVehicle() {
		super.showVehicle();
		System.out.println(this);
	}
}
