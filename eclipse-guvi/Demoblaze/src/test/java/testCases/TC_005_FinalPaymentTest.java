package testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.PaymentInfoPage;
import testBase.BaseDriver;
import utilities.TestUtil;

public class TC_005_FinalPaymentTest extends BaseDriver {

	private static Logger logger = LogManager.getLogger(TC_004_CheckFinalPriceTestAfterDeletingAnItem.class.getName());
	CartPage cp_obj;
	PaymentInfoPage pay_obj;
	Alert alert;

	@Test(priority = 0)
	public void verifyPaymentWithoutPaymentInfo() {
		cp_obj = new CartPage(driver);
		pay_obj = new PaymentInfoPage(driver);
		cp_obj.goToCart();
		pay_obj = cp_obj.goToPaymentPage();
		pay_obj.clickPurchaseBtn();
		logger.info("Verifying placing order without entering any payment details");
		String txt = TestUtil.handleAlert(driver, alert);
		Assert.assertEquals(txt, "Please fill out Name and Creditcard.");
	}

	@Test(priority = 1)
	public void verifyPaymentWithPaymentInfo() {
		cp_obj = new CartPage(driver);
		pay_obj = new PaymentInfoPage(driver);
		cp_obj.goToCart();
		pay_obj = cp_obj.goToPaymentPage();
		pay_obj.sendDetails(p.getProperty("name"), p.getProperty("country"), p.getProperty("city"),
				p.getProperty("cardNumber"), p.getProperty("cardExpMonth"), p.getProperty("cardExpYear"));
		pay_obj.clickPurchaseBtn();

		logger.info("Verifying placing order after entering all payment details");
		Assert.assertEquals(pay_obj.getSuccessMsg(), "Thank you for your purchase!");
	}
}
