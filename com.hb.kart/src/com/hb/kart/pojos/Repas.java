package com.hb.kart.pojos;

public abstract class Repas {
	private static int sId = 0;
	protected int id;
	protected String name;
	protected int price;
	protected TypeRepas typeRepas;
	
	public Repas() {
		id = ++sId;
	}
	
	public Repas(String name, int price, TypeRepas typeRepas) {
		this();
		this.name = name;
		this.price = price;
		this.typeRepas = typeRepas;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public TypeRepas getTypeRepas() {
		return typeRepas;
	}

	public void setTypeRepas(TypeRepas typeRepas) {
		this.typeRepas = typeRepas;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Repas [id=" + id + ", name=" + name + ", price=" + price + ", typeRepas=" + typeRepas + "]";
	}
	
	

}
