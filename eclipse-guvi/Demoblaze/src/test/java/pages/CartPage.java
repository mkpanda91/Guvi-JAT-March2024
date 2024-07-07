package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.TestUtil;

public class CartPage {

	private WebDriver driver;

	// Constructor used to initialize the driver & all page objects of Cart Page
	public CartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Cart']")
	WebElement cartLink;
	@FindBy(xpath = "(//td[2])[1]")
	WebElement firstItem;
	@FindBy(xpath = "(//a[text()='Delete'])[1]")
	WebElement delete_firstItem;
	@FindBy(xpath = "//button[text()='Place Order']")
	WebElement placeOrderBtn;
	@FindBy(id = "totalp")
	WebElement totalCartPrice;

	public void goToCart()
	{
		TestUtil.clickOn(driver, cartLink);
	}
	
	public boolean firstItemDisplayed() throws Exception
	{
		String FirstitemName = firstItem.getText();
		System.out.println(FirstitemName);
		String itemToDelete = FirstitemName;
		TestUtil.JSClick(driver, delete_firstItem);
		Thread.sleep(5000);
		if (itemToDelete.equalsIgnoreCase(firstItem.getText()))
			return false;
		else return true;
	}
	
	public int getItemsTotalPrice()
	{
		List<WebElement> allItemPrice = driver.findElements(By.xpath("//td[3]"));
		int gridTotal = 0;
		for(WebElement item: allItemPrice)
		{
			gridTotal+=Integer.parseInt(item.getText());
		}
		return gridTotal;
	}
	
	public int getTotalPrice()
	{
		return Integer.parseInt(totalCartPrice.getText());	
	}
	
	public PaymentInfoPage goToPaymentPage()
	{
		TestUtil.clickOn(driver, placeOrderBtn);
		return new PaymentInfoPage(driver);
	}
}
