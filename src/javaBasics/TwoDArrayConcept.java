package javaBasics;

public class TwoDArrayConcept {
	
	// 2DArray - two dimensional columns
	// we will have two arguments in the bracket one is row and other would be column
	// 2D array - String[][] a = new String[row][colomn];
	
	
	public static void main(String[] args) {

//		int[][] scores = new int[4][2];
//		//1st row
//		scores[0][0] = 10;
//		scores[0][1] = 20;
//		//2nd row
//		scores[1][0] = 100;
//		scores[1][1] = 200;
//		//3rd row
//		scores[2][0] = 1000;
//		scores[2][1] = 2000;
//		//4th row
//		scores[3][0] = 10000;
//		scores[3][1] = 20000;
//		
//		int[][] scores1 = {{10,20},{100,200},{1000, 2000},{10000,20000}};
//		
//		System.out.println(scores.length);
//		System.out.println(scores1.length);
//		
//		System.out.println("Number of rows in scores array: "+scores.length); // to get the number of row count
//		System.out.println("number of rows in scores1 array: "+scores1.length);
//		
//		System.out.println("Number of columns in scores array: "+scores[0].length); // to get the number of columns
//		System.out.println("Number of columns in scores1 array: "+scores1[0].length);
//		
//		for(int i=0; i<scores.length; i++) { // first for loop is traversing into rows
//			for(int j=0; j<scores[i].length; j++) { // second for loop is traversing into columns
//				System.out.println(scores[i][j]);
//			}
//		}
//		
//		for(int i = 0; i<scores1.length; i++) {
//			for(int j=0; j<scores1[i].length; j++) {
//				System.out.print(scores1[i][j]+ " ");
//				
//			}
//		}
// 		Assignment
		
		String[][] LoginUP = {{"johndoe@gmail.com", "jd990"}, {"joe42@gmail.com","j78987"}, {"smithjohn@gmail.com", "sj7890"}, {"harrysingh@yahoo.com", "hs5746"} };
		String[][] LoginDBUP = {{"johdoe@gmail.com", "jd990"}, {"joe42@gmail.com","j78987"}, {"smithjohn@gmail.com", "sj7890"}, {"harrysingh@yahoo.com", "hs5746"} };
		
		
		
		System.out.println("Number of rows in LoginUP array: "+LoginUP.length);
		System.out.println("Number of rows in LoginDBUP array: "+LoginDBUP.length);
	
		System.out.println("number of Columns in array: "+LoginUP[0].length);
		System.out.println("Number of Columns in array: "+LoginDBUP[0].length);
		
		
		
		for(int s=0; s<LoginUP.length; s++) {
			for(int ds=0; ds<LoginDBUP[s].length; ds++) {
				System.out.println(LoginUP[s][ds]);
			}
			
		}
		
		for(int s=0; s<LoginDBUP.length; s++) {
			for(int ds=0; ds<LoginDBUP[s].length; ds++) {
				System.out.print(LoginDBUP[s][ds]);
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
//		
		
			
		
		
}
}

