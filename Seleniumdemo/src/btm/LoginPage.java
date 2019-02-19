package btm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id = "username")
	private WebElement unTB;

	@FindBy(xpath = "//div[.='Login']")
	private WebElement loginBTN;

	@FindBy(xpath = "//span[@class='errormsg']")
	private WebElement errMsg;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void setUserName(String un) {
		unTB.sendKeys(un);
	}

	public void clickLogin() {
		loginBTN.click();
	}

	public void verifyErrMsg() {
		if (errMsg.isDisplayed()) {
			System.out.println("pass...");
		} else {
			System.out.println("fail...");
		}
	}
}