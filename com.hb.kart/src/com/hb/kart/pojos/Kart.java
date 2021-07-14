package com.hb.kart.pojos;

public class Kart {
	private static int sId = 0;
	protected int id;
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

	public int getId() {
		return id;
	}
	

	public Kart() {
		id = ++sId;
	}
	
	public Kart(String registrationString) {
		this();
		this.registrationString = registrationString;
	}
	@Override
	public String toString() {
		return "Kart [id=" + id + "\n,"+
				"registrationString=" + registrationString +",\n" 
				+"name="+name+",\n"
				+"price="+price+"]";
	}
	
	
}
