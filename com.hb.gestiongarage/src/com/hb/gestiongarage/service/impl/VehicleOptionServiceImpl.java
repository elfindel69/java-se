package com.hb.gestiongarage.service.impl;

import java.util.ArrayList;
import java.util.List;
import com.hb.gestiongarage.pojos.VehicleOption;
import com.hb.gestiongarage.service.VehicleOptionService;

/**
 * options manager
 * @author elfindel69
 *
 */
public class VehicleOptionServiceImpl implements VehicleOptionService {
	
	/**
	 * list of options
	 */
	private List<VehicleOption> options = new ArrayList<VehicleOption>();

	/**
	 * adds an option to the list
	 * @param option option to add
	 */
	@Override
	public void addVehicleOption(VehicleOption vehicle) {
		options.add(vehicle);
		
	}

	/**
	 * gets an option by id
	 * @param id id to get from
	 * @return selected option
	 */
	@Override
	public VehicleOption getVehicleOption(int id) {
		for (VehicleOption vehicleOption : options) {
			if(vehicleOption.getId() == id) {
				return vehicleOption;
			}
		}
		return null;
	}

	/**
	 * gets the options list
	 * @return options list
	 */
	@Override
	public List<VehicleOption> getVehicleOptions() {
		return options;
	}

	/**
	 * removes an option from the list
	 * @param id id of the option to remove
	 * @return option removed?
	 */
	@Override
	public boolean removeOption(int id) {
		for (VehicleOption vehicleOption : options) {
			if(vehicleOption.getId() == id) {
				options.remove(vehicleOption);
				return true;
			}
		}
		return false;
	}

}
