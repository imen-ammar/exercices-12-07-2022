package toulouse;

import java.util.Scanner;

import toulouse.Sport.Statut;

public class SportMain {
	public static void main(String[] args) {

		Sport football = new Sport();
		football.setNom("Football");
		football.setDescription("est un sport collectif qui se joue avec un ballon  entre deux équipes de  joueurs");
		football.setActif(true);
		football.setStatut(Statut.EN_EQUIPE);
		football.afficher();

		Sport tennis = new Sport();
		tennis.setNom("Tenis");
		tennis.setDescription(
				"est un  sport dans lequel deux ou quatre joueurs se renvoient alternativement une balle");
		tennis.setActif(true);
		tennis.setStatut(Statut.LES_DEUX);
		tennis.afficher();

		Sport natation = new Sport();
		natation.setNom("Natation");
		natation.setDescription("est un sport individuel collectif ");
		natation.setActif(true);
		natation.setStatut(Statut.LES_DEUX);
		natation.afficher();

		System.out.println("--------------------- V1 -----------------------");
		Sport sport = new Sport();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Saisir le nom du sport");
		String nom = scanner.nextLine();

		System.out.println("Saisir la description du sport");
		String description = scanner.nextLine();

		boolean isActifSport;
		System.out.println("Le sport est-t-il actif ? Y|N");
		String isActif = scanner.nextLine();
		if (isActif.equals("Y")) {
			isActifSport = true;
		} else {
			isActifSport = false;
		}

		Statut statutSport;
		System.out.println("Le sport est individuel ou en équipe ou les deux ? A|B|C");
		String statut = scanner.nextLine();
		if (statut.equals("A")) {
			statutSport = Statut.INDIVIDUEL;
		} else if (statut.equals("B")) {
			statutSport = Statut.EN_EQUIPE;
		} else {
			statutSport = Statut.LES_DEUX;
		}

		sport.setNom(nom);
		sport.setDescription(description);
		sport.setStatut(statutSport);
		sport.setActif(isActifSport);

		sport.afficher();

		String[] tab = { football.getNom(), tennis.getNom(), natation.getNom(), sport.getNom() };
		int i;
		System.out.println("Voici les noms des sports :");
		for (i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
		}

		// V2
		System.out.println("--------------------- V2 -----------------------");
		Sport sport2 = new Sport();

		System.out.println("Saisir le nom du sport");
		nom = scanner.nextLine();

		System.out.println("Saisir la description du sport");
		description = scanner.nextLine();

		System.out.println("Le sport est-t-il actif ? Y|N");
		isActif = scanner.nextLine();
		if (isActif.equals("Y")) {
			isActifSport = true;
		} else {
			isActifSport = false;
		}

		System.out.println("Le sport est individuel ou en équipe ou les deux ? A|B|C");

		statut = scanner.nextLine();
		if (statut.equals("A")) {
			statutSport = Statut.INDIVIDUEL;
		} else if (statut.equals("B")) {
			statutSport = Statut.EN_EQUIPE;
		} else {
			statutSport = Statut.LES_DEUX;
		}
		sport2.setNom(nom);
		sport2.setDescription(description);
		sport2.setStatut(statutSport);
		sport2.setActif(isActifSport);

		sport2.afficher();
		
		natation.setActif(false);
		System.out.println("Le sport natation est inactif");
		
		
		Sport[] tabSport = { football, tennis, natation, sport, sport2 };
		System.out.println("Voici les noms des sports actifs :");
		for (i = 0; i < tabSport.length; i++) {
			if(tabSport[i].isActif()) {
				System.out.println(tabSport[i].getNom());
			}
		}
	}
}
