package com.hb.gestionmedia;

import java.util.ArrayList;
import java.util.List;

/**
 * classe manager gestion de la médiatheque
 * @author elfindel69
 *
 */
public class GestionMediatheque {

	/**
	 * liste de medias
	 */
	private List<Media> medias = new ArrayList<Media>();
	
	/**
	 * liste d'adhérents
	 */
	private List<Adherent> adherents = new ArrayList<Adherent>();
	
	/**
	 * liste d'emprunts
	 */
	private List<Emprunt> emprunts = new ArrayList<Emprunt>();
	
	/**
	 * méthode d'affichage des medias
	 */
	public void afficherLesMedias(){
		for (Media media : medias) {
			media.afficher();
		}
	}
	
	/**
	 * méthode d'affichage du titre des médias
	 */
	public void afficherTitreMedias(){
		for (Media media : medias) {
			System.out.println("id du media:"+media.getId());
			System.out.println("titre: "+media.getTitre());
		}
	}
	
	/**
	 * méthode d'ajout des medias
	 * @param media media à ajouter
	 */
	public void ajouterMedia(Media media) {
		medias.add(media);
	}
	
	/**
	 * affiche les auteurs des medias (Livre et CD)
	 */
	public void afficherAuteurs() {
		for (Media media : medias) {
			if(media instanceof Livre) {
				Livre livre = (Livre) media;
				System.out.println("n° d'enregistrement: "+ livre.getId());
				System.out.println("auteur: "+livre.getAuteur());
			}
			if(media instanceof CDaudio) {
				CDaudio cd = (CDaudio) media;
				System.out.println("n° d'enregistrement: "+ cd.getId());
				System.out.println("auteur: "+cd.getAuteur());
			}
		}
	}
	
	/**
	 * affiche les langues des medias (DVD et Encyclopedie)
	 */
	public void afficherLangues() {
		for (Media media : medias) {
			if(media instanceof DVDvideo) {
				DVDvideo dvd = (DVDvideo) media;
				System.out.println("n° d'enregistrement: "+ dvd.getId());
				System.out.println("langue: "+dvd.getLangue());
			}
			if(media instanceof Encyclopedie) {
				Encyclopedie en = (Encyclopedie) media;
				System.out.println("n° d'enregistrement: "+ en.getId());
				System.out.println("langue: "+en.getLangue());
			}
		}
	}
	
	/**
	 * méthode d'affichage des adhérents
	 */
	public void afficherLesAdherents(){
		for (Adherent ad : adherents) {
			ad.afficher();
		}
	}
	
	/**
	 * méthode d'affichage du nom des adhérents
	 */
	public void afficherNomAdherents(){
		for (Adherent ad : adherents) {
			System.out.println("id de l'adhérent:"+ad.getId());
			System.out.println("prénom: "+ad.getPrenom()+", nom: "+ad.getNom());
		}
	}
	
	
	/**
	 * méthode d'ajout des adhérents
	 * @param ad adhérent à ajouter
	 */
	public void ajouterAdherent(Adherent ad) {
		adherents.add(ad);
	}
	
	/**
	 * méthode d'affichage des emprunts
	 */
	public void afficherLesEmprunts(){
		for (Emprunt em : emprunts) {
			em.afficher();
		}
	}
	
	/**
	 * méthode d'ajout des adhérents
	 * @param ad adhérent à ajouter
	 */
	public void ajouterEmprunt(Emprunt em) {
		
		emprunts.add(em);
	}

	/**
	 * méthode de test d'id adhérent
	 * @param idAdherent id à tester
	 * @return id présent?
	 */
	public boolean testIdAdherent(int idAdherent) {
		for (Adherent adherent : adherents) {
			if(adherent.getId() == idAdherent) {
				return true;
			}
		}
		return false;
	}

	public boolean testIdMedia(int idMedia) {
		for (Media media : medias) {
			if(media.getId() == idMedia) {
				return true;
			}
		}
		return false;
	}
}
