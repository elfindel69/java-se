package com.hb.kart.pojos;

public class Banane extends KartDecorator {
	public Banane(Kart kart) {
		super(kart);
		kart.setName("Banane");
		kart.setPrice(51);
	}


}
