package com.hb.gestiongarage.service;

import java.util.List;

import com.hb.gestiongarage.pojos.Engine;

/**
 * interface engine management
 * 
 * @author elfindel69
 *
 */
public interface EngineService {
	/**
	 * adds an engine to the list
	 * @param engine engine to add
	 */
	void addEngine(Engine engine);
	
	/**
	 * gets an engine from the list
	 * @param id id of the engine to get
	 * @return selected engine
	 */
	Engine getEngine(int id);
	
	/**
	 * gets the engines list
	 * @return engines list
	 */
	List<Engine> getEngines();
	
	/**
	 * removes an engine from the list
	 * @param id id of the engine to remove
	 * @return engine removed?
	 */
	boolean removeEngine(int id);
}
