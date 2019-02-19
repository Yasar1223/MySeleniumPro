package qsp;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");

		// Open the Browser
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///D:/java_class/ButtonAlertpopup.html");
		//driver.findElement(By.id("call")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(1000);
		//alert.accept();

		//driver.findElement(By.id("delete")).click();
		//Alert alert2 = driver.switchTo().alert();
		//System.out.println(alert2.getText());
		//Thread.sleep(1000);
		alert.dismiss();

	}
}

