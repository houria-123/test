package test;

public class UnTypeEnregistrement {

		
		  private String champChaine = "champ" ;
		 private int champEntier = 0 ;
		  private double champPrivateDouble;
		 
		 UnTypeEnregistrement(double pfValeurInitialeDouble){
			 this.champPrivateDouble=pfValeurInitialeDouble;
		 }
		 
		 public static void main(String[] arguments) {

		 UnTypeEnregistrement unEnregistrement = new UnTypeEnregistrement();
		 System.out.println("unEnregistrement.champChaine ="
		+unEnregistrement.champChaine);
		 System.out.println("unEnregistrement.champEntier ="
		+unEnregistrement.champEntier);

		
	}
	
}