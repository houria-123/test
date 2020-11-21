package test;

public class Banque {

	 
		 public static void main(String[] arguments) {
			 Compte compte1 = new Compte();
			 Compte compte2 = new Compte();

			 System.out.println(compte1.etat());
			 compte1.depot(5.0);
			 System.out.println(compte1.etat());



			 System.out.println(compte2.etat());
			 compte2.depot(10000.0);
			 System.out.println(compte2.etat());
		 }
}
