package testPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class PriceLineFlightsTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ragha\\OneDrive\\Desktop\\Transfotech\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.priceline.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("FLIGHTS")).click();
		driver.findElement(By.id("flight-departure-airport0")).sendKeys("LGA");
		driver.findElement(By.id("flight-arrival-airport0")).sendKeys("BOS");
		driver.findElement(By.name("flight-date-range")).click();
		driver.findElement(By.xpath("//div[@aria-label='February 18, 2021']")).click();
		driver.findElement(By.xpath("//div[@aria-label='February 27, 2021']")).click();
		driver.findElement(By.xpath("//button[@id='traveler-selection-readonly-input']")).click();
		WebElement add_adult_button = driver.findElement(By.id("traveler-selection-adults-plus-button"));
//		driver.findElement(By.xpath(
		for (int i = 0; i < 3; i++)
		{
			add_adult_button.click();
		}
		WebElement addYouth = driver.findElement(By.id("traveler-selection-youths-plus-button"));
		for (int i=0; i<2; i++)
		{
			addYouth.click();
		}
		WebElement addChildren = driver.findElement(By.id("traveler-selection-children-plus-button"));
		for (int i=0;i<3; i++) {
			addChildren.click();
		}
		driver.findElement(By.id("traveler-selection-done-button")).click();
		driver.findElement(By.xpath( "//button[@class='sc-iwsKbI gvhtry']")).click();
		
//		Thread.sleep(3000);
		
//		driver.close();
		
		
		
		
	
		/* I could open home page select flights and add destination to and from, but couldn't select dates */
	
	}

}
