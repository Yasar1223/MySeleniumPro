package qsp;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");

		// Open the Browser
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/drive/");

		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("Manager");
		driver.findElement(By.xpath("//div[text()='login']")).click();

		// for(int i = 1; i <= 3; i++)
		while (true) {
			try {
				driver.findElement(By.id("logoutlink")).click();
				break;
			} catch (Exception e) {

			}
		}
	}
}