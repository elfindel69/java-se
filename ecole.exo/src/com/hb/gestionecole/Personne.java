package com.hb.gestionecole;

/**
 * classe de gestion des personnes
 * @author elfindel69
 *
 */
public class Personne {
	/**
	 * nom de la personne
	 */
	protected String nom;
	/**
	 * prenom de la personne
	 */
	protected String prenom;
	/**
	 * age de la personne
	 */
	protected int age;
	
	
	/**
	 * getter nom
	 * @return nom de la personne
	 */
	public String getNom() {
		return this.nom;
	}
	
	/**
	 * setter nom
	 * @param nom nouveau nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/**
	 * getter prenom
	 * @return prenom de la personne
	 */
	public String getPrenom() {
		return this.prenom;
	}
	
	/**
	 * setter prenom
	 * @param prenom nouveau prénom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	/**
	 * getter age
	 * @return age de la personne
	 */
	public int getAge() {
		return this.age;
	}
	
	/**
	 * setter age
	 * @param age nouvel age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * constructeur par défaut
	 */
	public Personne() {
		
	}
	
	/**
	 * constructeur avec paramètres
	 * @param nom nom de la personne
	 * @param prenom prenom de la personne
	 * @param age age de la personne
	 */
	public Personne(String nom, String prenom,  int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	/**
	 * méthode d'affichage
	 */
	public void afficher() {
		System.out.println("prenom: "+prenom+",");
		System.out.println("nom: "+nom+",");
		System.out.println("age: "+age+" ans");
		System.out.println("#####");
	}
	
	/**
	 * méthode de vieillissement
	 * incrément l'age de la personne
	 */
	public void vieillir() {
		++age;
	}
	
}
