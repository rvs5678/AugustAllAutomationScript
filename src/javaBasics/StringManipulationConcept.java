package javaBasics;

public class StringManipulationConcept {

	public static void main(String[] args) {

		String a = "java coding";
		String b = "is fun";
		
		System.out.println(a);
		System.out.println(" "+b);
		
		String c = a+" "+b;
		System.out.println(c);
		
		int x = 100;
		int y = 200;
		
		System.out.println(x+y);
		System.out.println(a+x);
		System.out.println(x+a);
		System.out.println(x+y+a);
		System.out.println(a+x+y); // java code execution is happening from left to right in java
		System.out.println(a+(x+y));
		
		String firstString = "java coding";
		String secondString = " is fun";
		
		// concatenation with concat method
		String concatenatedString = firstString.concat(secondString);
		System.out.println(concatenatedString);
		
		// length() - gives size of a string
		System.out.println("Size of first string: "+firstString.length());
		System.out.println("Size of second string: "+secondString.length());
		
		// Lower/Upper case 
		String upperCaseFirstString = firstString.toUpperCase();
		System.out.println(upperCaseFirstString);
		System.out.println(secondString.toUpperCase());
		
		String lowercaseFirstString = upperCaseFirstString.toLowerCase();
		System.out.println(lowercaseFirstString);
		
		//compareTo() - comparison method
		firstString.compareTo(upperCaseFirstString);
		System.out.println("comparing firstString to uppercasefirststring: "+
		firstString.compareTo(upperCaseFirstString));
		
		System.out.println("comparing firstString to lowercasefirststring: "+
				firstString.compareTo(lowercaseFirstString));
		
		//equals() - comparison method - output will be boolean
		
		boolean comparingfirstStringtoUpperCased = firstString.equals(upperCaseFirstString);
		System.out.println("comparing firststring to upper case first string: "+ 
				comparingfirstStringtoUpperCased);
		System.out.println("comparing firststring to lowercasefirststring: "+firstString.equals(lowercaseFirstString));
		
		
		System.out.println("comparing firststring to uppercasefirststring despite upper/lower: "+
		firstString.equalsIgnoreCase(upperCaseFirstString));
		
		//location of a character in a string or which character is at a specific location
		System.out.println("Character at 7th location: "+firstString.charAt(7));
		
		//position of a character by using indexOF
		System.out.println("postion of g: "+firstString.indexOf('g'));
		
		String customerName = "     Tom Johns     ";
		String customerAddress = "NY";
		System.out.println(customerName+" lives in "+customerAddress);
		System.out.println("Welcome "+ customerName+"!");
		
		String trimedCustomerName = customerName.trim();		
		System.out.println(trimedCustomerName+" lives in "+customerAddress);
		System.out.println("Welcome "+ trimedCustomerName+"!");
		
		//contains() - check if character is present - boolean output
		System.out.println("CustomerName contains o: "+trimedCustomerName.contains("o"));
		
		System.out.println("CustomerName contains a: "+trimedCustomerName.contains("a"));
		System.out.println("CustomerName contains tom: "+trimedCustomerName.contains("Tom"));
		
		//lastIndexOf
		
		System.out.println("Location of o: "+trimedCustomerName.indexOf('o'));
		System.out.println("Location of last o: "+trimedCustomerName.lastIndexOf('o'));
		
		//replace - replacing a character to a new characted provided
		String replacedCustomerName = trimedCustomerName.replace(' ', '-');
		System.out.println("Space replaced by -: "+replacedCustomerName);
		
		
		String name = "H a r r y";
		System.out.println(name.replaceAll(" ", ""));
		
		//split() - breaking string into multiple strings
	//	String location ="N e w Y o r k";
	//	String[] splitedLocation = location.split(" ");
		
		
	}

}
