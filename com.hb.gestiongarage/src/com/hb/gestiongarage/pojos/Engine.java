package com.hb.gestiongarage.pojos;

public class Engine {
	private static int sId = 0;
	private int id;
	private EngineType engineType;
	private int horsePower;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public EngineType getEngineType() {
		return engineType;
	}
	public void setEngineType(EngineType engineType) {
		this.engineType = engineType;
	}
	public int getHorsePower() {
		return horsePower;
	}
	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	
	
	public Engine() {
		this.id = ++sId;
	}
	public Engine(EngineType engineType, int horsePower) {
		this();
		this.engineType = engineType;
		this.horsePower = horsePower;
	}
	@Override
	public String toString() {
		return "Engine [id= "+id+", engineType=" + engineType + ", horsePower=" + horsePower + "]";
	}
	public void showEngine() {
		System.out.println(this);
		
	}
	
	
}
