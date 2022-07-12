package TP8;

public class Arme {

	// attributs

	private String nom;
	private int degats;
	private String niveau;

	// Constructeurs
	public Arme() {
	}

	public Arme(String nom, int degats, String niveau) {
		this.nom = nom;
		this.degats = degats;
		this.niveau = niveau;
	}

	// getters / setters

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getDegats() {
		return degats;
	}

	public void setDegats(int degats) {
		this.degats = degats;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;

	}

	public enum Niveau {
		DEBUTANT, 
		INTERMEDIAIRE, 
		EXPERT
	}
}
