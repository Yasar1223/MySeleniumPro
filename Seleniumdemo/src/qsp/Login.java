package qsp;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");

		// Open the Browser
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		driver.get("//http.www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("Arafath");
		
		driver.findElement(By.id("pass")).sendKeys("Yasar");
		
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
}
}
