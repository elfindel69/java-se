package com.hb.gestiongarage.service;

import java.util.List;

import com.hb.gestiongarage.pojos.Vehicle;

public interface VehicleService {
	void addVehicle(Vehicle vehicle);
	Vehicle getVehicle(int id);
	List<Vehicle> getVehicles();
	
}
