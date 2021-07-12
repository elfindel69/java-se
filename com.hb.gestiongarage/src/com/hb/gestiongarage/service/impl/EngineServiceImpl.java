package com.hb.gestiongarage.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.hb.gestiongarage.pojos.Engine;
import com.hb.gestiongarage.service.EngineService;

/**
 * engine manager
 * @author elfindel69
 *
 */
public class EngineServiceImpl implements EngineService {
	
	/**
	 * list of engines
	 */
	List<Engine> engines = new ArrayList<Engine>();
	
	/**
	 * adds an engine to the list
	 * @param engine engine to add
	 */
	@Override
	public void addEngine(Engine engine) {
		engines.add(engine);

	}

	/**
	 * gets an engine from the list
	 * @param id id of the engine to get
	 * @return selected engine
	 */
	@Override
	public Engine getEngine(int id) {
		for (Engine engine : engines) {
			if(engine.getId() == id) {
				return engine;
			}
		}
		return null;
	}
	
	/**
	 * gets the engines list
	 * @return engines list
	 */
	@Override
	public List<Engine> getEngines() {
		return engines;
	}
	
	/**
	 * removes an engine from the list
	 * @param id id of the engine to remove
	 * @return engine removed?
	 */
	@Override
	public boolean removeEngine(int id) {
		for (Engine engine : engines) {
			if(engine.getId() == id) {
				engines.remove(id);
				return true;
			}
		}
		return false;
	}

}
