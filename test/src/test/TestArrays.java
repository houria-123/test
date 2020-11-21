package test;

public class TestArrays {
	public static void main(String[] args) {
		
	String [] islands= new String [4];
	int []index =new int[4];
	int Y=0;
	
	islands[0] ="Bermuda";
	islands[1] ="Fiji";
	islands[2] ="Azores";
	islands[3] ="Cormel";
	
	
	index[0]=1;
	index[1]=3;
	index[2]=0;
	index[3]=2;
			int ref;
			while (Y<4) {
				ref=index[Y];
				System.out.println("islands=");
				System.out.println(islands[ref]);
				Y=Y+1;
				
			}
			
	}
}
