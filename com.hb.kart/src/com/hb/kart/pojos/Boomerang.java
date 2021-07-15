package com.hb.kart.pojos;

public class Boomerang extends KartDecorator {

	public Boomerang(Kart kart) {
		super(kart);
		this.setName(kart.getName()+", Boomerang");
		this.setPrice(kart.getPrice()+2);
		this.setRegistrationString(kart.getRegistrationString());
	}
	
	
}
