package test;

import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int i;
		int ii;
		System.out.println("donnez le nombre ");	
		
		ii = Integer.parseInt(sc.next());
		for(i=0;i<=100;i++) {
			if (i%3==0)
		
		System.out.println(i + " Fizz");	
			if (i%5==0)
		System.out.println(i + " Buzz");	
			if ((i%3==0) && (i%5==0))
		System.out.println(i +" Fizz Buzz ");	
		
}
}
}