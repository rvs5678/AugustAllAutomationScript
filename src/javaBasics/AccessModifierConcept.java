package javaBasics;

public class AccessModifierConcept {

	// What are the different Access Modifier? 
	
//	4 Types of Access modifier
//	1. Default - Visible to the package, the default. No modifiers are needed
//	2. Private - Visible to the class only (private) - can only be accessed within the class.
//	3. public - Visible to the world (public). can be accessed in same class/class in same package/ class in different package
//	4. protected - visible to the package and all subclasses (protected) - can be accessed in same class/class in same package but not in different class.
//	
//  default vs protected - protected property can also be accessed in subClasses/ default cannot be accessed
	
	public static String a = "hi";
	public static String b = "How are you?";
	static String c = "Welcome"; // default access modifier
	private static String d = "Bye";
	protected static String e = "Goodnight";
	
	public static void testMethod() {
		System.out.println("Hello world");
	}
	
	public void testMethodTwo() {
		System.out.println("Hello world");
	}
	
	static void testMethodThree() {
		System.out.println("I am in default method");
	}
	
	private static void testMethodFour() {
		System.out.println("I am in Private method");
	}
	
	protected static void testMethodFive() {
		System.out.println("I am in protected Method");
	}
		
	
	
	public static void main(String[] args) {

		System.out.println(a);
		testMethod();
		System.out.println(b);
	//	testMethodTwo();
		System.out.println(c);
		testMethodThree();
		System.out.println(d);
		testMethodFour();
		System.out.println(e);
		testMethodFive();
	
	}

}
