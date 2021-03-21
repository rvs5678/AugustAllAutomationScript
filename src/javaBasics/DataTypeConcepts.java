package javaBasics;

public class DataTypeConcepts {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		type of data
//		what kind of data we are gonna store
//		what is referring to this data
//		
//		there are two kinds of data we can create
//		1. primitive data type
//		2. object data type
		
//		primitive data types are
//		byte, short, int, long, float, double, char, boolean, 
//		these are predefined by the language and named by a keyword. they dont have a method these are just defining the data
//				
////	Object data types are
//		1. string
//		2.
//
//		commonly used primitive data types are int, long, short, double, char, boolean double
//		byte - 8 bit
		short - 16-bit
		int - 32-bit 
		long - 64-bit
		float - small decimals
		double - more then two decimals
		boolean - 
		*/
// 		int - Integer - numerical values - default 0
		int firstnumber = 10;
		System.out.println("Firstnumber: "+firstnumber);
		
		long bignumber = 1000000L;
		System.out.println("Bignumber: "+bignumber);
		
		short shortNumber = 5645;
		System.out.println("Short number: "+shortNumber);
		
		
		float smallDecimal = 10.06F;
		System.out.println("smallDecimal: "+smallDecimal);
		
		double bigDecimal = 148.9999997d;
		System.out.println("bigDecimal: "+bigDecimal);
		
//		char - alphabetic or numerical single digit, it can be upper or lower case
		char characterData = '1';
		System.out.println("character data is: "+characterData);
		
//		boolean either true or false
		boolean earthIsRound = true;
		boolean earthIsNotRound = false;
		
		System.out.println("Earth is Round: "+earthIsRound);
		System.out.println("Earth is not round: "+earthIsNotRound);
		
		
//		string - alphanumeric values - should be inside double quote " "
		String a = "We are taking java class 1";
		System.out.println(a);
		
		 
	}

}
