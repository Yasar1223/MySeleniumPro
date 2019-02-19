package qsp;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.
chrome.ChromeDriver;

public class CssSelector {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");

		// Open the Browser
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/YASAR/Desktop/Sample.html");

		driver.findElement(By.cssSelector("a[id='d1']")).click();
		Thread.sleep(1000);
		driver.navigate().back();

		driver.findElement(By.cssSelector("a[name='n1']")).click();
		Thread.sleep(1000);
		driver.navigate().back();

		driver.findElement(By.cssSelector("a[class='c1']")).click();
		Thread.sleep(1000);
		driver.navigate().back();

		driver.findElement(By.cssSelector("a[title='t1']")).click();
		Thread.sleep(1000);
		driver.navigate().back();

		driver.findElement(By.cssSelector("a[href='http://www.google.com']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
	}
}