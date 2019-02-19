package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EncapsulationTestLogin {
	static {
		System.setProperty("websriver.chrome.driver", "./driver/chromedriver.exe");

	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https);//demo.actitime.com/login.do");
		EncapsulationLoginPage loginPage = new EncapsulationLoginPage(driver);
		loginPage.setUserName("admin");
		loginPage.setPassword("manger");
		loginPage.clickLogin();

	}
}
