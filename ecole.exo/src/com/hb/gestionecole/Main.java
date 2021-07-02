package com.hb.gestionecole;

/**
 * classe main
 * @author elfindel69
 *
 */
public class Main {
	
	private static void setMoyennes(Eleve eleve, double[] moyennes) {
		 for (int i = 0; i < moyennes.length; i++) {
			eleve.modifierMoyenne(moyennes[i], i);
		}
	}
	
	public static void main(String[] args) {
		//initialisation école
		Ecole ecole = new Ecole("Video Games High School", "3 rue du lac, 69999 Chambérieux", 15_000_000);
		//initialisation variables élèves
		//élève 1
		double[] moy1 = {12,12.5,13,14,15};
		Eleve eleve1 = new Eleve("Bonneau", "Jean", 19, "101");
		//moyennes élève 1
		setMoyennes(eleve1,moy1);
		
		//élève 2
		double[] moy2 = {12,13,14,15,16};
		Eleve eleve2 = new Eleve("Sureau" , "Clara", 19, "101");
		//moyennes élève 2
		setMoyennes(eleve2,moy2);
		
		//élève 3
		double[] moy3 = {14,15,14,15,16};
		Eleve eleve3 = new Eleve("leBlanc" , "Matt", 19, "101");
		//moyennes élève 3
		setMoyennes(eleve3,moy3);
		
		//ajout des élèves à l'école
		ecole.ajouterEleve(eleve1);
		ecole.ajouterEleve(eleve2);
		ecole.ajouterEleve(eleve3);
		
		//initialisation variables profs
		Professeur prof1 = new Professeur("Lennon", "Bob", 34, 3000);
		Professeur prof2 = new Professeur("du Grenier", "Fred", 38, 2500);
		Professeur prof3 = new Professeur("the Rambler", "Alex", 31, 2700);
		
		//ajout des profs à l'école
		ecole.ajouterProfesseur(prof1);
		ecole.ajouterProfesseur(prof2);
		ecole.ajouterProfesseur(prof3);
		
		//affichage variables
		ecole.afficher();
		/*
		//affichage moyennes
		System.out.println("Moyennes générales:");
		System.out.println(eleve1.getPrenom()+" "+eleve1.getNom()+" : "+eleve1.moyenneGen());
		System.out.println(eleve2.getPrenom()+" "+eleve2.getNom()+" : "+eleve2.moyenneGen());
		System.out.println(eleve3.getPrenom()+" "+eleve3.getNom()+" : "+eleve3.moyenneGen());
		
		//modification moyenne
		eleve1.modifierMoyenne(11,1);
		System.out.println("moyenne modifiée: ");
		System.out.println(eleve1.prenom+" "+eleve1.nom);
		eleve1.afficherMoyennes();
		System.out.println("moyenne générale : "+eleve1.moyenneGen());
		
		//vieillissement
		prof3.vieillir();
		System.out.println("affichage prof viellli: ");
		prof3.afficher();
		
		//calcul des couts
		System.out.println(prof1.getPrenom()+" "+prof1.getNom()+", cout annuel: "+prof1.calculCout());
		System.out.println(prof2.getPrenom()+" "+prof2.getNom()+", cout annuel: "+prof2.calculCout());
		System.out.println(prof3.getPrenom()+" "+prof3.getNom()+", cout annuel: "+prof3.calculCout());
		*/
	}
	
}
