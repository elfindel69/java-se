package com.hb.kart.pojos;

public class CarapaceTortue extends KartDecorator {

	public CarapaceTortue(Kart kart) {
		super(kart);
		kart.setName("Carapace rouge");
		kart.setPrice(53);
	}
	
	
}
