package gestion_etudiant.model;

public class Etudiant {

	// attributs d'instance
	
	String nom;
	int age;
	double moyenne;
	String adresse;
	
	// Les constructeurs
	public Etudiant() {
	}

	public Etudiant(String nom, int age, double moyenne, String adresse) {
		this.nom = nom;
		this.age = age;
		this.moyenne = moyenne;
		this.adresse = adresse;
	}
	
	// méthode d'instance

	public void info() {
		System.out.println("Etudiant [nom=" + this.nom + ", age=" + this.age + ", moyenne=" + this.moyenne + ", adresse=" + this.adresse + "]");
	}

	
}
