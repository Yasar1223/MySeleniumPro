
package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handles {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");

		// Open the Browser
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("http://www.naukri.com");
		Set<String> allWHS = driver.getWindowHandles();
		int count=allWHS.size();
		System.out.println(count);
		
		for(String v:allWHS) {
			//driver.switchTo().window(v);
			System.out.println(driver.getTitle());
			Thread.sleep(1000);
			//driver.close();
		}
		driver.close();
	}
}