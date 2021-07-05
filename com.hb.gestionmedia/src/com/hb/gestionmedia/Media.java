package com.hb.gestionmedia;

/**
 * classe abstraite gestion de media
 * @author elfindel69
 *
 */
public abstract class Media {
	/**
	 * id statique auto incrément
	 */
	private static int sId = 0;
	
	/**
	 * id du média
	 */
	protected int id;
	
	/**
	 * titre du média
	 */
	protected String titre;
	
	/**
	 * getter noEnregistrement
	 * @return numéro d'entregistement du media
	 */
	public int getId() {
		return id;
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
	 * attribue l'id au Media
	 */
	public Media() {
		id = ++sId;
	}
	
	/**
	 * constructeur avec paramètres
	 * @param titre titre du media
	 */
	public Media(String titre) {
		this();
		this.titre = titre;
	}
	
	/**
	 * méthode d'affichage
	 */
	public void afficher() {
		System.out.println("n° d'enregistrement: "+id+",");
		System.out.println("titre: "+titre);
		System.out.println("#####");
	}
	
	
	
}
