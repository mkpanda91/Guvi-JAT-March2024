package testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import testBase.BaseDriver;

public class TC_004_CheckFinalPriceTestAfterDeletingAnItem extends BaseDriver {

	private static Logger logger = LogManager.getLogger(TC_004_CheckFinalPriceTestAfterDeletingAnItem.class.getName());
	CartPage cp_obj;

	@Test(priority = 0)
	public void goToCart() throws Exception {
		cp_obj = new CartPage(driver);
		cp_obj.goToCart();
		Thread.sleep(5000);
	}

	@Test(priority = 1)
	public void validateDeleteItem() throws Exception {
		cp_obj = new CartPage(driver);
		cp_obj.goToCart();
		logger.info("Verifying Whether First item is deleted successfully");
		Thread.sleep(3000);
		Assert.assertTrue(cp_obj.firstItemDisplayed());
	}

	@Test(priority = 2)
	public void valiadteTotalProductPrice() throws InterruptedException {
		cp_obj = new CartPage(driver);
		cp_obj.goToCart();
		logger.info("Verifying if the Total cart price shown is equal to the sum of price of each cart item");
		Thread.sleep(3000);
		Assert.assertEquals(cp_obj.getItemsTotalPrice(), cp_obj.getTotalPrice());
	}

}
