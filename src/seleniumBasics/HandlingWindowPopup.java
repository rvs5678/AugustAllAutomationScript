package seleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindowPopup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ragha\\OneDrive\\Desktop\\Transfotech\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("http://demo.guru99.com/popup.php");
		
//		String parentWindowHandle = driver.getWindowHandle();
//		System.out.println("Parent Window Handle: "+parentWindowHandle);
		
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> handles = driver.getWindowHandles();
		System.out.println("Number of windows opened: "+handles.size());
		
		Iterator<String> it = handles.iterator();
		
		driver.switchTo().window(it.next());
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("Parent window handle: "+parentWindowHandle);
		
		driver.switchTo().window(it.next());
		String childWindowHandle = driver.getWindowHandle();
		System.out.println("Child window Handle: "+childWindowHandle);
		
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("joesmith@gmail.com");
	    driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	    driver.findElement(By.xpath("//a[@href='/popup.php']")).click();
	    driver.findElement(By.xpath("//p[@style='text-align:center']/a")).click();
		
		driver.switchTo().window(parentWindowHandle);
		if (driver.getWindowHandle().equals(parentWindowHandle)) {
			System.out.println("Switched to Parent window");
		}
	
//	
//	    driver.switchTo().window();
//	    String childWindowHandle1 = driver.getWindowHandle();
//	    System.out.println(childWindowHandle1);
//	    
		
//		
		
		Thread.sleep(5000);
		
//		driver.close(); // closing parent window only, as it is still the active window
		driver.quit(); // closes all the window opened by browser instance
	}

}
