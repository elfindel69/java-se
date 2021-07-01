package classes.exo;

public abstract class Animal {
	protected String nom;
	protected int age;
	protected Sexe sexe;
	protected String couleur;
	
	public Animal(String nom, int age, Sexe sexe, String couleur) {
		this.nom = nom;
		this.age = age;
		this.sexe = sexe;
		this.couleur = couleur;
	}
	
	public abstract void parler();
	public abstract void manger();
	public abstract void seDeplacer();
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("nom: "+nom+",\n");
		sb.append("age: "+age+" ans,\n");
		sb.append("sexe: "+sexe+",\n");
		sb.append("couleur: "+couleur);
		return sb.toString();
	}
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public Sexe getSexe() {
		return sexe;
	}
	
	public void setSexe(Sexe sexe) {
		this.sexe = sexe;
	}
	
	public String getCouleur() {
		return couleur;
	}
	
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
}
