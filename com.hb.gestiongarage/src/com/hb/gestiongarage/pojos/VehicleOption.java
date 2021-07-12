package com.hb.gestiongarage.pojos;

/**
 * option POJO
 * @author elfindel69
 *
 */
public class VehicleOption {
	/**
	 * static id
	 */
	private static int sId = 0;
	
	/**
	 * option id
	 */
	private int id;
	
	/**
	 * option name
	 */
	private String name;
	
	/**
	 * option price
	 */
	private double price;
	
	/**
	 * getter id
	 * @return option id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * getter name
	 * @return option name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * setter name
	 * @param name new option name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * getter price
	 * @return option price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * setter price
	 * @param price new option price
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * default constructor
	 * generates option id
	 */
	public VehicleOption() {
		this.id = generateId();
	}
	
	/**
	 * parameter constructor
	 * @param name option name
	 * @param price option price
	 */
	public VehicleOption(String name, double price) {
		this();
		this.name = name;
		this.price = price;
	}
	
	/**
	 * toString method
	 * returns the object arguments values
	 */
	@Override
	public String toString() {
		return "VehicleOption [id="+id+", name=" + name + ", price=" + price + "]";
	}
	
	/**
	 * show the option arguments
	 */
	public void showOption() {
		System.out.println(this);
	}
	
	/**
	 * generates the option id
	 * @return current option id
	 */
	private static int generateId() {
		return ++sId;
	}
}
