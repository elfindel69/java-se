package classes.exo.herbivore;

import classes.exo.Animal;
import classes.exo.Sexe;

public abstract class Herbivore extends Animal {

	public Herbivore(String nom, int age, Sexe sexe, String couleur) {
		super(nom, age, sexe, couleur);
	}

	@Override
	public abstract void parler();

	@Override
	public void manger() {
		System.out.println("je mange de l'herbe :)");

	}

	@Override
	public abstract void seDeplacer();

}
