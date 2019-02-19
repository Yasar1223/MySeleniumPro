package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooLogin {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/");
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("yasar.1223");
		driver.findElement(By.id("login-signin")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("login-passwd")).sendKeys("hasna5080");
		driver.findElement(By.id("login-signin")).click();
	}

}