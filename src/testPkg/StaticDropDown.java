package testPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ragha\\OneDrive\\Desktop\\Transfotech\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(5);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("GBP");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("BDT");
		System.out.println(dropdown.getFirstSelectedOption().getText());

		
	// practice static dropdown thru rahul shetty course	

	}

}
