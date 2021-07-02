package com.hb.gestionmedia;

import java.util.ArrayList;
import java.util.List;

/**
 * classe manager gestion des listes de medias
 * @author elfindel69
 *
 */
public class GestionDeMedia {

	/**
	 * liste de parents
	 */
	private List<Media> medias = new ArrayList<Media>();
	

	/**
	 * méthode d'affichage
	 */
	public void afficherLesMedias(){
		for (Media media : medias) {
			media.afficher();
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
				System.out.println("n° d'enregistrement: "+ livre.getNoEnregistrement());
				System.out.println("auteur: "+livre.getAuteur());
			}
			if(media instanceof CDaudio) {
				CDaudio cd = (CDaudio) media;
				System.out.println("n° d'enregistrement: "+ cd.getNoEnregistrement());
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
				System.out.println("n° d'enregistrement: "+ dvd.getNoEnregistrement());
				System.out.println("langue: "+dvd.getLangue());
			}
			if(media instanceof Encyclopedie) {
				Encyclopedie en = (Encyclopedie) media;
				System.out.println("n° d'enregistrement: "+ en.getNoEnregistrement());
				System.out.println("langue: "+en.getLangue());
			}
		}
	}
	

}
