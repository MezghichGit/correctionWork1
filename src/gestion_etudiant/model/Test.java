package gestion_etudiant.model;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/*
		Etudiant e1 =  new Etudiant();
		Etudiant e2 = new Etudiant("Amine",20,15.5,"Tunis centre ville");
		
		e1.info();
		e2.info();*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Donner un nom");
		String nom = sc.nextLine();
		
		System.out.println("Donner votre age");
		int age = sc.nextInt();
		
		System.out.println("Donner votre moyenne");
		double moy = sc.nextDouble();
		sc.nextLine();
		System.out.println("Donner votre adresse");
		String adress = sc.nextLine();
		
		System.out.println("Vous avez taper : "+nom + " Age = "+age+ "Moyenne = "+moy+" Adresse = "+adress);
		System.out.println("Update Achref Le 15/03/2022");
		
		System.out.println("Update Amine Le 15/03/2022 - 15h21");
	}

}
