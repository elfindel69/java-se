package exercice.java;

import java.util.Scanner;

public class Main {
	
	public static void dataPersonne() {
		String nom, prenom, email, telephone;
		int age = 0;
		//saisie données
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer un prénom:");
		prenom = sc.nextLine();
		System.out.println("Entrer un nom:");
		nom = sc.nextLine();
		System.out.println("Entrer un email:");
		email = sc.nextLine();
		System.out.println("Entrer un telephone:");
		telephone = sc.nextLine();
		try {
			System.out.println("Entrer un age:");
			age = sc.nextInt();
		} catch (Exception e) {
			System.err.println("mauvaise saisie :(");
		}
		//affichage données
		System.out.println("prenom: "+prenom+" nom: "+nom);
		System.out.println("email: "+ email);
		System.out.println("telephone: "+telephone);
		System.out.println("age: "+age);
		
		sc.close();		
	}
	
	public static String positifNegatif() {
		int nb = 0;
		//saisie nombre
		System.out.println("Entrer un nombre: ");
		try {
			Scanner sc= new Scanner(System.in);
			nb = sc.nextInt();
			sc.close();
		}catch (Exception e) {
			System.err.println("mauvaise saisie :(");
		}
		//tests
		if(nb < 0) {
			return "nombre négatif";
		}else if (nb == 0) {
			return "zéro";
			
		}else {
			return "nombre positif";
		}
		
	}
	
	public static String saisieNote() {
		int nb = 0;
		//saisie note
		System.out.println("Entrer un nombre: ");
		try {
			Scanner sc= new Scanner(System.in);
			nb = sc.nextInt();
			sc.close();
		}catch (Exception e) {
			System.err.println("mauvaise saisie :(");
		}
		//tests
		if(nb < 8) {
			return "ajourné";
		}else if (nb > 8 && nb < 10) {
			return "rattrapage";
			
		}else {
			return "admis";
		}
		
	}
	
	public static void testVoyelles() {
		String mot = "";
		String vowel = "aeiouy";
		//compteurs de lettres
		int cptA = 0, cptE = 0, cptI = 0, cptO = 0, cptU = 0, cptY= 0;
		int cpt = 0;
		//saisie mot
		System.out.println("entrer un mot:");
		Scanner sc= new Scanner(System.in);
		mot = sc.next();
		sc.close();
		//recherche des voyelles
		mot = mot.toLowerCase();
		for(int i = 0; i<mot.length(); i++) {
			char c = mot.charAt(i);
			boolean test = vowel.contains(String.valueOf(c));
			if(test) {
				cpt ++;
			}
			switch (c){
				case 'a': 
					cptA++;
					break;
				case 'e':
					cptE++;
					break;
				case 'i':
					cptI++;
					break;
				case 'o':
					cptO++;
					break;
				case 'u':
					cptU++;
					break;
				case 'y':
					cptY++;
					break;
			}
		}
		//affichage
		System.out.println("nombre de voyelles: "+cpt);
		System.out.println("nombre de a: "+cptA);
		System.out.println("nombre de e: "+cptE);
		System.out.println("nombre de i: "+cptI);
		System.out.println("nombre de o: "+cptO);
		System.out.println("nombre de u: "+cptU);
		System.out.println("nombre de y: "+cptY);
	}
	
	
	

	public static void main(String[] args) {
		//dataPersonne();
		/*String res = positifNegatif();
		System.out.println(res);*/
		/*String res2 = saisieNote();
		System.out.println(res2);*/
		
		testVoyelles();
		
	}

}
