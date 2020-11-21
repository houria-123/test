package test;

public enum JoursPlus {
LUNDI(8),MARDI(8),MERCREDI(4),JEUDI(8),VENDRDI(7),SAMEDI(0),DIMANCHE(0);
	private int nbHeures;
	JoursPlus(int nb) {nbHeures=nb;}
		// TODO Auto-generated constructor stub
	
	public int getNbHeures() {return nbHeures;}
	public String action() {
		switch(this) {
		case SAMEDI :return "cinema";
		case DIMANCHE : return "dormir";
		default :return "travailler";
		
		}
	}
}
