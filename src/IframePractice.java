import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ragha\\OneDrive\\Desktop\\Transfotech\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.softwaretestinghelp.com/");
		
		List <WebElement> img = driver.findElements(By.tagName("img"));
		System.out.println("Number of img -"+img.size());
		
		for (int i=0; i<img.size(); i++) {
			System.out.println("Values of img - "+img.get(i).getAttribute("src"));
		}
		
		driver.close();
	}

}
