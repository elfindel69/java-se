package com.hb.gestiongarage.pojos;

import java.time.LocalDate;

public class Motorcycle extends Vehicle {
	
	private int cylinders;
	
	public int getCylinders() {
		return cylinders;
	}
	
	public void setCylinders(int cylinders) {
		this.cylinders = cylinders;
	}

	
	public Motorcycle() {
		
	}
	
	public Motorcycle(String name, double price, Brand brand, Engine engine, LocalDate immDate, int cylinders) {
		super(name, price, brand, engine, immDate);
		this.cylinders = cylinders;
	}

	@Override
	public int calcTaxes() {
		return (int) (cylinders* 0.3);
	}

	@Override
	public String toString() {
		return "Motorcycle: "+super.toString()+"\n cylinders=" + cylinders + "]";
	}
	
	public void showMotorcycle() {
		super.showVehicle();
		System.out.println(this);
	}
	
	

}
