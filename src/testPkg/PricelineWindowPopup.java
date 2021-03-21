package testPkg;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PricelineWindowPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ragha\\OneDrive\\Desktop\\Transfotech\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.priceline.com/?vrid=b0358d37e07b058745cf586714e63b36");
		
//		String parentWindowHandle = driver.getWindowHandle();
//		System.out.println("Parent window handle: "+parentWindowHandle);
		
		driver.findElement(By.id("link_header_nav_hotels")).click();
		Set <String> handles = driver.getWindowHandles();
		System.out.println("Number of handles: "+handles.size());
		

		Iterator<String> it = handles.iterator();
		
		driver.switchTo().window(it.next());
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println(parentWindowHandle);
		
		driver.switchTo().window(it.next());
		String childWindowHandle = driver.getWindowHandle();
		System.out.println(childWindowHandle);
		
		Thread.sleep(5000);
		
		
		
//		driver.close();
		driver.quit();
	}

}
