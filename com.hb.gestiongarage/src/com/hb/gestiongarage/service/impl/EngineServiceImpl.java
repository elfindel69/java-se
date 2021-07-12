package com.hb.gestiongarage.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.hb.gestiongarage.pojos.Engine;
import com.hb.gestiongarage.service.EngineService;

public class EngineServiceImpl implements EngineService {
	
	List<Engine> engines = new ArrayList<Engine>();

	@Override
	public void addEngine(Engine engine) {
		engines.add(engine);

	}

	@Override
	public void showEngines() {
		for (Engine engine : engines) {
			System.out.println(engine);
		}

	}

	@Override
	public Engine getEngine(int id) {
		for (Engine engine : engines) {
			if(engine.getId() == id) {
				return engine;
			}
		}
		return null;
	}

	@Override
	public List<Engine> getEngines() {
		return engines;
	}

}
