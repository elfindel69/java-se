package com.hb.gestiongarage.service;

import java.util.List;

import com.hb.gestiongarage.pojos.Garage;

/**
 * interface garage management
 * @author elfindel69
 *
 */
public interface GarageService {
	/**
	 * adds a garage to the list
	 * @param garage to add
	 */
	void addGarage(Garage garage);
	
	/**
	 * gets a garage from the list
	 * @param id id of the garage to get
	 * @return garage selected
	 */
	Garage getGarage(int id);
	
	/**
	 * gets the list of garages
	 * @return garages list
	 */
	List<Garage> getGarages();
	
	/**
	 * removes a garage from the list
	 * @param id id of the garage to remove
	 * @return garage removed?
	 */
	boolean removeGarage(int id);
}
