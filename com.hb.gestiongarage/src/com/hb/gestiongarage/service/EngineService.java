package com.hb.gestiongarage.service;

import java.util.List;

import com.hb.gestiongarage.pojos.Engine;

public interface EngineService {
	void addEngine(Engine engine);
	void showEngines();
	Engine getEngine(int id);
	List<Engine> getEngines();
}
