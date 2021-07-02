package com.hb.gestionmedia;

/**
 * classe gestion d'encyclopedie
 * @author elfindel69
 *
 */
public class Encyclopedie extends Media {
	/**
	 * langue de l'encyclopédie
	 */
	private String langue;
	/**
	 * nombre de volumes
	 */
	private int nbVolumes;
	
	/**
	 * getter langue
	 * @return langue de l'encyclopedie
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
	 * getter nbVolumes
	 * @return nombre de volumes de l'encyclopedie
	 */
	public int getNbVolumes() {
		return nbVolumes;
	}
	
	/**
	 * setter nbVolumes
	 * @param nbVolumes nouveau nombre de volumes
	 */
	public void setNbVolumes(int nbVolumes) {
		this.nbVolumes = nbVolumes;
	}

	/**
	 * constructeur par défaut
	 */
	public Encyclopedie() {
		super();
	}

	/**
	 * constructeur avec paramètres
	 * @param noEnregistrement n° d'enregistrement de l'encyclopédie
	 * @param titre titre de l'encyclopédie
	 * @param langue langue de l'encyclopédie
	 * @param nbVolumes nombre de volumes de l'encyclopédie
	 */
	public Encyclopedie(String noEnregistrement, String titre, String langue, int nbVolumes) {
		super(noEnregistrement,titre);
		this.langue = langue;
		this.nbVolumes = nbVolumes;
	}
	
	/**
	 * méthode d'affichage
	 */
	@Override
	public void afficher() {
		super.afficher();
		System.out.println("langue: "+langue+",");
		System.out.println("nombre de volumes: "+nbVolumes);
		System.out.println("#####");
		
	}
	
	
	
	
	
	

}
