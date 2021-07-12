package com.hb.gestiongarage.service;

import java.util.List;

import com.hb.gestiongarage.pojos.Vehicle;

/**
 * interface vehicle management
 * @author elfindel69
 *
 */
public interface VehicleService {
	/**
	 * adds a vehicle to the list
	 * @param vehicle vehicle to add
	 */
	void addVehicle(Vehicle vehicle);
	
	/**
	 * gets a vehicle by id
	 * @param id id to get from
	 * @return selected vehicle
	 */
	Vehicle getVehicle(int id);
	
	/**
	 * gets the vehicles list
	 * @return vehicles list
	 */
	List<Vehicle> getVehicles();
	
	/**
	 * removes a vehicle from the list
	 * @param id id of the vehicle to remove
	 * @return vehicle removed?
	 */
	boolean removeVehicle(int id);
	
}
