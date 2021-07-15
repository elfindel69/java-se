package com.hb.kart.pojos;

public class Kart {
	protected String registrationString;
	protected String name;
	protected int price;
	
	public String getRegistrationString() {
		return registrationString;
	}
	
	public void setRegistrationString(String registrationString) {
		this.registrationString = registrationString;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Kart() {
		
	}
	
	public Kart(String registrationString) {
		this.registrationString = registrationString;
	}
	@Override
	public String toString() {
		return "Kart ["+
				"registrationString=" + registrationString +",\n" 
				+"name="+name+",\n"
				+"price="+price+"]";
	}
	
	
}
