package com.hb.gestiongarage.service;

import java.util.List;

import com.hb.gestiongarage.pojos.VehicleOption;

/**
 * interface option management
 * @author elfindel69
 *
 */
public interface VehicleOptionService {
	
	/**
	 * adds an option to the list
	 * @param option option to add
	 */
	void addVehicleOption(VehicleOption option);
	
	/**
	 * gets an option by id
	 * @param id id to get from
	 * @return selected option
	 */
	VehicleOption getVehicleOption(int id);
	
	/**
	 * gets the options list
	 * @return options list
	 */
	List<VehicleOption> getVehicleOptions();
	
	/**
	 * removes an option from the list
	 * @param id id of the option to remove
	 * @return option removed?
	 */
	boolean removeOption(int id);
}
