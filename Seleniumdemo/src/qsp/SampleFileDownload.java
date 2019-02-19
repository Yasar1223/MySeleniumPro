package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.glass.events.KeyEvent;

public class SampleFileDownload {
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		// System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");

		// Open the Browser
		// WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.seleniumhq.org/download/");
		driver.findElement(By.linkText("3.141.59")).click();
		Thread.sleep(5000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_LEFT);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
	}
}