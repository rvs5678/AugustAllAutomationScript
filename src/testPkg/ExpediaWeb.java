	package testPkg;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class ExpediaWeb {
	
		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ragha\\OneDrive\\Desktop\\Transfotech\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.expedia.com");
			driver.findElement(By.linkText("Sign in")).click();
			driver.findElement(By.id("signin-loginid")).sendKeys("shettyraghav@yahoo.com");
			driver.findElement(By.id("signin-password")).sendKeys("HappyNewYear2021");
			driver.findElement(By.id("signin-loggedin")).click();
			driver.findElement(By.id("submitButton")).click();
			
			/* In this i complete all the steps accept the submit , before submit there is a captcha image which is different everytime i run the code*/
			
		}
	
	}
