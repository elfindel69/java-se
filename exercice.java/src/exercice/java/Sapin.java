package exercice.java;

import java.util.Scanner;

/**
 * classe d'affichage de sapins
 * @author elfindel69
 *
 */
public class Sapin {
	
	/**
	 * affichage demi sapin droit
	 * @param height hauteur du sapin
	 * @param c caractère à afficher
	 */
	public static void sapinDroit(int height, char c) {
		String sapin = "";
		String res;
		
		//remplissage string
		for (int i=0; i < height; i++) {
			sapin+=c;
		}
		
		//affichage
		for(int i=0; i< sapin.length(); i++) {
			 res = sapin.substring(0,i+1);
			 System.out.println(res);
		}
	}
	
	/**
	 * affichage demi sapin gauche
	 * @param height hauteur du sapin
	 * @param c caractère à afficher
	 * 
	 **/
	public static void sapinGauche(int height, char c) {
		String res="", sapin = "", spaces ="";
		
		//remplissage strings
		for (int i=0; i < height; i++) {
			sapin += c;
			spaces += ' ';
		}
		
		//affichage
		for(int i=height; i>0; i--) {
			res = spaces.substring(0,i-1);
		    res += sapin.substring(i-1);
			System.out.println(res);
		}
	}
	
	/**
	 * affichage sapin
	 * @param height hauteur du sapin
	 * @param c caractère à afficher
	 */
	public static void sapinEntier(int height, char c) {
		String spaces ="";
		String sapin ="";
		String res;
		 
		//remplissage strings
		for (int i=0; i < height; i++) {
			if (i==0){
		        spaces = " ";
		        sapin = String.valueOf(c);
		    }
		    else{
		        spaces += " ";
		        sapin += String.valueOf(c)+String.valueOf(c);
		    }
		}
		
		//affichage
		for(int i=1;i<height+1;i++) {
			res = spaces.substring(i);
		    res += sapin.substring(height-i,height+(i-1));
		    System.out.println(res);
			
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//création du tableau
		System.out.println("entrer une hauteur de sapin:");
		int nb = sc.nextInt();
		//saisie du caractère de remplacement
		System.out.println("entrer un caractère à afficher:");
		char c = sc.next().charAt(0);	
		
		sapinDroit(nb, c);
		sapinGauche(nb, c);
		sapinEntier(nb, c);
		sc.close();
		
	}
}
