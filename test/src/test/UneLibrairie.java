package test;

public class UneLibrairie {
	static String staticstring = "variable globale" ;
	static int staticint = 0 ;
	private static int  privatestaticint=5;
	
	static void staticvoid(){
		System.out.print("staticvoid()");
		staticstring = staticstring + 1 ;
		staticint = staticint + 1 ;
	}
	public static String getStaticstring() {
		return staticstring;
	}
	public static void setStaticstring(String staticstring) {
		UneLibrairie.staticstring = staticstring;
	}
	public static int getStaticint() {
		return staticint;
	}
	public static void setStaticint(int staticint) {
		UneLibrairie.staticint = staticint;
	}
	public static int getPrivatestaticint() {
		return privatestaticint;
	}
	public static void setPrivatestaticint(int privatestaticint) {
		UneLibrairie.privatestaticint = privatestaticint;
	}
	public static void publicstaticvoid(){
		System.out.print("publicstaticvoid()");
		staticstring = staticstring + 1 ;
		staticint = staticint + 1 ;
	}
	private static void privatestaticvoid(){
		System.out.print("privatestaticvoid()");
		staticstring = staticstring + 1 ;
		staticint = staticint + 1 ;
	}
	public static void main(String[] arguments) {

		System.out.print("depuis UneLibrairie.main() : ");
		System.out.print("appel de : ");
		staticvoid();
		System.out.println(" : OK");
		System.out.print("depuis UneLibrairie.main() : ");
		System.out.print("appel de : ");
		 publicstaticvoid();
		 System.out.println(" : OK");
		 System.out.print("depuis UneLibrairie.main() : ");
		 System.out.print("appel de : ");
		 privatestaticvoid();
		 System.out.println(" : OK");
		 System.out.print("depuis UneLibrairie.main() : ");
		 System.out.print("appel de : ");
		 System.out.println("staticstring == "+staticstring);
		 System.out.print("depuis UneLibrairie.main() : ");
		 System.out.print("appel de : ");
		 System.out.println("staticstring=="+staticint);
		 
	}
}
