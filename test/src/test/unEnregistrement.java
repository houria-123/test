package test;

public class unEnregistrement {
	private String champChaine ;
	private int champEntier ;
	
	public unEnregistrement() {
		 this.champChaine="GFDG";
		 this.champEntier=1234;
		
		// TODO Auto-generated constructor stub
	}
	public unEnregistrement( String champChaine) {
		 this.champChaine=champChaine;
	}
	
	public unEnregistrement( int champEntier) {
	
		 this.champEntier=champEntier;	
	}
	
	public unEnregistrement( String champChaine,int champEntier) {
		 this.champChaine=champChaine;
		 this.champEntier=champEntier;
		
	}
	
	 public static void main(String[] arguments) {
		 unEnregistrement un = new unEnregistrement();
		 System.out.println("champChaine ="+un.champChaine);
		 System.out.println("champEntier ="+un.champEntier);
		 
		 
	 }
}
