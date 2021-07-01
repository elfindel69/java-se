package exercice.java;

import java.util.Scanner;

/**
 * classe de tests de tableaux
 * @author elfindel69
 *
 */
public class Tableaux {
	
	public static Scanner sc = new Scanner(System.in);
  /**
   * remplissage de tableau
   * @param tab tableau à remplir
   */
  public static int[] fillTab(int[] tab) {
	  int nb = 0;
	  for (int i = 0; i < tab.length; i++) {
		  System.out.println("entrer nombre "+(i+1)+": ");
		  try {
			  nb = sc.nextInt();
		  }catch (Exception e) {
			System.err.println("erreur de saisie :(");
		}
		  
		  tab[i] = nb;
	  }
	  return tab;
  }
  
  /**
   * affichage du tableau
   * @param tab tableau à afficher
   */
  public static void showTab(int[] tab) {
	 System.out.println("Affichage du tableau : ");
	 for (int elem : tab) {
		  System.out.println(elem);
	  }
  }
  
  /**
   * calcul du maximum
   * @param nb1 nombre1
   * @param nb2 nombre2
   * @return maximum
   */
  public static int calcMax(int nb1, int nb2) {
	  if (nb1 >= nb2) {
		  return nb1;
	  } else {
		  return nb2;
	  }
  }
  
  /**
   * calcul du maximum du tableau
   * @param tab tableau à calculer
   * @return valeur max
   */
  public static int maxTab(int[] tab) {
	  int max = 0;
	  for(int item: tab) {
		  max = calcMax(item,max);
	  }
	  return max;
  }
  
  /**
   * recherche d'un élément
   * @param elem élément à rechercher
   * @param tab tableau à rechercher
   */
  public static void searchTab(int elem, int[] tab) {
	  for (int i = 0; i < tab.length; i++) {
		  if (elem == tab[i]) {
			  System.out.println("Element trouvé :)");
			  return;
		  }
	  }
	  System.out.println("Element non trouvé :(");
	
}
 
  /**
   * tri à bulles
   * @param tab tableau à trier
   */
 public static int[] sortTab(int[] tab) {
	 boolean isSorted = false;
	 int tmp = 0;
	 for (int i = tab.length; i>1; i--) {
		 isSorted = true;
		 for(int j=0; j<i-1; j++) {
			 if(tab[j+1] < tab[j]) {
				 tmp = tab[j+1];
				 tab[j+1] = tab[j];
				 tab[j] = tmp;
				 isSorted = false;
			 }
		 }
		 if(isSorted) {
			 break;
		 }
	 }
	 return tab;
	
}
 
 /**
  * méthode de calcul de somme
  * @param tab tableau à calculer
  * @return somme calculée
  */
 public static int calcSum(int[] tab) {
	 int sum = 0;
	 for(int elem : tab) {
		 sum += elem;
	 }
	 return sum;
 }
 
 public static void main(String[] args) {
	
	System.out.println("Entrer une taille");
	int length = 0;
	try {
		length = sc.nextInt();
	}catch (Exception e) {
		System.err.println("erreur de saisie :(");
	}
		
	int[] tab = new int[length];
	tab = fillTab(tab);
	showTab(tab);
	int sum = calcSum(tab);
	System.out.println("somme du tableau: "+sum);
	int max = maxTab(tab);
	System.out.println("le max est: "+max);
	searchTab(3,tab);
	tab = sortTab(tab);
	showTab(tab);
	sc.close();	
		
 }
  
}
