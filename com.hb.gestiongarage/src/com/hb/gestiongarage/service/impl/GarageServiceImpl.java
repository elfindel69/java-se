package com.hb.gestiongarage.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.hb.gestiongarage.pojos.Garage;
import com.hb.gestiongarage.service.GarageService;

/**
 * garage manager
 * @author elfindel69
 *
 */
public class GarageServiceImpl implements GarageService {
	
	/**
	 * list of garages
	 */
	private List<Garage> garages = new ArrayList<Garage>();

	/**
	 * adds a garage to the list
	 * @param garage to add
	 */
	@Override
	public void addGarage(Garage garage) {
		garages.add(garage);

	}

	/**
	 * gets a garage from the list
	 * @param id id of the garage to get
	 * @return garage selected
	 */
	@Override
	public Garage getGarage(int id) {
		for (Garage garage : garages) {
			if(garage.getId() == id) {
				return garage;
			}
		}
		return null;
	}

	/**
	 * gets the list of garages
	 * @return garages list
	 */
	@Override
	public List<Garage> getGarages() {
		return garages;
	}

	/**
	 * removes a garage from the list
	 * @param id id of the garage to remove
	 * @return garage removed?
	 */
	@Override
	public boolean removeGarage(int id) {
		for (Garage garage : garages) {
			if(garage.getId() == id) {
				garages.remove(id);
				return true;
			}
		}
		return false;
	}

}
