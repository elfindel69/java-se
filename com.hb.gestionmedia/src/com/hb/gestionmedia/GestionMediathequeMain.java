package com.hb.gestionmedia;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 * classe main
 * @author elfindel69
 *
 */
public class GestionMediathequeMain {
	
	/**
	 * scanner
	 */
	public static Scanner sc = new Scanner(System.in);
	/**
	 * gestionnaire de médiathèque
	 */
	public static GestionMediatheque mediatheque = new GestionMediatheque();
	
	/**
	 * méthode de création d'adhérent
	 */
	private static void creerAdherent() {
		//initialisation objet adhérent
		Adherent adherent = new Adherent();
		//saisie du prénom
		System.out.println("entrer un prénom: ");
		String prenom = sc.nextLine();
		adherent.setPrenom(prenom);
		
		//saisie du nom
		System.out.println("entrer un nom: ");
		String nom = sc.nextLine();
		adherent.setNom(nom);
		
		//saisie de l'email
		System.out.println("entrer un email: ");
		String email = sc.nextLine();
		adherent.setEmail(email);
		
		//saisie de l'adresse
		System.out.println("entrer une adresse: ");
		String adresse = sc.nextLine();
		adherent.setAdresse(adresse);
		
		//saisie du téléphone
		System.out.println("entrer un téléphone: ");
		String telephone = sc.nextLine();
		adherent.setTelephone(telephone);
		
		//ajout à la liste d'adhérents
		mediatheque.ajouterAdherent(adherent);
	}
	
	/**
	 * méthode de création de livre
	 */
	private static void creerLivre() {
		//initialisation de l'objet livre
		Livre livre = new Livre();
		
		//saisie du titre
		String titre = saisirTitre();
		livre.setTitre(titre);
		
		//saisie de l'auteur
		String auteur = saisirAuteur();
		livre.setAuteur(auteur);
		
		//saisie nombre de pages
		System.out.println("entrer un nombre de pages : ");
		int nbPages = 0;
		//test entrée clavier
		try {
			nbPages = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.err.println("Mauvaise saisie :(");
		}
		//setter du nombre de pages
		livre.setNbPages(nbPages);
		
		//ajout à la liste des médias
		mediatheque.ajouterMedia(livre);
	}
	
	/**
	 * méthode de création d'encyclopédie
	 */
	private static void creerEncyclopedie() {
		//initialisation de l'objet
		Encyclopedie encyclopedie = new Encyclopedie();
		
		//saisie du titre
		String titre = saisirTitre();
		encyclopedie.setTitre(titre);
		
		//saisie de la langue
		String langue = saisirLangue();
		encyclopedie.setLangue(langue);
		
		//saisie nombre de volumes
		System.out.println("entrer un nombre de volumes : ");
		int nbVolumes = 0;
		//test entrée clavier
		try {
			nbVolumes = Integer.parseInt(sc.nextLine());
		}catch (NumberFormatException e) {
			System.err.println("Mauvaise saisie :(");
		}
		//setter nombre de volumes
		encyclopedie.setNbVolumes(nbVolumes);
		
		//ajout à la liste des médias
		mediatheque.ajouterMedia(encyclopedie);
	}
	
	/**
	 * méthode de création de DVD
	 */
	private static void creerDVD() {
		//initialisation de l'objet
		DVDvideo dvd = new DVDvideo();
		
		//saisie du titre
		String titre = saisirTitre();
		dvd.setTitre(titre);
		
		//saisie de la langue
		String langue = saisirLangue();
		dvd.setLangue(langue);
		
		//saisie de la durée
		System.out.println("entrer une durée (minutes): ");
		int duree = 0;
		//test entrée clavier
		try {
			duree = Integer.parseInt(sc.nextLine());
		}catch (NumberFormatException e) {
			System.err.println("Mauvaise saisie :(");
		}
		//setter durée
		dvd.setDuree(duree);
		
		//ajouter à la liste des médias
		mediatheque.ajouterMedia(dvd);
	}
	
	/**
	 * méthode de création de CD
	 */
	private static void creerCD() {
		//initialisation de  l'objet
		CDaudio cd = new CDaudio();
		
		//saisie du titre
		String titre = saisirTitre();
		cd.setTitre(titre);
		
		//saisie de l'auteur
		String auteur = saisirAuteur();
		cd.setAuteur(auteur);
		
		//saisie du compositeur
		System.out.println("Entrer un compositeur: ");
		String compositeur = sc.nextLine();
		cd.setCompositeur(compositeur);
		
		//saisie du nombre de pistes
		System.out.println("entrer un nombre de pistes: ");
		int nbPistes = 0;
		//test entrée clavier
		try {
			nbPistes = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.err.println("Mauvaise saisie :(");
		}
		//setter nombre de pistes
		cd.setNbPistes(nbPistes);
		
		//ajout à la liste des médias
		mediatheque.ajouterMedia(cd);
	}

	/**
	 * méthode de saisie d'un titre
	 * @return titre saisi
	 */
	private static String saisirTitre() {
		//saisie du titre
		System.out.println("Entrer un titre: ");
		String titre = sc.nextLine();
		return titre;
	}
	
	/**
	 * méthode de saisie d'une langue
	 * @return langue saisie
	 */
	private static String saisirLangue() {
		//saisie du titre
		System.out.println("Entrer une langue: ");
		String langue = sc.nextLine();
		return langue;
	}
	
	/**
	 * méthode de saisie d'un auteur
	 * @return langue saisie
	 */
	private static String saisirAuteur() {
		//saisie du titre
		System.out.println("Entrer un auteur: ");
		String auteur = sc.nextLine();
		return auteur;
	}
	
	/**
	 * méthode de création des emprunts
	 * @throws AdherentNotFoundException adhérent non trouvé
	 * @throws MediaNotFoundException média non trouvé
	 */
	private static void creerEmprunt() throws AdherentNotFoundException, MediaNotFoundException {
		//initialisation de l'objet
		Emprunt emprunt = new Emprunt();
		
		//affichage liste des adhérents
		mediatheque.afficherNomAdherents();
		//saisie de l'id de l'adhérent
		System.out.println("entrer l'id d'un adhérent: ");
		int idAdherent = 0;
		//test entrée clavier
		try {
			idAdherent = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.err.println("Mauvaise saisie :(");
		}
		Adherent adherent = null;
	
		adherent = mediatheque.getAdherentById(idAdherent);
		
		if(adherent != null) {
			//setter id adhérent
			emprunt.setIdAdherent(adherent.getId());
		}
		//affichage de la liste des medias
		mediatheque.afficherTitreMedias();
		//saisie de l'id du media
		System.out.println("entrer l'id d'un média: ");
		int idMedia = 0;
		//test entrée clavier
		try {
			idMedia = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.err.println("Mauvaise saisie :(");
		}
		Media media = null;
		
		media = mediatheque.getMediaById(idMedia);
		
		if(media !=null) {
			//setter id media
			emprunt.setIdMedia(idMedia);
		}
		
		//saisie date d'emprunt
		System.out.println("entrer une date d'emprunt (format yyyy-MM-dd): ");
		LocalDate empruntDate = LocalDate.now();
		try {
			empruntDate = LocalDate.parse(sc.nextLine());
		} catch (DateTimeParseException e) {
			System.err.println("date non valide :(");
		}
		
		emprunt.setDateEmprunt(empruntDate);
		
		//saisie date de retour
		System.out.println("entrer une date de retour (format yyyy-MM-dd): ");
		LocalDate retourDate = empruntDate.plusDays(7);
		try {
			retourDate = LocalDate.parse(sc.nextLine());
		} catch (DateTimeParseException e) {
			System.err.println("date non valide :(");
		}
		
		emprunt.setDateRetour(retourDate);
		
		if(adherent != null && media != null) {
			//ajout à la liste des emprunts
			mediatheque.ajouterEmprunt(emprunt);
			System.out.println("Emprunt créé!");
		}
		
	}
	
	/**
	 * menu de gestion de la médithèque
	 */
	public static void menuMediatheque() {
		
		char quit = 'n';
		
		do {
			afficherMenu();
			try {
				doMenu();
			}catch (MenuNotFoundException e) {
				System.err.println(e.getMessage());
			}
			
			//saisie menu continuer?
			System.out.println("voulez vous continuer? (y/n)");
			quit = sc.nextLine().charAt(0);
			quit = Character.toLowerCase(quit);
		}while(quit != 'n');
	}

	/**
	 * méthode de choix du menu
	 * @throws MenuNotFoundException menu non trouvé
	 */
	private static void doMenu() throws MenuNotFoundException {
		int choice  = 0;
		//test choix menu
		try {
			//saisie choix
			System.out.println("saisir un nombre (1-9): ");
			choice = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.err.println("mauvaise saisie :(");
		}
		switch (choice) {
		case 1: {
			System.out.println("Liste des médias: ");
			mediatheque.afficherLesMedias();
			break;
		}
		case 2: {
			System.out.println("Liste des adhérents: ");
			mediatheque.afficherLesAdherents();
			break;
		}
		case 3: {
			System.out.println("Liste des emprunts: ");
			mediatheque.afficherLesEmprunts();
			break;
		}
		case 4: {
			System.out.println("Ajout d'un livre: ");
			creerLivre();
			break;
		}
		case 5: {
			System.out.println("Ajout d'un CD: ");
			creerCD();
			break;
		}
		case 6: {
			System.out.println("Ajout d'un DVD: ");
			creerDVD();
			break;
		}
		case 7: {
			System.out.println("Ajout d'une encyclopédie: ");
			creerEncyclopedie();
			break;
		}
		case 8: {
			System.out.println("Ajout d'un adhérent: ");
			creerAdherent();
			break;
		}
		case 9: {
			System.out.println("Ajout d'un emprunt: ");
			try {
				creerEmprunt();
			} catch (MediaNotFoundException e) {
				System.err.println(e.getMessage());
			}catch (AdherentNotFoundException e) {
				System.err.println(e.getMessage());
			}
			break;
		}
		default:
			throw new MenuNotFoundException("mauvais choix :(");
		}
	}

	/**
	 * méthode d'affichage du menu
	 */
	private static void afficherMenu() {
		//affichage menu
		System.out.println("menu: ");
		System.out.println("1. Afficher les medias");
		System.out.println("2. Afficher les adhérents");
		System.out.println("3. Afficher les emprunts");
		System.out.println("4. Créer un livre");
		System.out.println("5. Créer un CD");
		System.out.println("6. Créer un DVD");
		System.out.println("7. Créer une encyclopédie");
		System.out.println("8. Créer un adhérent");
		System.out.println("9. Créer un emprunt");
	}
	
	

	public static void main(String[] args) {
		
		/*Livre livre1 = new Livre("Harry Potter à l'école des Sorciers", "JK Rowling", 308);
		mediatheque.ajouterMedia(livre1);
		
		Encyclopedie en1 = new Encyclopedie("Encyclopaedia Universalis", "français", 30);
		mediatheque.ajouterMedia(en1);
		
		DVDvideo dvd1 = new DVDvideo("Hunger Games", "anglais", 142);
		mediatheque.ajouterMedia(dvd1);
		
		CDaudio cd1 = new CDaudio("Black Album", "Metallica", "Metallica", 12);
		mediatheque.ajouterMedia(cd1);
		
		Livre livre2 = new Livre("Divergent", "Veronica Roth", 488);
		mediatheque.ajouterMedia(livre2);
		
		Encyclopedie en2 = new Encyclopedie("Encyclopédie de la Pleiade", "français", 49);
		mediatheque.ajouterMedia(en2);
		
		DVDvideo dvd2 = new DVDvideo("Moonraker", "anglais", 126);
		mediatheque.ajouterMedia(dvd2);
		
		CDaudio cd2 = new CDaudio("A Night a the Opera", "Queen", "Queen", 14);
		mediatheque.ajouterMedia(cd2);
		
		Adherent ad1 = new Adherent("Doe", "John", "23 rue du lac, 69999 Chambérieux", "john.doe@aol.com","0632659845");
		mediatheque.ajouterAdherent(ad1);
		Adherent ad2 = new Adherent("Martin","Lola", "3 rue du parc, 69006 Lyon", "lolitabanana@caramail.com","0601326568");
		mediatheque.ajouterAdherent(ad2);
		
		Emprunt em1= new Emprunt(1,8,LocalDate.parse("2021-07-05"), LocalDate.parse("2021-07-12"));
		mediatheque.ajouterEmprunt(em1);
		Emprunt em2= new Emprunt(2,6,LocalDate.parse("2021-07-06"), LocalDate.parse("2021-07-14"));
		mediatheque.ajouterEmprunt(em2);*/
		/*//affichage des auteurs
		medias.afficherAuteurs();
		System.out.println("#####");
		
		//affichage des langues
		medias.afficherLangues();
		System.out.println("#####");*/
		
		//affichage des medias
		//mediatheque.afficherLesMedias();
		
		//affichage des adherents
		//mediatheque.afficherLesAdherents();

		//affichage des emprunts
		//mediatheque.afficherLesEmprunts();
		
		menuMediatheque();
		sc.close();
		
	}
}
