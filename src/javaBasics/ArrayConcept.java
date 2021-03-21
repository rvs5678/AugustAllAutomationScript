package javaBasics;

public class ArrayConcept {
	// Array - will be represented in a [] - will store values with single column and row like a table
	
	
	public static void main(String[] args) {
		
//		int a = 1;
//		int b = 2;
//		int c = 3;
//		int d = 4;
//		int e = 5;
//		
		// one dimensional array - 1D array
		
//		int [] x = new int[5];
//		x[0]=1;
//		x[1]=2;
//		x[2]=3;
//		x[3]=4;
//		x[4]=5;
//		
//		System.out.println("Number in third row = "+x[2]);
//		System.out.println("Size of array = "+x.length);
//		
//		for(int i=0; i<x.length; i++) {
//		System.out.println(x[i]);
//		}	
		
		String names[] = new String[4];
		names[0] = "Joe";
		names[1] = "Harry";
		names[2] = "Joe";
		names[3] = "John";
		
		System.out.println(names.length);
		System.out.println(names[2]);
		for (int i=names.length-1; i>=0; i--) {
		System.out.print(names[i]+" ");
	}
		
//		String names[] = {"Tom", "Harry", "Joe", "John", "Jack", "David"};
//		System.out.println(names.length);
//		for (int i=0; i<names.length; i++) {
//			System.out.print(names[i]+" ");
//		}

	}
}
