package com.hb.kart.pojos;

public class CarapaceTortue extends KartDecorator {

	public CarapaceTortue(Kart kart) {
		super(kart);
		this.setName(kart.getName()+", Carapace rouge");
		this.setPrice(kart.getPrice()+3);
		this.setRegistrationString(kart.getRegistrationString());
	}
	
	
}
