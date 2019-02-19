package qsp;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleDriverAccess {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");

		// Open the Browser
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.google.com/drive/");
		driver.findElement(By.linkText("Go to Google Drive")).click();
		
		driver.findElement(By.id("identifierId")).sendKeys("yasarcse01@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();

		driver.findElement(By.name("password")).sendKeys("arafathhasna1223");
		driver.findElement(By.xpath("//span[text()='Next']")).click();


	}
}