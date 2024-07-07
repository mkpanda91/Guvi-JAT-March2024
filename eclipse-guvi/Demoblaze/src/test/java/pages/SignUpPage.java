package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.TestUtil;

public class SignUpPage {
	
	private WebDriver driver;

	// Constructor used to initialize the driver & all page objects of SignUp Page
	public SignUpPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="sign-username")
	WebElement signup_userName;
	@FindBy(id="sign-password")
	WebElement signup_password;
	@FindBy(css="button[onclick='register()']")
	WebElement btn_signUp;
	
	public void setSignUpUsername(String name)
	{
		TestUtil.sendKeys (driver,signup_userName,name);
	}
	
	public void setSignUpPassword(String pwd)
	{
		TestUtil.sendKeys (driver,signup_password,pwd);
	}
	
	public void performSignUp()
	{
		TestUtil.clickOn(driver, btn_signUp);
	}

}
