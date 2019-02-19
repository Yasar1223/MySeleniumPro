package qsp;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SampleListBox {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");

		// Open the Browser
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com/");
		WebElement listBox = driver.findElement(By.id("month"));
		Select select = new Select(listBox);
		Thread.sleep(1000);
		select.selectByIndex(0);
		Thread.sleep(1000);
		select.selectByValue("1");
		Thread.sleep(1000);
		select.selectByVisibleText("Feb");
		System.out.println(select.isMultiple());
		List<WebElement> allOptions = select.getOptions();
		int count =allOptions.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			
			String text = allOptions.get(i).getText();
			System.out.println(text);
		}

	}
}