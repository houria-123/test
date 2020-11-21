package test;

import java.util.Scanner;

public class JourSuivant {
	public static void main(String[] args) {
		int jour ,mois,annee;
		int jourSuivant ,moisSuivant, anneeSuivant;
		boolean saisieValide ;
	
		System.out.println("Enter le jour ");
		Scanner sc =new Scanner(System.in);
		jour= Integer.parseInt(sc.next());
	
		System.out.println("Enter le mois ");	
		Scanner sc1 =new Scanner(System.in);
		mois= Integer.parseInt(sc1.next());
		
		System.out.println("Enter une annee ");	
		Scanner sc2 =new Scanner(System.in);
		annee= Integer.parseInt(sc2.next());
		
		
		if (annee < 1582)
			saisieValide= false;
		else {
			if((mois ==1 || mois ==3 || mois == 5 || mois ==7 || mois ==8 || mois ==10 || mois ==11) && ( jour<=31 && jour>=1)){
				
				saisieValide =true;
			}
			else if ((mois ==4 || mois ==6 || mois == 9 || mois == 11) || (jour<= 30 || jour >=1)) {
				
				saisieValide =true;
				
			}
			else {	saisieValide =false;
	     	}
		if (((mois ==2)&& (annee % 4 == 0 ))&& ( jour <= 29 && jour >= 1)) {
			saisieValide =true;
		}else if (((mois ==2)&& (annee % 4 != 0 ))&& ( jour <= 28 && jour >= 1)) {
			saisieValide =true;		}
		else {	saisieValide =false;
     	}
		
		if (!saisieValide)  {
			
			System.out.println(" la date que vous avez entre n'est pas valide.");
			System.exit(0);
		}else {
			if ((jour == 31 )&& (mois == 1 || mois ==3 || mois ==5 ||mois ==8 || mois ==10  ) ){
				jourSuivant =1;
				moisSuivant=1;
				anneeSuivant =annee +1;
			}
			
			if ((jour == 30)&& (mois == 4 ||mois == 6 || mois == 9 || mois == 11 )) {
				
				jourSuivant =1;
				moisSuivant=1;
				anneeSuivant =annee ;
			}
			
			if((jour == 28)&& (mois == 2 && annee % 4== 0 )){
				jourSuivant =1;
				moisSuivant= mois +1;
				anneeSuivant =annee ;
			}
			if((jour == 29)&& (mois == 2 && annee % 4== 0 )){
				jourSuivant =1;
				moisSuivant= mois +1;
				anneeSuivant =annee ;
			}
			
		
			
	System.out.println(jour+ "/" + mois + " / " + annee + "est valide, /n le jour du lendemain est :" +jourSuivant + " / " +
			moisSuivant + "/ " + anneeSuivant+ "." );
		
			
		
	
		
		
	}
	}
}
