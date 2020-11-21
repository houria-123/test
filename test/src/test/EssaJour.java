package test;

public class EssaJour {
	public static void main(String[] arg) {
		Jour jour=Jour.valueOf(arg[0]);
		if(jour==Jour.SAMEDI)System.out.print("fin de semaine:");
		switch(jour) { 
		case SAMEDI:
		case DIMANCHE:
			System.out.println("se reposer");
			break;
			default:
				System.out.println("travailler");
				break;
		}
		}
	}


	





