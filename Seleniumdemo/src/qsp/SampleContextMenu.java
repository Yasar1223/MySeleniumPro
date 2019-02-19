package qsp;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.glass.events.KeyEvent;
import com.sun.glass.ui.Robot;

public class SampleContextMenu {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");

		// Open the Browser
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.actime.com/login.do");

		String str = "actiTIME Inc.";
		WebElement link = driver.findElement(By.linkText(str));

		Actions actions = new Actions(driver);
		actions.contextClick(link).perform();

		Thread.sleep(1000);


//		Robot r = new Robot();
	//	r.keyPress(KeyEvent.VK_T);
	}
}