package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");

		// Open the Browser
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		
		System.out.println(driver);
		String wh=driver.getWindowHandle();
		System.out.println(wh);
}
}