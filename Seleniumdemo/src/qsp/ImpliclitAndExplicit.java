package qsp;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImpliclitAndExplicit {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");

		// Open the Browser
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/");

		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("Manager");
		driver.findElement(By.xpath("//div[text()='login']")).click();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("Time"));
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("logoutlink")).click();
		wait.until(ExpectedConditions.titleContains("login"));
		System.out.println(driver.getTitle());
		driver.close();
		
	}
}