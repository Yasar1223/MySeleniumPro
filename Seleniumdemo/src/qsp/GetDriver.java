package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetDriver {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");

		// Open the Browser
		ChromeDriver driver = new ChromeDriver();
		// Enter the URL and get the
		driver.get("http://www.google.com");
		//Get the title of the page& print it 
		String title = driver.getTitle();
		System.out.println(title);
		// Get the URL present in address bar&print it
		String url = driver.getCurrentUrl();
		System.out.println(url);
		// GET HTML code of the Webpage & print it
		String s = driver.getPageSource();
		System.out.println(s);
		// Close the brower
		driver.close();
	}
}
