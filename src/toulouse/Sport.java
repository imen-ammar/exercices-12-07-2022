package toulouse;

// Classe
public class Sport {

	// attribut
	private String nom;
	private Statut statut;
	private boolean isActif;
	private String description;
	
	// Constructeurs
	public Sport() {
	}
	

	// Getters/Setters
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Statut getStatut() {
		return statut;
	}

	public void setStatut(Statut statut) {
		this.statut = statut;
	}

	public boolean isActif() {
		return isActif;
	}

	public void setActif(boolean isActif) {
		this.isActif = isActif;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	// méthode
	public void afficher() {
		System.out.printf("Le %s %s\n", getNom(), getDescription());
	}
	
	public enum Statut{
		INDIVIDUEL,
		EN_EQUIPE,
		LES_DEUX
	}
}
