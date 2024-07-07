package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.TestUtil;

public class HomePage {
	
	private WebDriver driver;

	// Constructor used to initialize the driver & all page objects of Home Page
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="signin2")
	WebElement link_signUp;
	@FindBy(id="login2")
	WebElement link_login;
	@FindBy(css="a[onclick='logOut()']")
	WebElement link_logout;
	
	@FindBy(xpath = "//a[text()='Phones']")
	WebElement phones;
	@FindBy(xpath = "//a[text()='Sony xperia z5']")
	WebElement sonyMob;
	
	@FindBy(xpath = "//a[text()='Laptops']")
	WebElement laptops;
	@FindBy(xpath = "//a[text()='MacBook air']")
	WebElement macLaptop;
	
	@FindBy(xpath = "//a[text()='Monitors']")
	WebElement monitors;
	@FindBy(xpath = "//a[text()='ASUS Full HD']")
	WebElement asusDesktop ;
	
	public void clickSignUpLink()
	{
		TestUtil.clickOn(driver, link_signUp);
	}
	
	public void clickLoginLink()
	{
		TestUtil.clickOn(driver, link_login);
	}
	
	public void performLogout()
	{
		TestUtil.clickOn(driver, link_logout);
	}
	
	public ProductInfoPage getPhone()
	{
		TestUtil.clickOn(driver, phones);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", sonyMob);
		TestUtil.JSClick(driver, sonyMob);
		return new ProductInfoPage(driver);
	}
	
	public ProductInfoPage getLaptop()
	{
		TestUtil.clickOn(driver, laptops);
		TestUtil.clickOn(driver, macLaptop);		
		return new ProductInfoPage(driver);
	}
	
	
	public ProductInfoPage getMonitor()
	{
		TestUtil.clickOn(driver, monitors);
		TestUtil.clickOn(driver, asusDesktop);		
		return new ProductInfoPage(driver);
	}
	
}
