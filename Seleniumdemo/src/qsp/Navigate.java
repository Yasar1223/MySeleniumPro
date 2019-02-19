package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");

		// Open the Browser
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		// Get only open the webpage
		driver.get("http://www.gmail.com");
		// Get only open the webpage,back,forword,refresh

		driver.navigate().to("http://www.gmail.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.quit();

	}
}
