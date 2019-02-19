package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpcastinggetTitle {
	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void myTest() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String Title = driver.getTitle();
		System.out.println(Title);
	}

	public static void main(String[] args) {
		UpcastinggetTitle.myTest();
	}
}
