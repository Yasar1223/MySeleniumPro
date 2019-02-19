
package qsp;

import java.io.IOException;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");

		// Open the Browser
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");

		TakesScreenshot t = (TakesScreenshot) driver;
		File srcFile = t.getScreenshotAs(OutputType.FILE);

		File destFile = new File("./Photo/google.png");
		FileUtils.copyFile(srcFile, destFile);

		driver.close();
	}
}
 