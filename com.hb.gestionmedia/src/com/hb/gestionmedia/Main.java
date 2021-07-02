package com.hb.gestionmedia;

/**
 * classe main
 * @author elfindel69
 *
 */
public class Main {
	
	public static void main(String[] args) {
		GestionDeMedia medias = new GestionDeMedia();
		Livre livre1 = new Livre("001", "Harry Potter à l'école des Sorciers", "JK Rowling", 308);
		medias.ajouterMedia(livre1);
		
		Encyclopedie en1 = new Encyclopedie("002","Encyclopaedia Universalis", "français",30 );
		medias.ajouterMedia(en1);
		
		DVDvideo dvd1 = new DVDvideo("003", "Hunger Games", "anglais", 142);
		medias.ajouterMedia(dvd1);
		
		CDaudio cd1 = new CDaudio("004","Black Album",12,"Metallica", "Metallica");
		medias.ajouterMedia(cd1);
		
		Livre livre2 = new Livre("005", "Divergent", "Veronica Roth", 488);
		medias.ajouterMedia(livre2);
		
		Encyclopedie en2 = new Encyclopedie("006","Encyclopédie de la Pleiade", "français", 49);
		medias.ajouterMedia(en2);
		
		DVDvideo dvd2 = new DVDvideo("007", "Moonraker", "anglais", 126);
		medias.ajouterMedia(dvd2);
		
		CDaudio cd2 = new CDaudio("008", "A Night a the Opera", 14, "Queen", "Queen");
		medias.ajouterMedia(cd2);
		
		
		//affichage des auteurs
		medias.afficherAuteurs();
		System.out.println("#####");
		
		//affichage des langues
		medias.afficherLangues();
		System.out.println("#####");
		
		//affichage des medias
		medias.afficherLesMedias();
	}
}
