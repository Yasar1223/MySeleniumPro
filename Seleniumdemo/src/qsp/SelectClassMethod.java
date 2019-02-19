package qsp;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassMethod {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");

		// Open the Browser
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/YASAR/Desktop/Setclassmethod.html");
		WebElement listBox = driver.findElement(By.id("slv"));
		Select select = new Select(listBox);

		System.out.println("IS it Multiple:" + select.isMultiple());

		List<WebElement> allOptions = select.getOptions();
		int total = allOptions.size();
		System.out.println("Total:" + total);

		for (int i = 0; i < total; i++) {
			String text = allOptions.get(i).getText();
			System.out.println(text);
		}
		
		List<WebElement> allSelected = select.getAllSelectedOptions();
		int selectedcount = allSelected.size();
		System.out.println("Selected:" + selectedcount);

		for (int i = 0; i < selectedcount; i++) {
			String text = allSelected.get(i).getText();
			System.out.println(text);
		}
		
		WebElement firstSelected = select.getFirstSelectedOption();
		System.out.println(firstSelected.getText());
		Thread.sleep(1000);
		
		select.deselectAll();
		Thread.sleep(1000);
		
	
		select.selectByIndex(0);
		Thread.sleep(1000);

		select.selectByValue("d");
		Thread.sleep(1000);

		select.selectByVisibleText("vada");
		Thread.sleep(1000);

		select.deselectByIndex(0);
		Thread.sleep(1000);
		
		select.deselectByValue("d");
		Thread.sleep(1000);
		
		select.deselectByVisibleText("vada");
		Thread.sleep(1000);
	}
	
}