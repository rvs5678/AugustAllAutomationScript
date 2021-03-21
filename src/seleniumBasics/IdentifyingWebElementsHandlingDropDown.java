package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IdentifyingWebElementsHandlingDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ragha\\OneDrive\\Desktop\\Transfotech\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/");
		System.out.println("Title of homepage: "+driver.getTitle());	
		System.out.println("URL of your page: "+driver.getCurrentUrl());
		
		driver.findElement(By.linkText("Flights")).click();
		System.out.println("Flight's page title: "+driver.getTitle());
		// xpath 
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
		// css selector
		driver.findElement(By.cssSelector("body > div:nth-child(5) > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(9) > td:nth-child(2) > font > font > input[type=radio]:nth-child(2)")).click();

		// handling dropDown
		WebElement passengerCount = driver.findElement(By.name("passCount"));
		Select select = new Select(passengerCount);
		select.selectByVisibleText("4");
		
		WebElement airlinePreference = driver.findElement(By.name("airline"));
		Select select1 = new Select(airlinePreference);
		select1.selectByIndex(1);
		
		Select select2 = new Select(driver.findElement(By.name("fromPort")));
		select2.selectByValue("New York");
		
		Select select3 = new Select(driver.findElement(By.name("toDay")));
		select3.selectByValue("25");
		
		// close the active browser
//		driver.close();
		
	

	}

}
