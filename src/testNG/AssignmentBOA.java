package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssignmentBOA {
	WebDriver driver;

@BeforeMethod
public void openBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ragha\\OneDrive\\Desktop\\Transfotech\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.bankofamerica.com/");
	
}

@AfterMethod
public void closeBrower() {
	driver.close();
}

@Test
public void clickOnCheckingLink() {
	driver.findElement(By.xpath("//a[@id='navChecking']")).click();
	System.out.println(driver.getTitle());
}

@Test
public void clickOnSavingsLink() {
	driver.findElement(By.xpath("//a[@id='navSavings']")).click();
	System.out.println(driver.getTitle());
}

@Test
public void clickOnCreditCards( ) {
	driver.findElement(By.xpath("//a[@id='navCreditCards']")).click();
	System.out.println(driver.getTitle());
}

@Test
public void clickOHomeLoansLink( ) {
	driver.findElement(By.xpath("//a[@id='navHomeLoans']")).click();
	System.out.println(driver.getTitle());
}

@Test
public void clickOnAutoLoansLink( ) {
	driver.findElement(By.xpath("//a[@id='navAutoLoans']")).click();
	System.out.println(driver.getTitle());
}

@Test
public void clickOnInvestingLink( ) {
	driver.findElement(By.xpath("//a[@id='navInvesting']")).click();
	System.out.println(driver.getTitle());
}
@Test
public void clickOnBetterMoneyHabitsLink( ) {
	driver.findElement(By.xpath("//a[@id='navBetterMoneyHabits']")).click();
	System.out.println(driver.getTitle());
}
@Test
public void clickOnPersonalLink( ) {
	driver.findElement(By.xpath("//a[@id='NAV_PERSONAL']")).click();
	System.out.println(driver.getTitle());
}

@Test
public void clickOnimage() {
	driver.findElement(By.xpath("//img[contains(@src,'highlights-consumer-mobile')]")).click();
	System.out.println(driver.getTitle());
}

@Test
public void clickOnGetCheckingWithRightFeaturesLink() {
	driver.findElement(By.xpath("//a[@id='DCTAQT3H']")).click();
	System.out.println(driver.getTitle());

}

}