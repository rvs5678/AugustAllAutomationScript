package javaBasics;

public class ConstructorConcept {
	
	// Constructor - method that carry name of the class/doesn't need return/when class is instantiated constructor will execute first
	// Where will we use ConstructorConcept? 
	// ConstructorConcpet will be used when we want some lines of code to be executed without calling the method
	
	
	ConstructorConcept() { //Constructor overloading
		System.out.println("I am in constructor with no parameter");
	}
	
	ConstructorConcept(String a) {
		System.out.println("I am in constructor with parameter");
	}
	
	private void test() { // method overloading
		System.out.println("I am test Method");
	}
	
	private void test(String a) {
		
		System.out.println("I am in test method with argument: " +a);
		
	}

	public static void main(String[] args) {
		ConstructorConcept cc = new ConstructorConcept(); // object of the class with no parameter - constructor with no parameter will be called
		
		ConstructorConcept cc1 = new ConstructorConcept("Hello world");
		cc1.test();
		cc1.test("Good Day");

		
	}

}
