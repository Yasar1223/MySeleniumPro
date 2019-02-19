package qsp;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SampleActions {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");

		// Open the Browser
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		driver.get("http://qspider.com/");

		String xp = "//a[contains(text(),'About us')]";
		WebElement menu = driver.findElement(By.xpath(xp));

		Actions actions = new Actions(driver);
		actions.moveToElement(menu).perform();

		Thread.sleep(1000);
		driver.findElement(By.linkText("Faculty")).click();
	}

}
