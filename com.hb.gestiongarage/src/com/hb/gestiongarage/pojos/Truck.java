package com.hb.gestiongarage.pojos;

import java.time.LocalDate;

/**
 * truck POJO
 * @author elfindel69
 *
 */
public class Truck extends Vehicle {
	/**
	 * nb of axles
	 */
	private int nbAxles;
	
	/**
	 * cargo weight (kg)
	 */
	private double cargoWeight;
	
	/**
	 * cargo volume (m3)
	 */
	private double cargoVolume;
	
	/**
	 * getter nb of axles
	 * @return truck nb of axles
	 */
	public int getNbAxles() {
		return nbAxles;
	}
	
	/**
	 * setter nb of axles
	 * @param nbAxles new nb of axles
	 */
	public void setNbAxles(int nbAxles) {
		this.nbAxles = nbAxles;
	}

	/**
	 * getter cargo weight (kg)
	 * @return truck cargo weight
	 */
	public double getCargoWeight() {
		return cargoWeight;
	}
	
	/**
	 * setter cargo weight
	 * @param cargoWeight new cargo weight (kg)
	 */
	public void setCargoWeight(double cargoWeight) {
		this.cargoWeight = cargoWeight;
	}

	/**
	 * getter cargo volume (m3)
	 * @return truck cargo volume
	 */
	public double getCargoVolume() {
		return cargoVolume;
	}

	/**
	 * setter cargo volume
	 * @param cargoVolume new cargo volume (m3)
	 */
	public void setCargoVolume(double cargoVolume) {
		this.cargoVolume = cargoVolume;
	}

	/**
	 * default constructor
	 * generates truck id
	 */
	public Truck() {
		super();
	}
	
	/**
	 * parameter constructor
	 * @param name truck name
	 * @param price truck price
	 * @param brand truck brand
	 * @param engine truck engine
	 * @param regDate truck registration date
	 * @param nbAxles truck nb of axles
	 * @param cargoWeight truck cargo weight (kg)
	 * @param cargoVolume truck cargo volume (m3)
	 */
	public Truck(String name, double price, Brand brand, Engine engine,LocalDate regDate,
			int nbAxles, double cargoWeight, double cargoVolume) {
		super(name, price, brand, engine, regDate);
		this.nbAxles = nbAxles;
		this.cargoWeight = cargoWeight;
		this.cargoVolume = cargoVolume;
	}

	/**
	 * calculates the vehicle's taxes
	 * @return the calculated tax
	 */
	@Override
	public int calcTaxes() {
		return nbAxles * 50;
	}

	/**
	 * toString method
	 * returns the object arguments values
	 */
	@Override
	public String toString() {
		return "Truck: "+super.toString()+"\n nbAxles=" + nbAxles +
				",\n cargoWeight=" + cargoWeight + ",\n cargoVolume=" + cargoVolume + "]";
	}
	
	/**
	 *  show the truck arguments
	 */
	@Override
	public void showVehicle() {
		super.showVehicle();
		System.out.println(this);
	}
	

}
