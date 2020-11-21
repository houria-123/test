package test;

import java.util.Scanner;

public class Perimetre {
	 
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int Peri ;
		int rayon = 0 ;
		System.out.println("Quel est le rayon du cercle ");	
		rayon= Integer.parseInt(sc.next());
		Peri= (int) (rayon*3.14);
		System.out.println("peri: "+Peri);
}
}