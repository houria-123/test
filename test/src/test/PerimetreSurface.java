package test;

import java.util.Scanner;

public class PerimetreSurface {

public static void main(String[] args) {
	
	Scanner sc =new Scanner(System.in);
	int PeriSur ;
	int rayon = 0 ;
	System.out.println("Quel est le rayon du cercle ");	
	rayon= Integer.parseInt(sc.next());
	PeriSur= (int)(rayon*rayon*3.14);
	System.out.println("PeriSur: "+PeriSur);
}}
