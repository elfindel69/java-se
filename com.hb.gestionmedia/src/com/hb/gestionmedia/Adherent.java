package com.hb.gestionmedia;

/**
 * classe de gestion des adhérents
 * @author elfindel69
 *
 */
public class Adherent {
	/**
	 * id statique auto généré
	 */
	private static int sId = 0;
	
	/**
	 * id de l'adhérent
	 */
	private int id;
	
	/**
	 * nom de l'adhérent
	 */
	private String nom;
	
	/**
	 * prénom de l'adhérent
	 */
	private String prenom;
	
	/**
	 * adresse de l'adhérent
	 */
	private String adresse;
	
	/**
	 * email de l'adhérent
	 */
	private String email;
	
	/**
	 * téléphone de l'adhérent
	 */
	private String telephone;
	
	/**
	 * getter nom
	 * @return nom de l'adhérent
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * setter nom
	 * @param nom nouveau nom de l'adhérent
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * getter prénom
	 * @return prénom de l'adhérent
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * setter prenom
	 * @param prenom nouveau prénom de l'adhérent
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * getter adresse
	 * @return adresse de l'adhérent
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * setter adresse
	 * @param adresse nouvelle adresse de l'adhérent
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * getter email
	 * @return email de l'adhérent
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * setter email
	 * @param email nouvel email de l'adhérent
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * getter telephone
	 * @return téléphone de l'adhérent
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * setter telephone
	 * @param telephone nouveau téléphone de l'adhérent
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	/**
	 * getter id
	 * @return id de l'adhérent
	 */
	public int getId() {
		return id;
	}

	/**
	 *constructeur par défaut
	 *initialise l'id
	 */
	public Adherent() {
		id = ++sId;
	}
	
	/**
	 * constructeur avec paramètres
	 * @param nom nom de l'adhérent
	 * @param prenom prénom de l'adhérent
	 * @param adresse adresse de l'adhérent
	 * @param email email de l'adhérent
	 * @param telephone telephone de l'adhérent
	 */
	public Adherent(String nom, String prenom, String adresse, String email, String telephone) {
		this();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.email = email;
		this.telephone = telephone;
	}
	
	/**
	 * méthode d'affichage
	 */
	public void afficher() {
		System.out.println("prénom: "+prenom+",");
		System.out.println("nom: "+nom+",");
		System.out.println("adresse"+adresse+",");
		System.out.println("email: "+email+",");
		System.out.println("téléphone: "+telephone);
		System.out.println("######");
		
		
	}

}
