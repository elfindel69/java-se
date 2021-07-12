package com.hb.gestiongarage.pojos;

/**
 * engine POJO
 * @author elfindel69
 *
 */
public class Engine {
	/**
	 * static id
	 */
	private static int sId = 0;
	/**
	 * current id
	 */
	private int id;
	/**
	 * engine type
	 */
	private EngineType engineType;
	/**
	 * engine power
	 */
	private int enginePower;
	
	/**
	 * id getter
	 * @return id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * engine type getter
	 * @return engine type
	 */
	public EngineType getEngineType() {
		return engineType;
	}
	/**
	 * engine type setter
	 * @param engineType new engine type
	 */
	public void setEngineType(EngineType engineType) {
		this.engineType = engineType;
	}
	/**
	 * engine power getter 
	 * @return
	 */
	public int getEnginePower() {
		return enginePower;
	}
	/**
	 * engine power setter 
	 * @param enginePower new engine power
	 */
	public void setEnginePower(int enginePower) {
		this.enginePower = enginePower;
	}
	
	/**
	 * default constructor
	 * generates id
	 */
	public Engine() {
		this.id = generateId();
	}
	
	/**
	 * parameter construtor
	 * @param engineType engine type
	 * @param enginePower engine power
	 */
	public Engine(EngineType engineType, int enginePower) {
		this();
		this.engineType = engineType;
		this.enginePower = enginePower;
	}
	
	/**
	 * toString method
	 * returns the object arguments values
	 */
	@Override
	public String toString() {
		return "Engine [id= "+id+", engineType=" + engineType + ", horsePower=" + enginePower + "]";
	}
	
	/**
	 * show engine method
	 */
	public void showEngine() {
		System.out.println(this);
		
	}
	
	/**
	 * id generator method
	 * @return generated id
	 */
	private static int generateId() {
		return ++sId;
	}
	
}
