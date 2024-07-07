package testCases;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductInfoPage;
import testBase.BaseDriver;
import utilities.TestUtil;

public class TC_003_AddToCartTest extends BaseDriver {

	HomePage hp_obj;
	ProductInfoPage phone;
	ProductInfoPage laptop;
	ProductInfoPage monitor;
	ProductInfoPage prod;
	Alert alert;
	String alertTxt;

	@Test(groups = { "AddToCartTest.addProduct" })
	public void selectPhone() throws InterruptedException {
		hp_obj = new HomePage(driver);
		phone = hp_obj.getPhone();
		phone.clickOnaddToCartBtn();
		Thread.sleep(2000);
		alertTxt = TestUtil.handleAlert(driver, alert);
		Assert.assertEquals(alertTxt, "Product added");
	}

	@Test(groups = { "AddToCartTest.addProduct" })
	public void selectLaptop() throws InterruptedException {
		hp_obj = new HomePage(driver);
		laptop = hp_obj.getLaptop();
		laptop.clickOnaddToCartBtn();
		Thread.sleep(2000);
		alertTxt = TestUtil.handleAlert(driver, alert);
		Assert.assertEquals(alertTxt, "Product added");
	}

	@Test(groups = { "AddToCartTest.addProduct" })
	public void selectMonitor() throws InterruptedException {
		hp_obj = new HomePage(driver);
		monitor = hp_obj.getMonitor();
		monitor.clickOnaddToCartBtn();
		Thread.sleep(2000);
		alertTxt = TestUtil.handleAlert(driver, alert);
		Assert.assertEquals(alertTxt, "Product added");
	}
}
