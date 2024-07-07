package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.TestUtil;

public class PaymentInfoPage {

	private WebDriver driver;

	// Constructor used to initialize the driver & all page objects of Cart Page
	public PaymentInfoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "name")
	WebElement name;
	@FindBy(id = "country")
	WebElement country;
	@FindBy(id = "city")
	WebElement city;
	@FindBy(id = "card")
	WebElement creditCard;
	@FindBy(id = "month")
	WebElement expMonth;
	@FindBy(id = "year")
	WebElement expYear;
	@FindBy(xpath = "//button[text()='Purchase']")
	WebElement purchaseBtn;

	public void sendDetails(String payerName, String payerCountry, String payertCity, String ccNum, String expMon,
			String expYr) {
		TestUtil.sendKeys(driver, name, payerName);
		TestUtil.sendKeys(driver, country, payerCountry);
		TestUtil.sendKeys(driver, city, payertCity);
		TestUtil.sendKeys(driver, creditCard, ccNum);
		TestUtil.sendKeys(driver, expMonth, expMon);
		TestUtil.sendKeys(driver, expYear, expYr);
	}

	public void clickPurchaseBtn() {
		TestUtil.JSClick(driver, purchaseBtn);
	}

	public String getSuccessMsg() {
		String msg = driver.findElement(By.xpath("//h2[text()='Thank you for your purchase!']")).getText();
		return msg;
	}
}
