package com.hb.gestiongarage.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.hb.gestiongarage.pojos.Vehicle;
import com.hb.gestiongarage.service.VehicleService;

/**
 * vehicle management
 * @author elfindel69
 *
 */
public class VehicleServiceImpl implements VehicleService {
	
	/**
	 * vehicles list
	 */
	private List<Vehicle> vehicles = new ArrayList<Vehicle>();
	
	/**
	 * adds a vehicle to the list
	 * @param vehicle vehicle to add
	 */
	@Override
	public void addVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);

	}

	/**
	 * gets a vehicle by id
	 * @param id id to get from
	 * @return selected vehicle
	 */
	@Override
	public Vehicle getVehicle(int id) {
		for (Vehicle vehicle : vehicles) {
			if(vehicle.getId() == id) {
				return vehicle;
			}
		}
		return null;
	}

	/**
	 * gets the vehicles list
	 * @return vehicles list
	 */
	@Override
	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	/**
	 * removes a vehicle from the list
	 * @param id id of the vehicle to remove
	 * @return vehicle removed?
	 */
	@Override
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
