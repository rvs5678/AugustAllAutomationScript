package testPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PriceLineWebApp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ragha\\OneDrive\\Desktop\\Transfotech\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.priceline.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("link_header_nav_cruises")).click();
		
		WebElement destination = driver.findElement(By.id("destinationText"));
		Select select = new Select(destination);
		select.selectByVisibleText("Canada/New England/NY");
		

	}
}
