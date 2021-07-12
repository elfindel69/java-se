package com.hb.gestiongarage.service;

import java.util.List;

import com.hb.gestiongarage.pojos.VehicleOption;

public interface VehicleOptionService {
	void addVehicleOption(VehicleOption vehicle);
	void showVehicleOptions();
	VehicleOption getVehicleOption(int id);
	List<VehicleOption> getVehicleOptions();
}
