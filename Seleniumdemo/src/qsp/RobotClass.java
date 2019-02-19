package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		// Robot r=new Robot();
		// r.keyPress(KeyEvent.VK_LEFT);
		// driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//
		Set<String> v = driver.getWindowHandles();
		for (String h : v) {
			driver.switchTo().window(h);
			System.out.println(driver.getTitle());
			driver.close();
		}

	}

}
