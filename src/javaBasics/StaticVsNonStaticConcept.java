package javaBasics;

public class StaticVsNonStaticConcept {
	
	static int a = 10; // class variable /static variable
	static int b = 20;
	int c = 30;  // instance variable/non-static variable
	int d = 40;
  
	public static void addition() { //static method
		System.out.println("Addition of a & b: "+(a+b) );
		int c = StaticVsNonStaticConcept.a+StaticVsNonStaticConcept.b;
		System.out.println("Addition of a & b with classname: "+c);
		
		StaticVsNonStaticConcept snc = new StaticVsNonStaticConcept();
		int d = snc.a+snc.b; 
		System.out.println("Addition of a & b with ObjectRefName: "+d);
		
		int e = snc.c+snc.d;
		System.out.println("Addition of c & d with objectRefName: "+e);
		
}

	public void substraction() { // non-static method
		System.out.println("Addition of a & b: "+(a-b) );
		int c = StaticVsNonStaticConcept.a+StaticVsNonStaticConcept.b;
		System.out.println("Addition of a & b with classname: "+c);
		
		StaticVsNonStaticConcept snc = new StaticVsNonStaticConcept();
		int d = snc.a-snc.b; 
		System.out.println("Addition of a & b with ObjectRefName: "+d);
		
		int e = snc.c-snc.d;
		System.out.println("Addition of c & d with objectRefName: "+e);
		
	}
	
	public static void main(String[] args) {
		
		// static method and variable can be called directly or can be called with the use of class name or can be called with the use of Object reference name
		// non-static method/variable - can be only called with object reference name
		// if not followed - static and non-static mismatch error or warning will be displayed
		
	//	addition();
	//	StaticVsNonStaticConcept.addition();
		
		StaticVsNonStaticConcept snc = new StaticVsNonStaticConcept();
		snc.addition();
		
//		substraction(); // option 1 not allowed
//		StaticVsNonStaticConcept.substraction(); // option - 2 not allowed
		
		snc.substraction(); //option 3 - only allowed
//		
		
		
	}

}
