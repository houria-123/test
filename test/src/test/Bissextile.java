package test;

import java.util.Scanner;

public class Bissextile {
	public static void main(String[] args) {
		
		
		Scanner sc =new Scanner(System.in);
		
		int annee  ;
		System.out.println("Enter une annee ");	
		annee= Integer.parseInt(sc.next());
		
		if ((annee%400)==0)
		
			System.out.println("l'annee "+ annee +" est une annee bissextile");	
		else
			
			System.out.println("l'annee "+ annee +" est une annee non bissextile");	
}
}