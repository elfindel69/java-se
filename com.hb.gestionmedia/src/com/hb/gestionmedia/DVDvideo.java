package com.hb.gestionmedia;

/**
 * classe de gestion de DVD
 * @author elfindel69
 *
 */
public class DVDvideo extends Media {
	
	/**
	 * langue du DVD
	 */
	private String langue;
	
	/**
	 * durée du DVD
	 */
	private int duree;
	
	/**
	 * getter langue
	 * @return langue du DVD
	 */
	public String getLangue() {
		return langue;
	}

	/**
	 * setter langue
	 * @param langue nouvelle langue
	 */
	public void setLangue(String langue) {
		this.langue = langue;
	}

	/**
	 * getter duree
	 * @return duree du DVD
	 */
	public int getDuree() {
		return duree;
	}

	/**
	 * setter duree
	 * @param duree nouvelle duree
	 */
	public void setDuree(int duree) {
		this.duree = duree;
	}

	/**
	 * constructeur par défaut
	 */
	public DVDvideo() {
		super();
	}

	/**
	 * construcrteur avec paramètres
	 * @param noEnregistrement n° d'enregistrement du DVD
	 * @param titre titre du DVD
	 * @param langue langue du DVD
	 * @param duree durée du DVD
	 */
	public DVDvideo(String noEnregistrement, String titre, String langue, int duree) {
		super(noEnregistrement, titre);
		this.langue = langue;
		this.duree = duree;
	}
	
	/**
	 * méthode d'affichage
	 */
	@Override
	public void afficher() {
		super.afficher();
		System.out.println("langue: "+langue+",");
		System.out.println("durée: "+duree);
		System.out.println("#####");
	}
}
