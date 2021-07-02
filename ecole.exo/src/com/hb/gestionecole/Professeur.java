package com.hb.gestionecole;

/**
 * classe de gestion des professeurs
 * @author elfindel69
 *
 */
public class Professeur extends Personne {
	/**
	 * salaire du professeur
	 */
	private double salaire;
	
	/**
	 * getter salaire
	 * @return salaire du professeur
	 */
	public double getSalaire() {
		return salaire;
	}

	/**
	 * setter salaire
	 * @param salaire nouveau salaire
	 */
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	
	/**
	 * constructeur par défaut
	 */
	public Professeur() {
		super();
	}
	
	/**
	 * constructeur avec paramètres
	 * @param nom nom du professeur
	 * @param prenom prénom du professeur
	 * @param age age du professeur
	 * @param salaire salaire du professeur
	 */
	public Professeur(String nom, String prenom, int age, double salaire) {
		super(nom, prenom, age);
		this.salaire = salaire;
	}

	/**
	 * méthode d'affichage
	 */
	@Override
	public void afficher() {
		//affichage des paramètres
		super.afficher();
		System.out.println("salaire: "+this.salaire);
		System.out.println("#####");
	}
	
	/**
	 * méthode de calcul du cout annuel
	 * @return cout annuel calculé
	 */
	public double calculCout() {
		return this.salaire * 12;
	}
}
