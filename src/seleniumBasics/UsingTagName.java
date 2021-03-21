package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingTagName {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ragha\\OneDrive\\Desktop\\Transfotech\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/");
		// findElements() to identify more then one element witht that locator
	
		List<WebElement> tagsInHomePage = driver.findElements(By.tagName("a"));
		System.out.println("Number of links in HomePage: "+tagsInHomePage.size());
		
		List<WebElement> inputInHomePage = driver.findElements(By.tagName("input"));
		System.out.println("Number of input in Home page: "+inputInHomePage.size());
		
		List<WebElement> imagesInHomePage = driver.findElements(By.tagName("img"));
		System.out.println("Number of images in Home Page: "+imagesInHomePage.size());
	}
	
}