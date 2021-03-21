package javaBasics;

public class MethodTypesConcept {
	
	// Method types - static and non-static
			// Method types - void keyword - non-returning method / if void is replaced by some data types then this method will replace something
			// Method types - presence of arguments - if no arguments then it will be called as method with no argument
	
void test1() { // method with no argument
		
	}
	
	void test2(int i) { // method with 1 argument
		
	}
	
	void test3(int i, int j, String a) { // method with multiple arguments
		
	}
	
	public static void addition() {
		int b = 30;
		int c = 50;
		int a = b + c;
		System.out.println(a);
	}
	
	public static void addition2(int b, int c) {
		int a = b + c;
		System.out.println(a);
	}
	
	public static int addition3(int a, int b, int c) {
		int d = a+b+c;
		return d;
		
		
	}
	
	public int substraction(int a, int b, int c) {
		int x = a-b-c;
		
		return x;
	}
	


	public static void main(String[] args) {
		addition();
//		addition2(); // cannot call method with argument without the argument
		addition2(100,200);
		addition2(3254585 , 25465485);
		
		MethodTypesConcept mtc = new MethodTypesConcept();
		System.out.println(mtc.substraction(250, 10, 15));
		System.out.println(addition3(25,50,25));
		
	}		
	
}
