package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.TestUtil;

public class ProductInfoPage {

	private WebDriver driver;

	// Constructor used to initialize the driver & all page objects of Product Info Page
	public ProductInfoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Add to cart']")
	WebElement addToCartBtn;

	public void clickOnaddToCartBtn() {
		TestUtil.JSClick(driver, addToCartBtn);
}

}
