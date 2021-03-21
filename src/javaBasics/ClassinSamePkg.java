package javaBasics;

public class ClassinSamePkg {

	public static void main(String[] args) {

		
		AccessModifierConcept amc = new AccessModifierConcept();
//		System.out.println(a); // not the property of this class
		System.out.println(amc.a); // not the property of this class
		System.out.println(amc.b); //
		System.out.println(AccessModifierConcept.a); // if static better call it with class name
//		sysout
		
		
	//	testMethod(); // not the property of this class
	//	amc.testMethod(); 
		AccessModifierConcept.testMethod();
	}

}
