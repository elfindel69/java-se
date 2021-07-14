package com.hb.kart.pojos;

public class LanceRoquette extends KartDecorator {
	
	public LanceRoquette(Kart kart) {
		super(kart);
		kart.setName("Lance roquette");
		kart.setPrice(54);
	}

	
}
