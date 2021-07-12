package com.hb.gestiongarage.pojos;

import java.time.LocalDate;

public class Car extends Vehicle {
	
	private int horsePower;
	private int nbDoors;
	private int nbSeats;
	private double boothSize;
	
	

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public int getNbDoors() {
		return nbDoors;
	}

	public void setNbDoors(int nbDoors) {
		this.nbDoors = nbDoors;
	}

	public int getNbSeats() {
		return nbSeats;
	}

	public void setNbSeats(int nbSeats) {
		this.nbSeats = nbSeats;
	}

	public double getBoothSize() {
		return boothSize;
	}

	public void setBoothSize(double boothSize) {
		this.boothSize = boothSize;
	}
	
	public Car() {
		super();
	}

	public Car(String name, double price, Brand brand, Engine engine,LocalDate immDate,
			int horsePower, int nbDoors, int nbSeats, double boothSize) {
		super(name, price, brand, engine, immDate);
		this.horsePower = horsePower;
		this.nbDoors = nbDoors;
		this.nbSeats = nbSeats;
		this.boothSize = boothSize;
	}
	
	

	@Override
	public String toString() {
		
		return "Car: "+super.toString()+"\n horsePower=" + horsePower + ",\n nbDoors=" + nbDoors + ",\n nbSeats=" + nbSeats +
				",\n boothSize="+ boothSize+"]";
	}

	@Override
	public int calcTaxes() {
		return horsePower*10;
	}

	public void showCar() {
		super.showVehicle();
		System.out.println(this);
	}
}
