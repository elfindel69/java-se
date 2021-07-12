package com.hb.gestiongarage.pojos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle implements Comparable<Vehicle> {
	private static int sId = 0;
	protected int id;
	protected String name;
	protected double price;
	protected Brand brand;
	protected Engine engine;
	protected LocalDate immatriculationDate;
	protected List<VehicleOption> options = new ArrayList<VehicleOption>();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public List<VehicleOption> getOptions() {
		return options;
	}
	
	public void addOption(VehicleOption op) {
		options.add(op);
		
	}

	public void showOptions() {
		for (VehicleOption vehicleOption : options) {
			System.out.println(vehicleOption);
		}
	}
	
	public int getId() {
		return id;
	}
	
	public LocalDate getImmatriculationDate() {
		return immatriculationDate;
	}
	public void setImmatriculationDate(LocalDate immatriculationDate) {
		this.immatriculationDate = immatriculationDate;
	}
	public Vehicle() {
		id = ++sId;
	}
	
	public Vehicle(String name, double price, Brand brand, Engine engine, LocalDate immDate) {
		this();
		this.name = name;
		this.price = price;
		this.brand = brand;
		this.engine = engine;
		this.immatriculationDate = immDate;
	}
	
	@Override
	public String toString() {
		final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "[\n"
				+ " id=" + id+ ",\n"
				+"name=" + name+ ",\n"
				+ " price=" + price + ",\n"
				+ " brand=" + brand + ",\n"
				+ " engine=\n" 
				+ engine+ ",\n"
				+" options=\n"
				+ options + ",\n"
				+" immatriculation date="+ FORMATTER.format(immatriculationDate);
	}
	
	public abstract int calcTaxes();
	
	public double getNetPrice(){
		return price + calcTaxes();
	};
	
	@Override
	public int compareTo(Vehicle o) {
		if (price == o.getPrice()) {
			return 0;
		}else if (price > o.getPrice()) {
			return 1;
		}else {
			return -1;
		}
		
	}
	
	public void showVehicle() {
		System.out.println(this);
	}
	
}
