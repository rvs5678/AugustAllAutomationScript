package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTestNGframework {
	
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
	
	@Test
	public void clickSignOnLink() {
		driver.findElement(By.linkText("SIGN-ON")).click();
		System.out.println(driver.getTitle());
			}
	
	@Test
	public void clickRegisterLink() {
		driver.findElement(By.linkText("REGISTER")).click();
		System.out.println(driver.getTitle());
		
	}
	
	@Test
	public void clickSupportLink() {
		driver.findElement(By.linkText("SUPPORT")).click();
		System.out.println(driver.getTitle());
	}
	
	
	
	
}
