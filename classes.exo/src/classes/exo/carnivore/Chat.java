package classes.exo.carnivore;

import classes.exo.Caresse;
import classes.exo.Sexe;

public final class Chat extends Carnivore implements Caresse {

	public Chat(String nom, int age, Sexe sexe, String couleur) {
		super(nom, age, sexe, couleur);
	}
	
	public Chat(String nom, int age, Sexe sexe, String couleur, boolean caresses) {
		super(nom, age, sexe, couleur);
		this.caresses = caresses;
	}

	private boolean caresses;
	@Override
	public void parler() {
		System.out.println("je miaule, miaou !");

	}

	@Override
	public void seDeplacer() {
		System.out.println("je cours avec mes pattes agiles !");

	}
	
	@Override
	public void caresser() {
		if(caresses) {
			System.out.println("je ronronne, ron ron !");
		}else {
			griffer();
		}
	}

	private void griffer() {
		System.out.println("je sors les griffes !");
		
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		String parentString = super.toString();
		sb.append(parentString+",\n");
		if(caresses) {
			sb.append("caresses: oui");
		}else {
			sb.append("caresses: non");
		}
		return sb.toString();
	}

	public boolean isCaresses() {
		return caresses;
	}

	public void setCaresses(boolean caresses) {
		this.caresses = caresses;
	}

}
