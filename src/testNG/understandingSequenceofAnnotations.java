package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class understandingSequenceofAnnotations {
	
	@Test
	public void test1() {
		System.out.println("First test case");
	}
	
	@Test
	public void test2() {
		System.out.println("Second test case");
	}
	
	@BeforeMethod
	public void beforeMethod( ) {
		System.out.println("Before Method execution");
	}

	@AfterMethod
	public void afterMethod( ) {
		System.out.println("After method execution");
	}
	
	@BeforeTest
	public void beforeTest( ) {
		System.out.println("Before Test execution");
	}
	@AfterTest	
	public void afterTest( ) {
		System.out.println("After Test execution");
	}
}

