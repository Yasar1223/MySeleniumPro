package qsp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollBarExample {
	public static class Screenshot {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			//System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");

			// Open the Browser
			WebDriver driver = new ChromeDriver();
			//WebDriver driver = new FirefoxDriver();
			driver.get("https://www.w3schools.com/");
			// driver.get("http://www.actitime.com/license.agreement");

			JavascriptExecutor j = (JavascriptExecutor) driver;
			// Downside scroll
			for (int i = 1; i <= 10; i++) {
				j.executeScript("window.scrollBy(0, 500)");
				Thread.sleep(1000);
			}
			// Upside scroll
			for (int i = 1; i <= 10; i++) {
				j.executeScript("window.scrollBy(0, -500)");
				Thread.sleep(1000);
			}

		}
	}
}