package com.hb.kart.factories;

import java.util.concurrent.ThreadLocalRandom;

import com.hb.kart.pojos.Banane;
import com.hb.kart.pojos.Boomerang;
import com.hb.kart.pojos.CarapaceTortue;
import com.hb.kart.pojos.Kart;
import com.hb.kart.pojos.KartDecorator;
import com.hb.kart.pojos.LanceRoquette;
public class KartFactory {
private static KartFactory instance = null;
	
	private KartFactory() {
		
	}
	
	public static KartFactory getInstance() {
		if(instance == null) {
			//check thread safe
			synchronized (KartFactory.class) {
				if (instance == null) {
					instance = new KartFactory();
				}
			}
		}
		
		return instance;
	}
	
	private String generateId() {
		String [] letters = {"A","B","C","D","E","F","G","H","I","J","K","L","M",
				"N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		String[] digits = {"0","1","2","3","4","5","6","7","8","9","10"};
		 int rand = 0;
		 String idString = "";
		 
		 rand = ThreadLocalRandom.current().nextInt(26);
		 idString += letters[rand];
		 rand = ThreadLocalRandom.current().nextInt(26);
		 idString += letters[rand];
		 rand = ThreadLocalRandom.current().nextInt(9);
		 idString += digits[rand];
		 rand = ThreadLocalRandom.current().nextInt(9);
		 idString += digits[rand];
		return idString;
	}
	
	public KartDecorator generateKart(String type) {
		if(type == null || type.isEmpty()) {
			return null;
		}else if(type.equalsIgnoreCase("BANANE")) {
			Kart kart = new Kart(generateId());
			return new Banane(kart);
		}
		else if(type.equalsIgnoreCase("BOOMERANG")) {
			Kart kart = new Kart(generateId());
			return new Boomerang(kart);
		}
		else if(type.equalsIgnoreCase("CARAPACE")) {
			Kart kart = new Kart(generateId());
			return new CarapaceTortue(kart);
		}
		else if(type.equalsIgnoreCase("LANCE ROQUETTE")) {
			Kart kart = new Kart(generateId());
			return new LanceRoquette(kart);
		}else {
			return null;
		}
	}
}
