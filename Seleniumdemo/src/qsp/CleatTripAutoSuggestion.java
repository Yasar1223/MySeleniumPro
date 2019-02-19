package qsp;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CleatTripAutoSuggestion {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");

		// Open the Browser
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/flights");
		driver.findElement(By.id("FromTag")).sendKeys("bang");
		
		String xp = "//div[contains(text(),'bang')]";
		List<WebElement> allASE = driver.findElements(By.xpath(xp));

		int count = allASE.size();
		System.out.println(count);

		for (int i = 0; i < count; i++) {
			WebElement ASE = allASE.get(i);
			String text = ASE.getText();
			System.out.println(text);
		}
		allASE.get(0).click();

	}
}