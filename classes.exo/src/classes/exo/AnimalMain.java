package classes.exo;

import java.util.ArrayList;
import java.util.List;

import classes.exo.carnivore.Chat;
import classes.exo.carnivore.Chien;
import classes.exo.herbivore.Poule;
import classes.exo.herbivore.Vache;

public class AnimalMain {

	public static void main(String[] args) {
		Chien yorkChien = new Chien("Ron", 1,Sexe.Male, "gris et feu", true);
		Chat chat1 = new Chat("Potter", 3,Sexe.Male, "gris et blanc", true);
		Chien chien1= new Chien("Medor", 5,Sexe.Male, "beige");
		Chat chat2 = new Chat("Minouche", 6, Sexe.Femelle, "gris");
		Poule poule1 = new Poule("Titi", 3, Sexe.Male, "blanc");
		Vache vache1 = new Vache("Marguerite", 4, Sexe.Femelle, "beige");
		
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(yorkChien);
		animals.add(chat1);
		animals.add(chien1);
		animals.add(chat2);
		animals.add(poule1);
		animals.add(vache1);
		
		for (Animal animal : animals) {
			System.out.println(animal);
			animal.parler();
			animal.manger();
			animal.seDeplacer();
			if(animal instanceof Chien) {
				Chien chien = (Chien) animal;
				chien.caresser();
				chien.afficheCollier();
			}
			if(animal instanceof Chat) {
				Chat chat = (Chat) animal;
				chat.caresser();
			}
			if(animal instanceof Vache) {
				Vache vache = (Vache) animal;
				vache.donnerLait();
			}
			if(animal instanceof Poule) {
				Poule poule = (Poule) animal;
				poule.pondreOeufs();
			}
		}
		
		
	}
}
