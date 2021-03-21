package javaBasics;

public class TwoDArrayConceptAssignment {

	public static void main(String[] args) {

	//Assignment
		
		String[][] LoginUP = {{"johndoe@gmail.com", "jd990"}, {"joe42@gmail.com","j78987"}, {"smithjohn@gmail.com", "sj7890"}, {"harrysingh@yahoo.com", "hs5746"} };
		String[][] LoginDBUP = {{"johndoe@gmail.com", "jd990"}, {"joe42@gmail.com","j78987"}, {"smithjohn@gmail.com", "sj7890"}, {"harrysingh@yahoo.com", "hs5746"} };
		
		
		
		System.out.println("Number of rows in LoginUP array: "+LoginUP.length);
		System.out.println("Number of rows in LoginDBUP array: "+LoginDBUP.length);
	
		System.out.println("number of Columns in array: "+LoginUP[0].length);
		System.out.println("Number of Columns in array: "+LoginDBUP[0].length);
		
		for(int s=0; s<LoginUP.length; s++) {
			for(int ds=0; ds<LoginUP[s].length; ds++) {
				System.out.println(LoginUP[s][ds]);
			}
			
		}
		
		for(int s=0; s<LoginDBUP.length; s++) {
			for(int ds=0; ds<LoginDBUP[s].length; ds++) {
				System.out.print(LoginDBUP[s][ds]+ " "); 
			}
		}
		
		if(LoginUP[0][1].equals(LoginDBUP[0][1]) && LoginUP[0][1].equals(LoginDBUP[0][1]) ) {
			System.out.println("Login Successful");
			System.out.println("Welcome John");
		}
		else {
			System.out.println("Incorrect username or password");
			System.out.println("Please try again");
		}
		
	}
	

}
