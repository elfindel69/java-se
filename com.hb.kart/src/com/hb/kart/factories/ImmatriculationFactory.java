package com.hb.kart.factories;

import java.util.concurrent.ThreadLocalRandom;

public final class ImmatriculationFactory {
private static ImmatriculationFactory instance = null;
	
	private ImmatriculationFactory() {
		
	}
	
	public final static ImmatriculationFactory getInstance() {
		if(instance == null) {
			//check thread safe
			synchronized (ImmatriculationFactory.class) {
				if (instance == null) {
					instance = new ImmatriculationFactory();
				}
			}
		}
		
		return instance;
	}
	
	public String generateImmatriculation() {
		
		 String idString = "";
		 
		 int nb = ThreadLocalRandom.current().nextInt(1,100);
		
		 idString += String.format("%02d", nb);
		 idString += "-";
		 
		 char letter = (char) ThreadLocalRandom.current().nextInt(65,91);
		 idString += letter;
		 letter = (char) ThreadLocalRandom.current().nextInt(65,91);
		 idString += letter;
		 
		
		return idString;
	}
	
	
}
