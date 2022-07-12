package TP8;

import java.util.Scanner;

//Classe
public class Personnage {

	// attributs
	private int nombreDeVies;
	private String nom;
	private int force;
	private String arme;

	// Constructeurs
	public Personnage() {
	}

	public Personnage(int nombreDeVies, String nom, int force, String arme) {
		this.nombreDeVies = nombreDeVies;
		this.nom = nom;
		this.force = force;
		this.arme = arme;
	}
	
	// getters / setters
	public int getNombreDeVies() {
		return nombreDeVies;
	}

	public void setNombreDeVies(int nombreDeVies) {
		this.nombreDeVies = nombreDeVies;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public String getArme() {
		return arme;
	}

	public void setArme(String arme) {
		this.arme = arme;
	}
	
	// méthode
	public void parler() {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Veuillez saisir un message");
		String message = scanner.nextLine();
		System.out.println(message);
		
	}
}
