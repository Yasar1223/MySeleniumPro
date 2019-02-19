package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.corba.se.spi.orbutil.fsm.Input;

public class LocatorExampleGoogle {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/");
		Thread.sleep(1000);
		//driver.findElement(By.id("login-username")).sendKeys("gmail");
//		//driver.findElement(By.className("phone-no ")).sendKeys("gmail");
//		driver.findElement(By.name("username")).sendKeys("gmail");
//		//driver.findElement(By.tagName("a"));
//	
//		driver.findElement(By.linkText("Help")).click();
//		driver.navigate().back();
//		driver.findElement(By.partialLinkText("He")).click();
//		//driver.findElement(By.cssSelector(Input[name='signin']));
		driver.findElement(By.xpath("//a[.='Help'])")).click();
		
		
	}
}
