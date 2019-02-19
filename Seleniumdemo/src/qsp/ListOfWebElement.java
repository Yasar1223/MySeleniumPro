package qsp;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListOfWebElement {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");

		// Open the Browser
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		driver.get("http://www.flipkart.com");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		int count = allLinks.size();
		System.out.println(count);
		
		for (int i = 0; i < count; i++) {
			WebElement link = allLinks.get(i);
			String text = link.getText();
			System.out.println(text);
		}
	}
}