package com.hb.gestiongarage.pojos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * garage POJO
 * @author elfindel69
 *
 */
public class Garage {
	
	/**
	 * static id
	 */
	private static int sId = 0;
	/**
	 * generated id
	 */
	protected int id;
	/**
	 * garage name
	 */
	private String name;
	/**
	 * garage list of vehicles
	 */
	private List<Vehicle> vehicles = new ArrayList<Vehicle>();
	
	/**
	 * getter garage name
	 * @return garage name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * setter garage name
	 * @param name new garage name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * method to add a vehicle to the list
	 * @param vehicle vehicle to add
	 */
	public void addVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
	}
	
	/**
	 * getter id
	 * @return garage id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * default constructor
	 * generates garage id
	 */
	public Garage() {
		id = generateId();
	}
	
	/**
	 * parameter constructor
	 * @param name
	 */
	public Garage(String name) {
		this.name = name;
	}
	
	/**
	 * toString method
	 * returns the object arguments values
	 */
	@Override
	public String toString() {
		return "Garage [id=" + id + ", name=" + name + "]";
	}
	
	/**
	 * show the garage arguments
	 */
	public void showGarage() {
		System.out.println(this);
	}
	
	/**
	 * show the garage vehicles
	 */
	public void showVehicles() {
		for (Vehicle vehicle : vehicles) {
			System.out.println(vehicle);
		}
	}
	
	/**
	 * sorts the vehicles by price
	 */
	public void sortVehicles() {
		Collections.sort(vehicles);
		
	}
	
	/**
	 * generates the garage id
	 * @return current garage id
	 */
	private static int generateId() {
		return ++sId;
	}

	/**
	 * gets the garage vehicles list
	 */
	public List<Vehicle> getVehicles() {
		return vehicles;
		
	}

	/**
	 * removes the vehicle from the list
	 * @param id2
	 */
	public boolean removeVehicle(int id) {
		for (Vehicle vehicle : vehicles) {
			if(vehicle.getId() == id) {
				vehicles.remove(vehicle);
				return true;
			}
		}
		return false;
		
	}
}
