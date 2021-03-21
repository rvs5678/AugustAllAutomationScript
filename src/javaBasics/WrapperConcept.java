package javaBasics;

public class WrapperConcept {

	public static void main(String[] args) {

		//wrapper concept - converting one dataType to different
		// Example taking in salary data in String - 9000, 9000.0000, $9000, 9000dollar 25 cents
		// convert salary into integer/numerical dataTypes - Maths
		
		int a = 100;
		String b = "200";
		
		System.out.println(a+b);
		int integerB = Integer.parseInt(b); // converting String to integer
			System.out.println(a+integerB);
			
		String convertedA = String.valueOf(a);  // valueOf() = convert integer to String
		System.out.println("Number of Characters in 100: "+convertedA.length());
		
		long c = 4114258756982541L;
		String convertedCreditCardNumber = String.valueOf(c);
		int numberofindexCC = convertedCreditCardNumber.length();
		System.out.println(numberofindexCC);
		if(numberofindexCC==16) {
			System.out.println("valid credit card");
		}
		else {
			System.out.println("Invalid Credit Card");
		}
	 // assignment: use scanner concept/access modifier to get the value
		//convert 4114258756982541L to 4114-2587-5698-2541L hint : wrapper concept/String manipulation
		// DOB - 01011999 convert into 01/01/1999
		// time - 145524 convert into 14:55:24
	}
	

}
