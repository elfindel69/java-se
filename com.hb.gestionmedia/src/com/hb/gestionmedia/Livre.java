package com.hb.gestionmedia;

/**
 * classe de gestion de livre
 * @author elfindel69
 *
 */
public class Livre extends Media {
	
	/**
	 * auteur du livre
	 */
	private String auteur;
	
	/**
	 * nombre de pages du livre
	 */
	private int nbPages;

	/**
	 * getter auteur
	 * @return auteur du livre
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
	 * getter nbPages
	 * @return nombre de pages
	 */
	public int getNbPages() {
		return nbPages;
	}

	/**
	 * setter nbPages
	 * @param nbPages nouveau nombre de pages
	 */
	public void setNbPages(int nbPages) {
		this.nbPages = nbPages;
	}

	/**
	 * constructeur par défaut
	 */
	public Livre() {
		super();
	}

	/**
	 * constructeur avec paramètres
	 * @param titre titre du livre
	 * @param auteur auteur du livre
	 * @param nbPages nombre de pages du livre
	 */
	public Livre(String titre, String auteur, int nbPages) {
		super(titre);
		this.auteur = auteur;
		this.nbPages = nbPages;
	}
	
	@Override
	public void afficher() {
		super.afficher();
		System.out.println("auteur: "+auteur+",");
		System.out.println("nombre de pages: "+nbPages);
		System.out.println("#####");
	}
}
