package com.hb.kart.pojos;

public class KartDecorator extends Kart {
	protected Kart kart;
	
	public KartDecorator(Kart kart) {
		this.kart = kart;
	}
	
	public Kart getKart() {
		return kart;
	}
}
