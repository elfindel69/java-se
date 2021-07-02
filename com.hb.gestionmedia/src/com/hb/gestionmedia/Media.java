package com.hb.gestionmedia;

/**
 * classe abstraite gestion de media
 * @author elfindel69
 *
 */
public abstract class Media {
	/**
	 * numéro d'enregistrement
	 */
	protected String noEnregistrement;
	
	/**
	 * titre du média
	 */
	protected String titre;
	
	/**
	 * getter noEnregistrement
	 * @return numéro d'entregistement du media
	 */
	public String getNoEnregistrement() {
		return noEnregistrement;
	}
	
	/**
	 * setter noEnregistrement
	 * @param noEnregistrement nouveau numéro d'enregistement
	 */
	public void setNoEnregistrement(String noEnregistrement) {
		this.noEnregistrement = noEnregistrement;
	}
	
	/**
	 * getter titre
	 * @return titre du media
	 */
	public String getTitre() {
		return titre;
	}
	
	/**
	 * setter titre
	 * @param titre nouveau titre
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	/**
	 * constructeur par défaut
	 */
	public Media() {
		
	}
	
	/**
	 * constructeur avec paramètres
	 * @param noEnregistrement numéro d'enregistement
	 * @param titre titre du media
	 */
	public Media(String noEnregistrement, String titre) {
		this.noEnregistrement = noEnregistrement;
		this.titre = titre;
	}
	
	/**
	 * méthode d'affichage
	 */
	public void afficher() {
		System.out.println("n° d'enregistrement: "+noEnregistrement+",");
		System.out.println("titre: "+titre);
		System.out.println("#####");
	}
	
	
	
}
