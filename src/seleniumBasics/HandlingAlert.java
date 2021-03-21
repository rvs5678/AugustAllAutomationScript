package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ragha\\OneDrive\\Desktop\\Transfotech\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/delete_customer.php/");
		
		driver.findElement(By.name("cusid")).sendKeys("1234");
		driver.findElement(By.name("submit")).click();
		
		//to handle alert
		System.out.println("Alert msg: "+driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
		
		driver.close();
		
	// how can you switch your attention from your page to alert
//	`	ans is by doing swithTo method and then alert() method
	}

}
