package com.hb.gestiongarage.pojos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Garage {
	private static int sId = 0;
	protected int id;
	private String name;
	private List<Vehicle> vehicles = new ArrayList<Vehicle>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void addVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
	}
	
	public int getId() {
		return id;
	}
	public Garage() {
		id = ++sId;
	}
	
	public Garage(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Garage [id=" + id + ", name=" + name + "]";
	}
	
	public void showGarage() {
		System.out.println(this);
	}
	
	public void showVehicles() {
		for (Vehicle vehicle : vehicles) {
			System.out.println(vehicle);
		}
	}
	
	public void sortVehicles() {
		Collections.sort(vehicles);
		
	}
}
