package test;

public class EssaiJourPlus {

	 

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        JoursPlus unJour =  JoursPlus.SAMEDI ;
        System.out.print("numero de " + unJour +" : "+unJour.ordinal());
        System.out.print(unJour + " : " + unJour.action());
        for (JoursPlus jour : JoursPlus.values())
        System.out.print("nombre d'heure " + jour +" : "+jour.getNBheures());    
    }

 

}
 