package com.hb.gestiongarage.pojos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * Vehicle abstract POJO
 * @author elfindel69
 *
 */
public abstract class Vehicle implements Comparable<Vehicle> {
	/**
	 * static id
	 */
	private static int sId = 0;
	/**
	 * current id
	 */
	protected int id;
	
	/**
	 * vehicle name
	 */
	protected String name;
	
	/**
	 * vehicle price
	 */
	protected double price;
	
	/**
	 * vehicle brand
	 */
	protected Brand brand;
	
	/**
	 * vehicle engine
	 */
	protected Engine engine;
	
	/**
	 * vehicle matriculation date
	 */
	protected LocalDate registrationDate;
	
	/**
	 * vehicle options
	 */
	protected List<VehicleOption> options = new ArrayList<VehicleOption>();
	
	/**
	 * getter name
	 * @return vehicle name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * setter name
	 * @param name new vehicle name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * getter price
	 * @return vehicle price
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * setter price
	 * @param price new vehicle price
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * getter brand
	 * @return vehicle brand
	 */
	public Brand getBrand() {
		return brand;
	}
	
	/**
	 * setter brand
	 * @param brand new vehcicle brand
	 */
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	
	/**
	 * getter engine
	 * @return vehicle engine
	 */
	public Engine getEngine() {
		return engine;
	}
	
	/**
	 * setter engine
	 * @param engine new vehicle engine
	 */
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	/**
	 * getter options
	 * @return vehicle options
	 */
	public List<VehicleOption> getOptions() {
		return options;
	}
	
	/**
	 * getter id
	 * @return vehicle id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * getter registration date
	 * @return vehicle registration date
	 */
	public LocalDate getRegistrationDate() {
		return registrationDate;
	}
	
	/**
	 * setter registration date
	 * @param registrationDate new registration date
	 */
	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}
	
	/**
	 * default constructor
	 * generates id
	 */
	public Vehicle() {
		id = generateId();
	}
	
	/**
	 * parameter constructor
	 * @param name vehicle name
	 * @param price vehicle price
	 * @param brand vehicle brand
	 * @param engine vehicle engine
	 * @param regDate vehicle registration date
	 */
	public Vehicle(String name, double price, Brand brand, Engine engine, LocalDate regDate) {
		this();
		this.name = name;
		this.price = price;
		this.brand = brand;
		this.engine = engine;
		this.registrationDate = regDate;
	}
	
	/**
	 * toString method
	 * returns the object arguments values
	 */
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
				+" immatriculation date="+ FORMATTER.format(registrationDate);
	}
	
	/**
	 * method to add an option to the options list
	 * @param op option to add
	 */
	public void addOption(VehicleOption op) {
		options.add(op);
		
	}

	/**
	 * method to show the vehicle options
	 */
	public void showOptions() {
		for (VehicleOption vehicleOption : options) {
			System.out.println(vehicleOption);
		}
	}
	
	/**
	 * calculates the vehicle's taxes
	 * @return the calculated tax
	 */
	public abstract int calcTaxes();
	
	/**
	 * calculates the vehicle's net price
	 * (taxes + options)
	 * @return
	 */
	public double getNetPrice(){
		double res = price + calcTaxes();
		
		for (VehicleOption vehicleOption : options) {
			res += vehicleOption.getPrice();
		}
		
		return res;
	};
	
	/**
	 * comparator on price
	 * @param vehicle to compare
	 */
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
	
	/**
	 * show the vehicle arguments
	 */
	public void showVehicle() {
		System.out.println(this);
	}
	
	/**
	 * generates the vehicles id
	 * @return
	 */
	private static int generateId() {
		return ++sId;
	}
	
}
