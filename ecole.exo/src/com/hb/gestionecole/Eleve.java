package com.hb.gestionecole;

/**
 * classe de gestion d'élèves
 * @author HB
 *
 */
public class Eleve extends Personne {

	/**
	 * classe de l'élève
	 */
	private String classe;
	/**
	 * moyennes de l'élève
	 */
	private double[] moyennes = new double[5];
	
	
	/**
	 * getter classe
	 * @return classe de l'élève
	 */
	public String getClasse() {
		return classe;
	}

	/**
	 * setter classe
	 * @param classe nouvelle classe
	 */
	public void setClasse(String classe) {
		this.classe = classe;
	}

	/**
	 * constructeur par défaut
	 */
	public Eleve() {
		super();
	}
	
	/**
	 * constructeur avec paramètres
	 * @param nom nom de l'élève
	 * @param prenom prénom de l'élève
	 * @param age age de l'élève
	 * @param classe classe de l'élève
	 */
	public Eleve(String nom, String prenom, int age, String classe) {
		super(nom, prenom,  age);
		this.classe = classe;
	}
	
	/**
	 * méthode d'affichage des moyennes
	 */
	public void afficherMoyennes() {
		System.out.println("moyennes: ");
		System.out.print("[ ");
		for(int i = 0; i< this.moyennes.length; i++) {
			System.out.print(this.moyennes[i]);
			if(i < this.moyennes.length-1) {
				System.out.print(", ");
			}
		}
		System.out.print(" ]\n");
	}
	
	/**
	 * méthode d'affichage
	 */
	@Override
	public void afficher() {
		//affichage des paramètres
		super.afficher();
		System.out.println("classe: "+this.classe);
		//affichage des moyennes
		afficherMoyennes();
		System.out.println("#####");
	}
	
	/**
	 * méthode de calcul de la moyenne générale
	 * @return moyenne calculée
	 */
	public double moyenneGen() {
		double sum = 0, avg = 0;
		
		for(double elem : this.moyennes) {
			sum += elem;
		}
		
		avg = sum/this.moyennes.length;
		
		return avg;
	}
	
	/**
	 * méthode de modification des moyennes
	 * @param moyenne nouvelle moyenne
	 * @param idx index de la moyenne à modifier
	 */
	public void modifierMoyenne(double moyenne, int idx) {
		this.moyennes[idx] = moyenne;
	}
	
}
