package test;

import java.util.StringTokenizer;

public class Exemple {
	public static void main(String[] args) {
		
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]+"");
			
			for(String name :args)
				System.out.println(name);
				
			
			
			String s1="TaTa";
			String s2="TaTa";
			String s3=new String("TaTa");
			String s4=new String("TaTa");
			String s5="TaTa";
			String s6="TaTa";
			System.out.println(s1==s2);
			System.out.println(s1==s3);
			System.out.println(s4==s3);
			System.out.println(s5==s3);
			System.out.println(s3);
			
			
			StringTokenizer st = new StringTokenizer("Cours JaVA");
			while(st.hasMoreTokens ());
				System.out.println(st.nextToken());
			String[] result ="les examens sont pour bientot ".split("")
			
			
			
	}
	}
}
