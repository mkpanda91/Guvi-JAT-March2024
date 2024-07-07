package testCases;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import testBase.BaseDriver;
import utilities.TestUtil;

public class TC_002_LoginTest extends BaseDriver {

	HomePage hp_obj;
	LoginPage login_obj;
	Alert alert;

	@Test(dataProvider = "LoginData", dataProviderClass = utilities.DataProviders.class)
	public void userLogin(String un, String pwd) {

		// Home Page Interactions
		hp_obj = new HomePage(driver);
		hp_obj.clickLoginLink();
		// Login Page Interactions
		login_obj = new LoginPage(driver);
		login_obj.setLoginUsername(un);
		login_obj.setLoginPassword(pwd);
		login_obj.performLogin();

		String txt = TestUtil.handleAlert(driver, alert);

		if (txt.equalsIgnoreCase("User does not exist.") || txt.equalsIgnoreCase("Wrong password.")
				|| txt.equalsIgnoreCase("Please fill out Username and Password.") || txt.equalsIgnoreCase("Log out"))
			Assert.assertTrue(true);
		else {
			Assert.assertTrue(false);
		}
	}

}
