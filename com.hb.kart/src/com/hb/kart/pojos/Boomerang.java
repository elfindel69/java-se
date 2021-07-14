package com.hb.kart.pojos;

public class Boomerang extends KartDecorator {

	public Boomerang(Kart kart) {
		super(kart);
		kart.setName("Boomerang");
		kart.setPrice(52);
	}
	
	
}
