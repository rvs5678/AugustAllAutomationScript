package javaBasics;

public class ObjectConcept {
	
	static int Legs = 4;
	static int eyes = 2;
	static String name = "Tom";
	
	public static void bark() {
		System.out.println(name+" can bark.");
	}
	
	public static void run() {
		System.out.println(name+" with "+Legs+" and "+eyes+" eyes can run");
	}

	public static void main(String[] args) {
		
		ObjectConcept oc = new ObjectConcept();
		
		System.out.println(oc.name);
		oc.bark();
		oc.run();
		
		
	}

}
