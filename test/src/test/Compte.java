package test;

public class Compte {
	 public double soldeCompte = 0.0 ;
	 String deviseCompte = "euros" ;
	 public void depot(double montant){
	 soldeCompte = soldeCompte + montant ;
	 }
	 public String etat(){
	 String etatResultat = "Solde actuel = "+soldeCompte+" "+deviseCompte ;
	 return etatResultat;
	 }

	 
	 public void retrait(double montant) {
		 
	 }
	 
}
