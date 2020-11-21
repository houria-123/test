package test;

import java.util.Scanner;

public class abc {
	public static void main(String[] args) {
	
	int a=5;
	int b=3;
	int c=a*b++;
	int d=a*++b; 
	
	System.out.println("a:"+a+"b:"+b+"c:"+c+"d:"+d);

	
	Scanner sc =new Scanner(System.in);
	String uname;
	String course;
	
	System.out.println("Entrer le nom de l'etudiant");
	System.out.println("Enter le nom du cours");
	uname=sc.next();
	course=sc.next();
	if (uname.equals("toto")&&course.equals("Java")) {
		System.out.println("Inscription reussite");
	}
	
	
	
	System.out.println("Entrer le nom de l'etudiant");
	System.out.println("Enter le nom du cours");
	uname=sc.next();
	course=sc.next();
	if (uname.equals("toto")|| course.equals("Java")) {
		System.out.println("Inscription en cours");
}
	
	System.out.println(uname.equals("titi"));
	System.out.println(uname==("titi"));
}
}
