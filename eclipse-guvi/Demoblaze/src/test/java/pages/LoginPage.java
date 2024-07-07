package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.TestUtil;

public class LoginPage {

	private WebDriver driver;

	// Constructor used to initialize the driver & all page objects of Login Page
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "loginusername")
	WebElement login_userName;
	@FindBy(id = "loginpassword")
	WebElement login_password;
	@FindBy(css = "button[onclick='logIn()']")
	WebElement btn_login;

	public void setLoginUsername(String name) {
		TestUtil.sendKeys(driver, login_userName, name);
	}

	public void setLoginPassword(String pwd) {
		TestUtil.sendKeys(driver, login_password, pwd);
	}

	public void performLogin() {
		TestUtil.clickOn(driver, btn_login);
	}

}
