package com.hb.kart.pojos;

public class Banane extends KartDecorator {
	public Banane(Kart kart) {
		super(kart);
		this.setName(kart.getName()+", Banane");
		this.setPrice(kart.getPrice()+1);
		this.setRegistrationString(kart.getRegistrationString());
	}


}
