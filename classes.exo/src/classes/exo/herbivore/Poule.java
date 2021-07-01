package classes.exo.herbivore;

import classes.exo.Sexe;

public final class Poule extends Herbivore {

	public Poule(String nom, int age, Sexe sexe, String couleur) {
		super(nom, age, sexe, couleur);
	}

	@Override
	public void parler() {
		if (sexe == Sexe.Femelle) {
			System.out.println("je piaille, piou piou !");
		}else {
			System.out.println("je chante tous les matins! cocorico !");
		}
		

	}

	@Override
	public void seDeplacer() {
		System.out.println("je marche sur deux pattes !");

	}
	
	public void pondreOeufs() {
		if (sexe == Sexe.Femelle) {
			System.out.println("je pond des bons oeufs frais !");
		} else {
			System.out.println("je suis un coq, pas d'oeufs pour moi !");
		}
		
	}

}
