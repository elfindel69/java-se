package com.hb.gestiongarage.pojos;

public class VehicleOption {
	private static int sId = 0;
	private int id;
	private String name;
	private double price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	
	public VehicleOption() {
		this.id = generateId();
	}
	
	public VehicleOption(String name, double price) {
		this();
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "VehicleOption [id="+id+", name=" + name + ", price=" + price + "]";
	}
	
	public void showOption() {
		System.out.println(this);
	}
	
	private static int generateId() {
		return ++sId;
	}
}
