package com.hb.gestionmedia;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * classe de gestion des emprunts
 * @author elfindel69
 *
 */
public class Emprunt {

	/**
	 * id de l'adhérent
	 */
	private int idAdherent;
	
	/**
	 * id du media
	 */
	private int idMedia;
	
	/**
	 * date d'emprunt
	 */
	private LocalDate dateEmprunt;
	
	/**
	 * date de retour
	 */
	private LocalDate dateRetour;
	
	/**
	 * getter idAdherent
	 * @return id de l'adhérent
	 */
	public int getIdAdherent() {
		return idAdherent;
	}
	
	/**
	 * setter idAdhérent
	 * @param idAdherent nouvel id de l'adhérent
	 */
	public void setIdAdherent(int idAdherent) {
		this.idAdherent = idAdherent;
	}

	/**
	 * getter idMedia
	 * @return id du média
	 */
	public int getIdMedia() {
		return idMedia;
	}
	
	/**
	 * setter idMedia
	 * @param idMedia nouvel id du media
	 */
	public void setIdMedia(int idMedia) {
		this.idMedia = idMedia;
	}


	/**
	 * getter dateEmprunt
	 * @return date d'emprunt
	 */
	public LocalDate getDateEmprunt() {
		return dateEmprunt;
	}
	
	/**
	 * setter dateEmprunt
	 * @param dateEmprunt nouvelle date d'emprunt
	 */
	public void setDateEmprunt(LocalDate dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}

	/**
	 * getter dateRetour
	 * @return date de retour
	 */
	public LocalDate getDateRetour() {
		return dateRetour;
	}

	/**
	 * setter dateRetour 
	 * @param dateRetour nouvelle date de retour
	 */
	public void setDateRetour(LocalDate dateRetour) {
		this.dateRetour = dateRetour;
	}

	/**
	 * constructeur par défaut
	 */
	public Emprunt() {
		
	}
	
	/**
	 * constructeur avec paramètres
	 * @param idAdherent id de l'adhérent
	 * @param idMedia id du média
	 * @param dateEmprunt date d'emprunt
	 * @param dateRetour date de retour
	 */
	public Emprunt(int idAdherent, int idMedia, LocalDate dateEmprunt, LocalDate dateRetour) {
		this.idAdherent = idAdherent;
		this.idMedia = idMedia;
		this.dateEmprunt = dateEmprunt;
		this.dateRetour = dateRetour;
	}
	
	/**
	 * méthode d'affichage
	 */
	public void afficher() {
		//Create formatter
		final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("id de l'adhérent: "+idAdherent+",");
		System.out.println("id du media: "+idMedia+",");
		System.out.println("date d'emprunt: "+FORMATTER.format(dateEmprunt)+",");
		System.out.println("date de retour: "+FORMATTER.format(dateRetour)+",");
		System.out.println("#####");
	}

}
