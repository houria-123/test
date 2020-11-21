package test;

public class UtiliseUneLibrairie {
	public static void main(String[] arguments)
	System.out.print("depuis UneLibrairie.main() : ");
	System.out.print("appel de : ");
	UneLibrairie.staticvoid();
	System.out.println(" : OK");
	System.out.print("depuis UneLibrairie.main() : ");
	System.out.print("appel de : ");
	UneLibrairie.publicstaticvoid();
	 System.out.println(" : OK");
	 System.out.print("depuis UneLibrairie.main() : ");
	 System.out.print("appel de : ");
	// UneLibrairie.privatestaticvoid();
	 System.out.println(" : OK");
	 System.out.print("depuis UneLibrairie.main() : ");
	 System.out.print("appel de : ");
	 System.out.println("staticstring == "+UneLibrairie.staticstring);
	 System.out.print("depuis UneLibrairie.main() : ");
	 System.out.print("appel de : ");
	 System.out.println("staticstring=="+UneLibrairie.staticint);
	 
}
