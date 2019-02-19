package qsp;


import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalandorAndHiddenPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");

	}
	public static void main(String[] args) {
		
		
		int n = LocalDate.now().getDayOfMonth();
		String xp = "//a[text()= '" + n + "']";
		System.out.println(xp);

		// Open the Browser
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://retail.starhealth.in/renewal");
		driver.findElement(By.id("dtDOB")).click();
		driver.findElement(By.xpath(xp)).click();
	}
}