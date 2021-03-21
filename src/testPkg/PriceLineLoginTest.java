package testPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PriceLineLoginTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ragha\\OneDrive\\Desktop\\Transfotech\\Drivers\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.priceline.com");
		driver.findElement(By.id("sign-in-module__button-border")).click();
		driver.findElement(By.id("register-link-variant")).click();
		driver.findElement(By.name("firstName")).sendKeys("Gordon");
		driver.findElement(By.name("lastName")).sendKeys("Monteiro");
		driver.findElement(By.name("email")).sendKeys("gordonmonteiro219@gmail.com");
		driver.findElement(By.name("password")).sendKeys("HappyNewYear2021");
		driver.findElement(By.name("confirmPassword")).sendKeys("HappyNewYear2021");
		driver.findElement(By.id("registration-submit")).click();
		
		
		
	}

}
