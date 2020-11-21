import java.util.Scanner;

public class Exo4 {
	public static void main(String[] args) {

		Scanner clavier = new Scanner(System.in);
		double saisie;
		double somme;
		int compteur;
		double moy;

		somme = 0;
		compteur = 1;
		while (compteur < 4) {
			System.out.println("Saisir une note " + compteur + " : ");
			saisie = clavier.nextDouble();
			if ((saisie >= 0) && (saisie <= 20)) {
				compteur = compteur + 1;
				somme = somme + saisie;
			} else {
				System.out.println("Erreur de saisie");
			}

			System.out.println("La somme des 3 notes est : " + somme);

		}
		moy = somme / 3;
		System.out.println("La moyenne est : " + moy);

		if ((moy <= 0) || (moy > 10)) {
			System.out.println("cole");

		} else if ((moy <= 10) || (moy > 12))
			System.out.println("passable");
		else if ((moy <= 12) || (moy > 14))
			System.out.println("assez bien");
		else if ((moy <= 14) || (moy > 16))
			System.out.println("Bien");
		else if ((moy <= 16) || (moy > 20))
			System.out.println("Tres Bien");

		System.out.println("Mention obtenue est");

	}
}
