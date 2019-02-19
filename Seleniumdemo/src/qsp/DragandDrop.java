package qsp;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");

		// Open the Browser
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");

		String xp1 = "//h1[text()='Block 1']";
		WebElement e1 = driver.findElement(By.xpath(xp1));

		String xp2 = "//h1[text()='Block 3']";
		WebElement e2 = driver.findElement(By.xpath(xp2));

		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		actions.dragAndDrop(e1, e2).perform();
		// actions.clickAndHold(e1).moveToElement(e2).release().perform();

	}
}