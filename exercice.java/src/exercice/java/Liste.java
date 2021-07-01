package exercice.java;

import java.util.ArrayList;
import java.util.List;

/**
 * classe de manipulation de liste de String
 * @author elfindel69
 *
 */
public class Liste {
	
	/**
	 * remplissage de la liste
	 * @param list liste à remplir
	 */
	public static void fillList(List<String> list) {
		list.add("PHP");
		list.add("Java");
		list.add("C++");
		list.add("Python");
		System.out.println(list);
	}
	
	/**
	 * affichage de la liste
	 * @param list liste à afficher
	 */
	public static void viewList(List<String> list) {
		for (String elem : list ) {
			System.out.println(elem);
		}
	}
	
	/**
	 * ajout d'un élément au début
	 * @param elem element à ajouter
	 * @param list liste à modifier
	 */
	public static void addBeginning(String elem,List<String> list) {
		list.add(0, elem);
		viewList(list);
	}
	
	/**
	 * affiche le ième élément
	 * @param idx index de l'élément à afficher
	 * @param list liste de recherche
	 */
	public static void showElement(int idx,List<String> list) {
		System.out.println("Element "+(idx+1)+": "+list.get(idx));
	}
	
	/**
	 * recherche d'un élément dans la liste
	 * @param item élément à rechercher
	 * @param list liste de recherche
	 */
	public static void searchElement(String item,List<String> list) {
		
		if(list.contains(item)) {
			System.out.println("L'élément existe dans la liste");
			return;
		}
		System.out.println("L'élément n'existe pas dans la liste");
		
	}
	
	public static void main(String[] args) {
		
		List<String> languagesList = new ArrayList<String>();
		fillList(languagesList);
		System.out.println("affichage liste: ");
		viewList(languagesList);
		System.out.println("affichage liste modifiée: ");
		addBeginning("Pascal",languagesList);
		showElement(3,languagesList);
		searchElement("Java",languagesList);
			
	 }
}
