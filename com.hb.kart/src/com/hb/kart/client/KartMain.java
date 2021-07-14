package com.hb.kart.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hb.kart.factories.KartFactory;
import com.hb.kart.iterators.ClientCollection;
import com.hb.kart.pojos.Burger;
import com.hb.kart.pojos.Client;
import com.hb.kart.pojos.Kart;
import com.hb.kart.pojos.KartDecorator;
import com.hb.kart.pojos.Participation;
import com.hb.kart.pojos.Repas;
import com.hb.kart.pojos.Sushi;

public class KartMain {

	private static Scanner sc = new Scanner(System.in);
	private static ClientCollection clientCollection = new ClientCollection();
	private static List<Participation> participations = new ArrayList<Participation>();
	private static List<Repas> repas = new ArrayList<Repas>();
	
	public static void afficherMenu() {
			System.out.println("1. Ajouter un client");
			System.out.println("2. Voir les clients");
			System.out.println("3. Ajouter une participation");
			System.out.println("4. Voir les participations");
			System.out.println("5. Quitter");

	}
	
	
	private static int choixMenu() {
		int choix = 0;
		
		System.out.println("Saisir un choix");
		choix = Integer.parseInt(sc.nextLine());
		
		return choix;
	}
	
	private static void ajouterClient() {
		Client client = new Client();
		
		System.out.println("Saisir un prénom: ");
		String firstName = sc.nextLine();
		client.setFirstName(firstName);
		
		System.out.println("Saisir un nom: ");
		String lastName = sc.nextLine();
		client.setLastName(lastName);
		
		clientCollection.add(client);
		
	}
	
	private static void afficherClients() {
		System.out.println("liste des clients");
		
		for (Client client : clientCollection) {
			System.out.println(client);
		}
		
	}
	
	private static void afficherParticipations() {
		System.out.println("liste des participations");
		
		for (Participation participation : participations) {
			System.out.println(participation);
		}
		
	}
	private static void consoleMenu() {
		int choix = 0;
		do {
			choix = 0;
			afficherMenu();
			try {
				choix = choixMenu();
			}catch (NumberFormatException e) {
				System.out.println("mauvaise saisie: "+e.getMessage());
			}
			 
			 switch (choix) {
			 	case 1: {
			 		ajouterClient();
			 		break;
			 	}
			 	case 2: {
					afficherClients();
			 		break;
			 	}
			 	case 3: {
					
			 		break;
			 	}
			 	case 4: {
					afficherParticipations();
			 		break;
			 	}
			 	case 5:{
			 		return;
			 	}
			 	default:
			 		System.out.println("choix invalide: "+choix);
			 }
		}while(choix != 5);
	}
	
	public static void main(String[] args) {
		
		/*repas.add(new Burger("burger"));
		repas.add(new Sushi("sushi"));*/
		KartFactory factory = KartFactory.getInstance();
		KartDecorator kart1 = factory.generateKart("banane");
		System.out.println("kart1: "+kart1.getKart());
		KartDecorator kart2 = factory.generateKart("boomerang");
		System.out.println("kart1: "+kart2.getKart());
		KartDecorator kart3 = factory.generateKart("carapace");
		System.out.println("kart1: "+kart3.getKart());
		KartDecorator kart4 = factory.generateKart("lance roquette");
		System.out.println("kart1: "+kart4.getKart());
		//menu console
		//consoleMenu();
	
		
		sc.close();

	}


	


	

	


	

	

}
