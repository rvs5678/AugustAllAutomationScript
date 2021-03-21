package testPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PricelineWebAppTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ragha\\OneDrive\\Desktop\\Transfotech\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.priceline.com");
		driver.findElement(By.id("location")).sendKeys("Mumbai India");
		driver.findElement(By.id("location")).click();
		driver.findElement(By.id("date-range")).click();
//		driver.findElement(by)
	}

}
