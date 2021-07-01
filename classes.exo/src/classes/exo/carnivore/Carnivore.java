package classes.exo.carnivore;

import classes.exo.Animal;
import classes.exo.Sexe;

public abstract class Carnivore extends Animal {

	public Carnivore(String nom, int age, Sexe sexe, String couleur) {
		super(nom, age, sexe, couleur);
	}

	@Override
	public abstract void parler() ;

	@Override
	public void manger() {
		System.out.println("je mange de la viande, miam !");

	}

	@Override
	public abstract void seDeplacer() ;

}
