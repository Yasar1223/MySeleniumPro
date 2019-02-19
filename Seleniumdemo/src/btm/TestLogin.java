 package btm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.actitime.com");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.clickLogin();
		Thread.sleep(1000);
		loginPage.verifyErrMsg();
		Thread.sleep(1000);
		loginPage.setUserName("admin");
		Thread.sleep(1000);
		loginPage.clickLogin();
		Thread.sleep(1000);
		loginPage.verifyErrMsg();
		driver.close();
	}
}
