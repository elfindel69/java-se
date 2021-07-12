package com.hb.gestiongarage.service;

import java.util.List;

import com.hb.gestiongarage.pojos.Garage;

public interface GarageService {
	void addGarage(Garage garage);
	Garage getGarage(int id);
	List<Garage> getGarages();
}
