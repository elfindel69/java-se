package com.hb.gestiongarage.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.hb.gestiongarage.pojos.Vehicle;
import com.hb.gestiongarage.service.VehicleService;

public class VehicleServiceImpl implements VehicleService {
	private List<Vehicle> vehicles = new ArrayList<Vehicle>();
	
	@Override
	public void addVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);

	}

	@Override
	public Vehicle getVehicle(int id) {
		for (Vehicle vehicle : vehicles) {
			if(vehicle.getId() == id) {
				return vehicle;
			}
		}
		return null;
	}

	@Override
	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	

	

}
