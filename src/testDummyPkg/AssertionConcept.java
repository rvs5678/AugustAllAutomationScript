package testDummyPkg;
// Verificaton Vs Validation

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

// Verification -> If-Else condition -> tell if the test case passed or failed
// Validation -> not just checking condition -> tell pass/fail
// Assertion -> we will use three common 
	// 1. assertEquals() -> Will compare "expected results" vs "actual result"
	// 2. assertTrue()   -> going to check if output of the condition is true or not
	// 3. assertFalse()  -> going to check if output of the condition is false or not
	
// Keywords 1. Priority with number will make the test run as numbered for ex: (Priority = 1)
// 			2. (enabled = false) means that test case wont run and if you want it to run then change it to true like  (enabled = true)
//			3. dependsOnMethods -> create dependency between test cases
//			4. dataProvider -> data driven using @DataProvider annotation
//			5. groups -> can group test cases into specific groups e.g. smoke test group, Regression Test group, End-to-End test group



public class AssertionConcept {
	
WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ragha\\OneDrive\\Desktop\\Transfotech\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // implicit wait
	driver.get("http://demo.guru99.com/test/newtours/");
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	
	@Test (priority = 1)
	public void clickSignOnLink() {
		driver.findElement(By.linkText("SIGN-ON")).click();
		
		String ActualSignOnPageTitle = driver.getTitle();
		String ExpectedSignOnPageTitle = "Sign-on: Mercury Tours";
		
		System.out.println("ActualSignOnPageTitle");
		
		Assert.assertEquals(ExpectedSignOnPageTitle, ActualSignOnPageTitle);
			}
	
	@Test (priority = 2, enabled = false) 
	public void clickRegisterLink() {
		driver.findElement(By.linkText("REGISTER")).click();
		String ActualRegisterLinkPageTitle = driver.getTitle();
		String ExpectedRegisterLinkPageTitle = "Register: Mercury Tours";
		System.out.println("ActualRegisterLinkPageTitle");

		Assert.assertEquals(ActualRegisterLinkPageTitle, ExpectedRegisterLinkPageTitle);
	}
	
	@Test (priority = 3, enabled = false)
	public void clickSupportLink() {
		driver.findElement(By.linkText("SUPPORT")).click();
		String ActualSupportLinkPageTitle = driver.getTitle();
		String ExpectedSupportLinkPageTitle = "Support: Mercury Tours";
		
		Assert.assertEquals(ActualSupportLinkPageTitle, ExpectedSupportLinkPageTitle);
	}
	
	@Test (priority = 4)
	public void submitBtnEnable() {
		WebElement submitBtn = driver.findElement(By.name("submit"));
		
		Assert.assertTrue(submitBtn.isEnabled()); // requirement = submit needs to be enabled all the time
	
	}
	
	@Test (priority = 5)
	public void submitBtnEnableAfterCredentials() {
		// requirement  = submit needs to be enabled only after typing username and password
		
		WebElement submitBtn = driver.findElement(By.name("submit"));
		Assert.assertFalse(submitBtn.isEnabled());

		
		driver.findElement(By.name("username")).sendKeys("test1234");
		driver.findElement(By.name("password")).sendKeys("123");
		
		Assert.assertTrue(submitBtn.isEnabled());

	}
	
	
	
	
}
