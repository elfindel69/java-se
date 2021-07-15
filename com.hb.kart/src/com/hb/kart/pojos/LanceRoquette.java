package com.hb.kart.pojos;

public class LanceRoquette extends KartDecorator {
	
	public LanceRoquette(Kart kart) {
		super(kart);
		this.setName(kart.getName()+", Lance-roquette");
		this.setPrice(kart.getPrice()+4);
		this.setRegistrationString(kart.getRegistrationString());
	}

	
}
