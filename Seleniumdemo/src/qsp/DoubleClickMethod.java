package qsp;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");

		// Open the Browser
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		driver.get("http://www.plus2net.com/javascript_tutorial/ondblclick-demo.php");

		String xp = "//input[@value='Double click']";
		WebElement button = driver.findElement(By.xpath(xp));

		Actions actions = new Actions(driver);
		actions.doubleClick(button).perform();
	}
}