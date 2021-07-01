package classes.exo.carnivore;

import classes.exo.Caresse;
import classes.exo.Sexe;

public final class Chien extends Carnivore implements Caresse{
	private boolean collier;
	
	public Chien(String nom, int age, Sexe sexe, String couleur) {
		
		super(nom, age, sexe, couleur);
	}
	
public Chien(String nom, int age, Sexe sexe, String couleur, boolean collier) {
		
		super(nom, age, sexe, couleur);
		this.collier = collier;
	}

	@Override
	public void parler() {
		System.out.println("j'aboie, waf waf !");

	}

	@Override
	public void seDeplacer() {
		System.out.println("je cours comme un fou !");

	}
	
	@Override
	public void caresser() {
		System.out.println("j'adore les caresses ! ");
	}

	public void afficheCollier() {
		if(collier) {
			System.out.println("J'ai un beau collier bleu !");
		}else {
			System.out.println("Je suis un chien libre !");
		}
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		String parentString = super.toString();
		sb.append(parentString+",\n");
		if(collier) {
			sb.append("collier: oui");
		}else {
			sb.append("collier: non");
		}
		return sb.toString();
	}
	
	public boolean isCollier() {
		return collier;
	}

	public void setCollier(boolean collier) {
		this.collier = collier;
	}

}
