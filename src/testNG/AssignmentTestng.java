package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssignmentTestng {
	WebDriver driver;
	
	@BeforeMethod
	 public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ragha\\OneDrive\\Desktop\\Transfotech\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.bestbuy.com/");
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	
	@Test
	public void clickCreditcardtLink () {
		driver.findElement(By.xpath("//a[@data-lid='hdr_crd']")).click();
		System.out.println(driver.getTitle());
	}
	@Test
	public void clickDealoftheDayLink() {
		driver.findElement(By.linkText("Credit Cards")).click();
	}
	
	@Test
	public void clickCreditCardsLink( ) {
		driver.findElement(By.linkText("Credit Cards")).click();
	}
}
