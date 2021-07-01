package classes.exo.herbivore;

import classes.exo.Sexe;

public final class Vache extends Herbivore {

	public Vache(String nom, int age, Sexe sexe, String couleur) {
		super(nom, age, sexe, couleur);
	}

	@Override
	public void parler() {
	 System.out.println("je meugle, mooo ! ");

	}

	@Override
	public void seDeplacer() {
		System.out.println("je marche sur quatre pattes");

	}
	
	public void donnerLait() {
		if(sexe == Sexe.Femelle) {
			System.out.println("je donne du bon lait !");
		}else {
			System.out.println("je suis un boeuf, pas de lait pour moi!");
		}
	}

}
