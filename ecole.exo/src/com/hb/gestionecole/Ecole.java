package com.hb.gestionecole;

import java.util.ArrayList;
import java.util.List;

/**
 * classe de gestion d'écoles
 * @author elfindel69
 *
 */
public class Ecole {
	/**
	 * nom de l'école
	 */
	private String nom;
	
	/**
	 * adresse de l'école
	 */
	private String adresse;
	
	/**
	 * budget alloué
	 */
	private int budget;
	
	/**
	 * liste des professeurs
	 */
	private List<Professeur> professeurs = new ArrayList<Professeur>();
	
	/**
	 * liste des élèves
	 */
	private List<Eleve> eleves = new ArrayList<Eleve>();
	
	/**
	 * getter nom
	 * @return nom de l'école
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * setter nom
	 * @param nom nouveau nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * getter adresse
	 * @return adresse de l'école
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * setter adresse
	 * @param adresse nouvelle adresse
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * getter budget
	 * @return budget alloué
	 */
	public int getBugdet() {
		return budget;
	}

	/**
	 * setter budget
	 * @param budget nouveau budget
	 */
	public void setBudget(int budget) {
		this.budget = budget;
	}

	/**
	 * constructeur par défaut
	 */
	public Ecole() {
		
	}
	
	/**
	 * constructeur avec paramètres
	 * @param nom nom de l'école
	 * @param adresse adresse de l'école
	 * @param budget budget alloué
	 */
	public Ecole(String nom, String adresse, int budget){
		this.nom = nom;
		this.adresse = adresse;
		this.budget = budget;
	}
	
	/**
	 * méthode d'affichage des élèves
	 */
	public void afficherEleves() {
		//affichage des élèves
		System.out.println("liste des eleves: ");
		for(Eleve eleve : eleves ) {
			eleve.afficher();
		}
		System.out.println("nombre d'élèves: "+eleves.size());
		System.out.println("#####");
	}
	
	/**
	 * méthode d'affichage des professeurs
	 */
	public void afficherProfs() {
		//affichage des profs
		System.out.println("liste des professeurs");
		for(Professeur prof : professeurs ) {
			prof.afficher();
		}
		System.out.println("nombre de professeurs: "+professeurs.size());
		System.out.println("#####");
	}
	
	/**
	 * méthode d'affichage
	 */
	public void afficher() {
		//affichage des propriétés de l'école
		System.out.println("nom: "+nom+",");
		System.out.println("adresse: "+adresse+",");
		System.out.println("budget: "+budget);
		System.out.println("#####");
		//affichage des professeurs
		afficherProfs();
		//affichage des élèves
		afficherEleves();
	}	
	
	/**
	 * méthode d'ajout des élèves
	 * @param eleve élève à ajouter
	 */
	public void ajouterEleve(Eleve eleve) {
		eleves.add(eleve);
	}
	
	/**
	 * méthode d'ajout des profs
	 * @param prof prof à ajouter
	 */
	public void ajouterProfesseur(Professeur prof) {
		professeurs.add(prof);
	}
}
