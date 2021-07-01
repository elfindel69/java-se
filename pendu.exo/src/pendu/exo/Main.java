package pendu.exo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


/**
 * classe de jeu du Pendu
 * @author elfindel69
 *
 */
public class Main {
	/**
	 * scanner
	 */
	private static Scanner sc = new Scanner(System.in);
	
	/**
	 * methode de génération de nombre aléatoire
	 * @return nombre généré
	 */
	private static int getRandomNumber(int length) {
		int randomNum = ThreadLocalRandom.current().nextInt(length);
		return randomNum;
		
	}
	
	/**
	 * méthode de sélection de mot dans une liste
	 * @param list liste de choix
	 * @return mot sélectionné
	 */
	private static String chooseName(List<String> list) {
		//sélection d'un index aléatoire
		int idx = getRandomNumber(list.size());
		//retourne le mot choisi
		return list.get(idx);
	}
	
	/**
	 * méthode de création de mot caché
	 * @param nb nombre de lettres
	 * @return mot caché créé
	 */
	private static String createAnswer(int nb) {
		//création string de réponse
		String answer = "";
		for (int i=0; i<nb; i++) {
			answer += '*';
		}
		return answer;
	}
	
	/**
	 * méthode de sélection de caractère
	 * @return caractère entré
	 */
	private static char getCharacter() {
		System.out.println("Saisir une lettre");
		char c  = sc.next().charAt(0);
		return c;
		
	}
	
	/**
	 * méthode de test de mots
	 * modifie le mot caché si la lettre est dans le mot à trouver
	 * @param word mot à trouver
	 * @param c lettre à chercher
	 * @param answer mot caché
	 * @return mot caché modifié
	 */
	private static String testChar(String word, char c, String answer) {
		StringBuilder sb = new StringBuilder(answer);
		
		for(int i = 0; i< word.length(); i++) {
			if(word.charAt(i) == c) {
				sb.setCharAt(i, c);
			}
		}
		answer = sb.toString();
		return answer;
		
	}
	
	/**
	 * méthode de recherdche d'étoiles
	 * @param answer mot à comparer
	 * @return ne contient pas d'étoiles?
	 */
	private static boolean testWon(String answer) {
		
		return !answer.contains("*");
		
	}
	
	private static void drawHangMan(int height) {
		String[] tab = new String[11];
		tab[0] = "";
		tab[1] = "      \n"+"      \n"+"      \n"+"      \n"+"_|_   ";
		tab[2] = "      \n"+"      \n"+"      \n"+" |    \n"+"_|_   ";
		tab[3] = "      \n"+"      \n"+" |    \n"+" |    \n"+"_|_   ";
		tab[4] = "      \n"+" |    \n"+" |    \n"+" |    \n"+"_|_   ";
		tab[5] = " |    \n"+" |    \n"+" |    \n"+" |    \n"+"_|_   ";
		tab[6] = " --   \n"+" |    \n"+" |    \n"+" |    \n"+" |    \n"+"_|_   ";
		tab[7] = " ---  \n"+" |    \n"+" |    \n"+" |    \n"+" |    \n"+"_|_   ";
		tab[8] = " ---- \n"+" |    \n"+" |    \n"+" |    \n"+" |    \n"+"_|_   ";
		tab[9] = " -----\n"+" |  | \n"+" |    \n"+" |    \n"+" |    \n"+"_|_   ";
		tab[10] = "-----\n"+" |  | \n"+" |  o \n"+" | /|\\\n"+" | / \\\n"+"_|_   ";
		
		System.out.println(tab[height]);
	}
	
	/**
	 * méthode du jeu du pendu
	 * @param list mots à chercher
	 */
	public static void hangMan(List<String> list) {
		//mot à chercher
		String word = "";
		//réponse
		String answer = "";
		//liste de lettres jouées
		List<Character> playedLetters = new ArrayList<Character>();
		//nb essais
		int tries = 0;
		//menu quitter
		char quit = 'n';
		//tests
		boolean isWon = false, isError = false;
		//boucle principale
		do {
			//initialisation des variables
			word = chooseName(list);
			answer = createAnswer(word.length());
			//initialisation boucle de jeu
			isWon = false;
			tries = 10;
			//boucle de jeu 
			//tant qu'il reste des essais et que la réponse est fausse
			while(tries > 0 && !isWon) {
				//affichage
				System.out.println("Il vous reste: "+tries+" coups à jouer");
				drawHangMan(10-tries);
				System.out.println("mot trouvé: "+answer);
				//récupération de la lettre entrée
				char c = getCharacter();
				
				//test si lettre déjà jouée
				if(playedLetters.contains(c)) {
					System.out.println("lettre déjà jouée :(");
					//mauvais coup
					isError = true;
				}else {
					//ajout lettre
					playedLetters.add(c);
					//copie réponse
					String oldAnswer = answer;
					//test lettre donnée et modification réponse au besoin
					answer = testChar(word, c, answer);
					//test si réponse modifiée
					isError = answer.equals(oldAnswer);
				}
			
				//si mots identiques ou lettre déjà jouée -> réponse fausse
				if (isError) {
					//décrémente le nombre d'essais
					--tries;
				}
				//test nombre de réponses restantes
				if(tries > 0) {
					//test victoire
					isWon = testWon(answer);
					if(isWon) {
						System.out.println("Bravo vous avez gagné, le mot secret était: "+word);
					}
				}
				else {
					//perdu
					drawHangMan(10);
					System.out.println("Désolé vous avez perdu!, le mot secret était: "+word);
				}
			}
			//menu quitter
			System.out.println("Voulez vous rejouer? (y/n)");
			quit = sc.next().charAt(0);
		}while(quit != 'n');
		
	}
	
	/**
	 * méthode d'écriture dans un fichier
	 * @param path chemin du fichier
	 * @param words liste à écrire
	 */
	private static void writeFile(String path, List<String> words) {
		try {
			FileWriter fWriter = new FileWriter(path);
			BufferedWriter bw = new BufferedWriter(fWriter);
			for (String elem : words ) {
				bw.write(elem);
				bw.newLine();
			}
			bw.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	/**
	 * méthode de lecture d'un fichier
	 * @param path chemin du fichier
	 * @return liste récupérée
	 */
	private static List<String> readFile(String path) {
		List<String> words = new ArrayList<String>();
		
		FileReader fr;
		try {
			fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			while(br.ready()) {
				words.add(br.readLine());
			}
			
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return words;
	}
	
	/**
	 * méthode d'initialisation de la liste
	 * @return liste initialisée
	 */
	private static List<String> initList() {
		List<String> words = new ArrayList<String>();
		words.add("un");
		words.add("deux");
		words.add("cinq");
		words.add("rouge");
		words.add("membre");
		words.add("conseil");
		words.add("donner");
		words.add("reponse");
		words.add("etat");
		words.add("son");
		words.add("armement");
		words.add("peu");
		words.add("apres");
		words.add("vacances");
		words.add("annonces");
		words.add("mercredi");
		words.add("evident");
		words.add("regime");
		words.add("affirmer");
		words.add("arme");
		return words;
	}
	
	/**
	 * méthode main
	 * @param args arguments
	 */
	public static void main(String[] args) {
		//chemin du fichier de mots
		String path = "C:\\Users\\HB\\Documents\\java-se\\test.txt";
		//liste de mots à trouver
		List<String> words;
		
		//initialisation de la liste de mots
		//wordList = initList();
		
		//écriture du fichier de mots
		//writeFile(pathString, wordList);
		
		//initialisation de la liste à partir du fichier de mots
		words= readFile(path);
		
		//lancement du jeu
		hangMan(words);
		
		sc.close();
		
	}
}
