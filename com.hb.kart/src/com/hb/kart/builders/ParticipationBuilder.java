package com.hb.kart.builders;

import com.hb.kart.pojos.Client;
import com.hb.kart.pojos.Kart;
import com.hb.kart.pojos.Participation;
import com.hb.kart.pojos.Repas;

public class ParticipationBuilder {
	
	private Participation participation;
	
	public ParticipationBuilder() {
		participation = new Participation();
	}
	
	public ParticipationBuilder definirClient(Client client) {
		participation.setClient(client);
		return this;
	}
	
	public ParticipationBuilder definirKart(Kart kart) {
		participation.setKart(kart);
		return this;
	}
	
	public ParticipationBuilder definirRepas(Repas repas) {
		participation.setRepas(repas);
		return this;
	}
	
	public Participation build() {
		return participation;
	}

}
