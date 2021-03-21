package javaBasics;

import java.util.Scanner;

public class ScannerConcept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("Provide first name: ");
//		String firstName = scan.nextLine(); // next() or nextLine() - expecting string values
//		System.out.println("Provide last name: ");
//		String lastName = scan.next();
//		scan.close();
//		System.out.print("Welcome back "+firstName+" "+lastName+ "!");
		
		String DBusername = "john123";
		String DBpassword = "12345" ;
		
		System.out.print("Enter Username: ");
		String username = scan.next();
		System.out.print("Enter password: ");
		String password = scan.next();
		scan.close();
		
		if(username.equals(DBusername) && password.equals(DBpassword)) {
			System.out.println("Login Successful");
			System.out.println("Welcome "+username+"!");
		}
		else {
			System.out.println("Provide valid username or password");
			
		}
		
		
	}
	

}
