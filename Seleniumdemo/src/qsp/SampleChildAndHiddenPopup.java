package qsp;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleChildAndHiddenPopup {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");

		// Open the Browser
		WebDriver driver = new ChromeDriver();
		// get window handle of browser
		String parent = driver.getWindowHandle();
		// Set time out
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// goto Nakri.com
		driver.get("http://naukri.com/");
		
		// Get all window Handles; remove parent,so that we get only child WHS
		Set<String> allWHS = driver.getWindowHandles();
		allWHS.remove(parent);
		
		// close all the child browser popups
		for (String wh : allWHS) {
			driver.switchTo().window(wh);
			driver.close();
			Thread.sleep(1000);
		}
		// switch back to parent window
		driver.switchTo().window(parent);
		
		// close Hidden Division popup
		driver.findElement(By.id("allow")).click();
		
		// File upload Popup-->Upload cv
		WebElement uploadBTN = driver.findElement(By.id("input_resumeParser"));
		uploadBTN.sendKeys("d\\MyCV.docx");

	}

}
