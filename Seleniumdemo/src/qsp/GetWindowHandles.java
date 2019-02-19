package qsp;
//use this website http://toolsqa.com/selenium-webdriver/switch-commands/
import java.io.IOException;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {
	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");

		// Open the Browser
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		Thread.sleep(1000);
//		String str = "Actimind Inc";
//		driver.findElement(By.linkText(str)).click();
		
//
//		System.out.println("waiting for 30 sec");
//		Thread.sleep(30000);
//		System.out.println("waiting Over");
//
		Set<String> allWHS = driver.getWindowHandles();
		System.out.println(allWHS.size());
//
		for (String WH : allWHS) {
			driver.switchTo().window(WH);
			System.out.println(driver.getTitle());
		}
		driver.close();
	}
}