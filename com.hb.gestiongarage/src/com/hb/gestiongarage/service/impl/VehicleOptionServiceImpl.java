package com.hb.gestiongarage.service.impl;

import java.util.ArrayList;
import java.util.List;
import com.hb.gestiongarage.pojos.VehicleOption;
import com.hb.gestiongarage.service.VehicleOptionService;

public class VehicleOptionServiceImpl implements VehicleOptionService {
	
	private List<VehicleOption> options = new ArrayList<VehicleOption>();


	@Override
	public void addVehicleOption(VehicleOption vehicle) {
		options.add(vehicle);
		
	}

	@Override
	public void showVehicleOptions() {
		for (VehicleOption vehicleOption : options) {
			System.out.println(vehicleOption);
		}
		
	}

	@Override
	public VehicleOption getVehicleOption(int id) {
		for (VehicleOption vehicleOption : options) {
			if(vehicleOption.getId() == id) {
				return vehicleOption;
			}
		}
		return null;
	}

	@Override
	public List<VehicleOption> getVehicleOptions() {
		return options;
	}

}
