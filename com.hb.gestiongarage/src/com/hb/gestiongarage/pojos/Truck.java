package com.hb.gestiongarage.pojos;

import java.time.LocalDate;

public class Truck extends Vehicle {
	private int nbAxles;
	private double cargoWeight;
	private double cargoVolume;
	
	public int getNbAxles() {
		return nbAxles;
	}
	
	public void setNbAxles(int nbAxles) {
		this.nbAxles = nbAxles;
	}

	public double getCargoWeight() {
		return cargoWeight;
	}
	
	public void setCargoWeight(double cargoWeight) {
		this.cargoWeight = cargoWeight;
	}

	public double getCargoVolume() {
		return cargoVolume;
	}

	public void setCargoVolume(double cargoVolume) {
		this.cargoVolume = cargoVolume;
	}

	public Truck() {
		
	}
	
	public Truck(String name, double price, Brand brand, Engine engine,LocalDate immDate,
			int nbAxles, double cargoWeight, double cargoVolume) {
		super(name, price, brand, engine, immDate);
		this.nbAxles = nbAxles;
		this.cargoWeight = cargoWeight;
		this.cargoVolume = cargoVolume;
	}

	@Override
	public int calcTaxes() {
		return nbAxles * 50;
	}

	@Override
	public String toString() {
		return "Truck: "+super.toString()+"\n nbAxles=" + nbAxles +
				",\n cargoWeight=" + cargoWeight + ",\n cargoVolume=" + cargoVolume + "]";
	}
	
	public void showTruck() {
		super.showVehicle();
		System.out.println(this);
	}
	

}
