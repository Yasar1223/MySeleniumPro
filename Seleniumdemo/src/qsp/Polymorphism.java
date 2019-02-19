package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Polymorphism {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");

		// Open the Browser
		WebDriver driver1 = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//Constructor
		Polymorphism.testScript(driver1);
		
		WebDriver driver2 = new ChromeDriver();
		//Constructor
		Polymorphism.testScript(driver2);
		}
	public static void testScript(WebDriver driver) {
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
	}
	
}
