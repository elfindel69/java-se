package com.hb.gestionmedia;

/**
 * classe de gestion de CD
 * @author elfindel69
 *
 */
public class CDaudio extends Media{
	private int nbPistes;
	private String auteur;
	private String compositeur;
	
	/**
	 * getter nbPistes
	 * @return nombre de pistes du CD
	 */
	public int getNbPistes() {
		return nbPistes;
	}

	/**
	 * setter nbPistes
	 * @param nbPistes nouveau nombre de pistes
	 */
	public void setNbPistes(int nbPistes) {
		this.nbPistes = nbPistes;
	}


	/**
	 * getter auteur
	 * @return auteur du CD
	 */
	public String getAuteur() {
		return auteur;
	}

	/**
	 * setter auteur
	 * @param auteur nouvel auteur
	 */
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	/**
	 * getter compositeur
	 * @return compositeur du CD
	 */
	public String getCompositeur() {
		return compositeur;
	}

	/**
	 * setter compositeur
	 * @param compositeur nouveau compositeur
	 */
	public void setCompositeur(String compositeur) {
		this.compositeur = compositeur;
	}

	/**
	 * constructeur par défaut
	 */
	public CDaudio() {
		super();
	}

	/**
	 * constructeur avec paramètres
	 * @param titre titre du CD
	 * @param nbPistes nombre de pistes du CD
	 * @param auteur auteur du CD
	 * @param compositeur compositeur du CD
	 */
	public CDaudio(String titre, String auteur, String compositeur, int nbPistes) {
		super(titre);
		this.nbPistes = nbPistes;
		this.auteur = auteur;
		this.compositeur = compositeur;
	}
	
	/**
	 * méthode d'affichage
	 */
	@Override
	public void afficher() {
		super.afficher();
		System.out.println("auteur: "+auteur+",");
		System.out.println("compositeur: "+compositeur+",");
		System.out.println("nbPistes: "+nbPistes);
		System.out.println("#####");
	}
	

}
