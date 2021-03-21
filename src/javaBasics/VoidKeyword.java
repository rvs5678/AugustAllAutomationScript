package javaBasics;

public class VoidKeyword {
	
	// void = return type (returning nothing) - instead of void = String, int, boolean....
	
	public static void test1() {
		int i = 10 + 20;
	}
	public static int test2() {
		int i = 10 + 20;
		return i;
	}
 
	public static void test3() {
		int i = 30 + 20;
		System.out.println(i);
	}
	public static void main(String[] args) {
		test1();
//		System.out.println(test1());  error - no return type associated with method
		System.out.println(test2());
		test3();  // printing something but returning nothing
	}

}
