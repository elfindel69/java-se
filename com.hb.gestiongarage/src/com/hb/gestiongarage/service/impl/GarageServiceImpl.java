package com.hb.gestiongarage.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.hb.gestiongarage.pojos.Garage;
import com.hb.gestiongarage.service.GarageService;

public class GarageServiceImpl implements GarageService {
	private List<Garage> garages = new ArrayList<Garage>();

	@Override
	public void addGarage(Garage garage) {
		garages.add(garage);

	}


	@Override
	public Garage getGarage(int id) {
		for (Garage garage : garages) {
			if(garage.getId() == id) {
				return garage;
			}
		}
		return null;
	}

	@Override
	public List<Garage> getGarages() {
		return garages;
	}

}
