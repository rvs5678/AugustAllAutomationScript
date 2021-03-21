package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCssConcept {
	
	// <input type="submit" name="submit" value="Submit" style="background-color">
			// Absolute Xpath: /html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input
			// Absolute CssSelector:  body > div:nth-child(5) > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(2) > td:nth-child(3) > form > table > tbody > tr:nth-child(4) > td > table > tbody > tr:nth-child(4) > td:nth-child(2) > div > input[type=submit]
			// Absolute Xpath or Css is very long and chances are it could change and we may not get the right path so the answer for this is to customize the xpath or css selector
			// Answer = customization of Xpath or Css Selector
			
			// Customization of Xpath and Css Selector
			// Common Syntax for Xpath         = //tagname[@attribute='value'] or //*@attribute='value']
			// Common Syntax for Css Selector  = tagName[attribute='value'] or [attribute='value']
	
			//tagname[@attribute='value'] or //*[@attribute='value']
			// difference between absolute xpath and Css
			// Absolute Xpath will have forward slash between the tag and Css has more then sign(>) between the tag
			// Customize Xpath and CSS -  there is double forward slash before the tagName and @ before attribute and none is required in Css Selector
	
			// E.g. <input type="submit" name="submit" value="Submit" style="background-color">
			//  Xpath = //input[@type='submit'],OR //input[@value='Submit']
			//  Css	  = input[type='submit'] 

			// Validation of Customized xpath or css selector:
				// 1. Chropath plugin - its a 3rd party tool. (if our project doesnt allow it we can use console)
				// 2. Chrome or any browser Development tool - Console - xpath => $x("//input[@type='submit']")
				//											Css => $("input[type='submit']")

			// using more then 1 attribute for customization
			// <input type="submit" name="submit" value="Submit" style="background-color">
			// <input type="submit" style="background-color">
			// <input value="Submit" style="background-color"> 
				// xpath = // input[@type='submit'][@value='Submit']
				// Css  =  // input[type='submit'][value='Submit']
	
			// using text as an attribute
				// <font face="Arial, Helvetica, sans-serif" size="2" xpath="1">Registered 
				//	users can <b>sign-in here</b> to find the lowest fare on participating
    			//	airlines.</font>
					// xpath - //font[contains(@text,'Registered users can sign-in here to find the lowest fare on participating airlines.')]
	
			    
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ragha\\OneDrive\\Desktop\\Transfotech\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		
	}

}
