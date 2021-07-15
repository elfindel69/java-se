package com.hb.kart.pojos;


public class Participation {
	private static int sId = 0;
	private int id;
	private Client client;
	private Kart kart;
	private Repas repas;
	
	public Participation() {
		id = ++sId;
	}
	
	public Participation(Client client, Kart kart, Repas repas) {
		this();
		this.client = client;
		this.kart = kart;
		this.repas = repas;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Kart getKart() {
		return kart;
	}

	public void setKart(Kart kart) {
		this.kart = kart;
	}

	public Repas getRepas() {
		return repas;
	}

	public void setRepas(Repas repas) {
		this.repas = repas;
	}
	

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Participation [id=" + id + ", client=" + client + ", kart=" + kart + ", repas=" + repas 
				+ "]";
	}
	
	
}
