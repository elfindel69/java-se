package exercice.java;

import java.util.Scanner;

/**
 * Classe calculatrice console
 * @author elfindel69
 *
 */
public class CalculatriceMain {
	/**
	 * méthode d'addition
	 * @param nb1 nombre1
	 * @param nb2 nombre2
	 * @return addition
	 */
	private static double add(double nb1, double nb2) {
		return nb1 + nb2;
		
	}
	
	/**
	 * méthode de soustraction
	 * @param nb1 nombre1
	 * @param nb2 nombre2
	 * @return soustraction
	 */
	private static double substract(double nb1, double nb2) {
		return nb1 - nb2;
		
	}
	
	/**
	 * méthode de multiplication
	 * @param nb1 nombre1
	 * @param nb2 nombre2
	 * @return multiplication
	 */
	private static double multiply(double nb1, double nb2) {
		
		return nb1*nb2;
	}
	
	/**
	 * méthode de division
	 * @param nb1 nombre1
	 * @param nb2 nombre2
	 * @return division
	 */
	private static double divide(double nb1, double nb2) {
		
		return nb1/nb2;
	}
	
	/**
	 * méthode de modulo
	 * @param nb1 nombre1
	 * @param nb2 nombre2
	 * @return modulo
	 */
	private static double modulo(double nb1, double nb2) {
		// TODO Auto-generated method stub
		return nb1%nb2;
	}
	
	
	/**
	 * calculatrice avec switch
	 * @return résultat
	 */
	public static double calcSwitch() {
		double nb1 = 0, nb2 = 0;
		char op;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("entrer un premier nombre: ");
			nb1 = sc.nextDouble();
			System.out.println("entrer un deuxième nombre: ");
			nb2 = sc.nextDouble();
			
		}catch (Exception e) {
			System.err.println("mauvaise saisie :(");
			
		}
		System.out.println("entrer une opération: ");
		op = sc.next().charAt(0);
		sc.close();
		
		switch (op) {
		case '+': 
			return add(nb1, nb2);
		case '-' : 
			return substract(nb1, nb2);
		case '*': 
			return multiply(nb1,nb2);
		case '/': 
			return divide(nb1, nb2);
		case '%': 
			return modulo(nb1,nb2);
		default:
			throw new IllegalArgumentException("Unexpected value: " + op);
		}
	}
	
	/**
	 * calculatrice avec if
	 * @return résultat
	 */
	public static double calcIf() {
		double nb1 = 0, nb2 = 0;
		char op;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("entrer un premier nombre: ");
			nb1 = sc.nextDouble();
			System.out.println("entrer un deuxième nombre: ");
			nb2 = sc.nextDouble();
			
		}catch (Exception e) {
			System.err.println("mauvaise saisie :(");
			
		}
		System.out.println("entrer une opération: ");
		op = sc.next().charAt(0);
		sc.close();
		
		if (op == '+') {
			return add(nb1, nb2);
		} else if (op == '-') {
			return substract(nb1, nb2);
		} else if (op == '*') {
			return multiply(nb1,nb2);
		} else if (op == '/') {
			return divide(nb1, nb2);
		} else if (op == '%') {
			return modulo(nb1,nb2);
		} else {
			throw new IllegalArgumentException("Unexpected value: " + op);
		}
			
	}
	
	/**
	 * calculatrice en console
	 */
	public static void calcFor() {
		double nb1 = 0, nb2 = 0;
		char op = ' ';
		Scanner sc = new Scanner(System.in);
		char quit = 'n';
		do {
			try {
				System.out.println("entrer un premier nombre: ");
				nb1 = sc.nextDouble();
				System.out.println("entrer un deuxième nombre: ");
				nb2 = sc.nextDouble();
				
			}catch (Exception e) {
				System.err.println("mauvaise saisie :(");
				
			}
			System.out.println("entrer une opération (+,-,*,/,%) : ");
			op = sc.next().charAt(0);
			
			switch (op) {
				case '+': 
					System.out.println(nb1+" + "+nb2+" = "+add(nb1, nb2));
					break;
				case '-': 
					System.out.println(nb1+" - "+nb2+" = "+substract(nb1, nb2));
					break;
				case '*': 
					System.out.println(nb1+" * "+nb2+" = "+multiply(nb1, nb2));
					break;
				case '/': 
					System.out.println(nb1+" / "+nb2+" = "+divide(nb1, nb2));
					break;
				case '%': 
					System.out.println(nb1+" % "+nb2+" = "+modulo(nb1, nb2));
					break;
				default:
					System.out.println("mauvaise opération :(");
			}
		System.out.println("Voulez vous quitter (y/n) ? ");
		quit = sc.next().charAt(0);
		}while(quit != 'y');
		sc.close();
	}
	
	public static void main(String[] args) {
		/*double res = calcSwitch();
		System.out.println(res);*/
		
		/*double res = calcIf();
		System.out.println(res);*/
		
		calcFor();
		
	}
}
