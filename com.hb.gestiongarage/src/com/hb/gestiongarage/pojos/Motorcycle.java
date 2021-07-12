package com.hb.gestiongarage.pojos;

import java.time.LocalDate;

/**
 * motorcycle POJO
 * @author elfindel69
 *
 */
public class Motorcycle extends Vehicle {
	
	/**
	 * motorcycle cylinders (cc)
	 */
	private int cylinders;
	
	/**
	 * getter cylinders (cc)
	 * @return motorcycle cylinders
	 */
	public int getCylinders() {
		return cylinders;
	}
	
	/**
	 * setter cylinders
	 * @param cylinders new motorcycle cylinders (cc)
	 */
	public void setCylinders(int cylinders) {
		this.cylinders = cylinders;
	}

	/**
	 * default constructor
	 * generates motorcycle id
	 */
	public Motorcycle() {
		super();
	}
	
	/**
	 * parameter constructor
	 * @param name motorcycle name
	 * @param price motorcycle price
	 * @param brand motorcycle brand
	 * @param engine motorcycle engine
	 * @param regDate motorcycle registration date
	 * @param cylinders motorcycle cylinders (cc)
	 */
	public Motorcycle(String name, double price, Brand brand, Engine engine, LocalDate regDate, int cylinders) {
		super(name, price, brand, engine, regDate);
		this.cylinders = cylinders;
	}

	/**
	 * calculates the vehicle's taxes
	 * @return the calculated tax
	 */
	@Override
	public int calcTaxes() {
		return (int) (cylinders* 0.3);
	}

	/**
	 * toString method
	 * returns the object arguments values
	 */
	@Override
	public String toString() {
		return "Motorcycle: "+super.toString()+"\n cylinders=" + cylinders + "]";
	}
	
	/**
	 * show the vehicle arguments
	 */
	@Override
	public void showVehicle() {
		super.showVehicle();
		System.out.println(this);
	}
	
	

}
