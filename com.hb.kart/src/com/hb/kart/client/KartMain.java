package com.hb.kart.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hb.kart.builders.ParticipationBuilder;
import com.hb.kart.factories.ImmatriculationFactory;
import com.hb.kart.iterators.ClientCollection;
import com.hb.kart.pojos.Banane;
import com.hb.kart.pojos.Boomerang;
import com.hb.kart.pojos.Burger;
import com.hb.kart.pojos.CarapaceTortue;
import com.hb.kart.pojos.Client;
import com.hb.kart.pojos.Kart;
import com.hb.kart.pojos.KartDecorator;
import com.hb.kart.pojos.LanceRoquette;
import com.hb.kart.pojos.Participation;
import com.hb.kart.pojos.Repas;
import com.hb.kart.pojos.Sushi;

public class KartMain {

	private static Scanner sc = new Scanner(System.in);
	private static ClientCollection clientCollection = new ClientCollection();
	private static List<Participation> participations = new ArrayList<Participation>();
	private static List<Repas> repas = new ArrayList<Repas>();
	private static List<Kart> karts = new ArrayList<Kart>();
	
	public static void afficherMenu() {
			System.out.println("1. Ajouter un client");
			System.out.println("2. Voir les clients");
			System.out.println("3. Ajouter une participation");
			System.out.println("4. Voir les participations");
			System.out.println("5. Quitter");

	}
	
	
	private static int saisirChoix(String msg) {
		int choix = 0;
		
		System.out.println(msg);
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
	
	private static void ajouterParticipation() {
		if(clientCollection.size() > 0) {
			ParticipationBuilder builder = new ParticipationBuilder();
			//récupération client
			System.out.println("liste des clients");
			afficherClients();
			int clientId = saisirChoix("saisir un id de client");
			Client client = clientCollection.get(clientId-1);
			builder.definirClient(client);
			
			//récupération kart
			System.out.println("liste des karts:");
			afficherKarts();
			System.out.println("saisir une immatriculation de kart");
			String immatString = sc.nextLine();
			Kart kart = getKart(immatString);
			
			//si kart trouvé
			if(kart != null) {
				System.out.println("Souhaitez vous ajouter une option au kart ? (o/n");
				String choixString = sc.nextLine();
				//ajout d'une option
				if(choixString.equalsIgnoreCase("o")) {
					
					System.out.println("liste des options");
					afficherOptions();
					System.out.println("saisir une option");
					int idOption = saisirChoix("saisir un id d'option");
					
					KartDecorator kartDecorator = ajouterOption(kart, idOption);
					
					String kartMsg = String.format("Vous avez ajouté au kart l’option « %s ». Prix Total du\r\n"
							+ "kart : %d €.", kartDecorator.getName(),kartDecorator.getPrice());
					System.out.println(kartMsg);
					builder.definirKart(kartDecorator);
				}else {
					builder.definirKart(kart);
				}
				
				System.out.println("liste des repas");
				for(Repas repasItem : repas ) {
					System.out.println(repasItem);
				}
				int idRepas = saisirChoix("saisir un id de repas");
				Repas repasItem = repas.get(idRepas - 1);
				
				builder.definirRepas(repasItem);
				Participation participation = builder.build();
				participations.add(participation);
				
				System.out.println(participation);
			}
			//sinon afficher erreur
			else {
				System.out.println("pas de kart trouvé :(");
			}
			
		}else {
			System.out.println("pas de clients :(");
		}
		
		
	}


	private static void afficherOptions() {
		System.out.println("1. Lance-roquette");
		System.out.println("2. Banane");
		System.out.println("3. Carapace de tortue");
		System.out.println("4. Boomerang");
		
	}


	private static Kart getKart(String immatString) {
		for(Kart kart : karts) {
			if (kart.getRegistrationString().equals(immatString)) {
				return kart;
			}
		}
		return null;
	}


	private static KartDecorator ajouterOption(Kart kart,  int idOption) {
		KartDecorator optKart = null;
		
		switch (idOption) {
		case 1: {
			optKart = new LanceRoquette(kart);
			break;
		}
		case 2: {
			optKart = new Banane(kart);
			break;
		}
		case 3: {
			optKart = new CarapaceTortue(kart);
			break;
		}
		case 4:{
			optKart = new Boomerang(kart);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + idOption);
		}
		
		return optKart;
	}


	private static void afficherKarts() {
		for (Kart kart : karts) {
			System.out.println(kart);
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
				choix = saisirChoix("saisir un choix");
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
			 		try {
			 			ajouterParticipation();
			 		}catch (Exception e) {
						System.out.println("erreur de saisie: "+e.getMessage());
					}
					
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
		
		generateKart();
		
		repas.add(new Burger("burger"));
		repas.add(new Sushi("sushi"));
		
		//menu console
		consoleMenu();
	
		
		sc.close();

	}


	private static void generateKart() {
		ImmatriculationFactory factory = ImmatriculationFactory.getInstance();
		for (int i = 1; i < 11; i++) {
			Kart kart = new Kart();
			kart.setRegistrationString(factory.generateImmatriculation());
			kart.setName("Kart"+i);
			kart.setPrice(50);
			karts.add(kart);
		}
	}


	


	

	


	

	

}
