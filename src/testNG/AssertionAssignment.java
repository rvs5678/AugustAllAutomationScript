package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertionAssignment {

	WebDriver driver;

	@BeforeMethod
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ragha\\OneDrive\\Desktop\\Transfotech\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.bankofamerica.com/");
		
	}

	@AfterMethod
	public void closeBrower() {
		driver.close();
	}
	
	@Test
	public void clickOnCheckingLink() {
		driver.findElement(By.xpath("//a[@id='navChecking']")).click();
		String ActualCheckingBtnClickable = driver.getTitle();
		String ExpectedCheckingBtnClickable = "Bank of America - Banking, Credit Cards, Loans and Merrill Investing";
		Assert.assertEquals(ActualCheckingBtnClickable, ExpectedCheckingBtnClickable);
	}
	
	// Testing github
	
}
