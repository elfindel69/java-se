
package test.java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//déclaration de variables
		int testEntier = 0;
		double testDouble = 0.0;
		boolean testBoolean = true;
		Integer integer1 = 1;
		
		//affichage
		System.out.print("Bonjour ");
		System.out.print("le monde!\n");
		
		System.out.println("double: "+testDouble);
		System.out.println("bool: "+testBoolean);
		System.out.println("int: "+ integer1);
		try {
			testEntier = Integer.parseInt("un");
		}
		catch (Exception e) {
			System.out.println("erreur de conversion");
		}
		
		System.out.println("test Entier: "+ testEntier);
		
		String prenom = "Toto";
		String nom = "Delgado";
		String fullName = prenom+" "+nom;
		System.out.println(fullName);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quel est votre numéro favori? ");
		int nb = 0;
		try {
			nb = sc.nextInt();
		}
		catch (Exception e) {
			System.out.println("mauvaise entrée :(");
		}
		sc.nextLine();
		System.out.println("Quel est votre héros favori? ");
		String text = sc.nextLine();
		
		System.out.println("nombre choisi: "+nb);
		System.out.println("héros choisi: "+text);
		
		sc.close();
		
	}

}
