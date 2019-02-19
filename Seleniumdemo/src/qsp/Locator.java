package qsp;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");

		// Open the Browser
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/YASAR/Desktop/Sample.html");
		driver.findElement(By.tagName("a")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);

		driver.findElement(By.id("d1")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);

		driver.findElement(By.name("n1")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);

		driver.findElement(By.className("c1")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);

		driver.findElement(By.linkText("MyText")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);

		driver.findElement(By.partialLinkText("yT")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);


		
		
		
	}
}