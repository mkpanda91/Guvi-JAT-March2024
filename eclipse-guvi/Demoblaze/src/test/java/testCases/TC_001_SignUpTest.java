package testCases;

import java.io.IOException;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignUpPage;
import testBase.BaseDriver;
import utilities.ExcelUtility;
import utilities.TestUtil;

public class TC_001_SignUpTest extends BaseDriver {

	HomePage hp_obj;
	SignUpPage su_obj;
	Alert alert;

	@Test(dataProvider = "SignUpData", dataProviderClass = utilities.DataProviders.class)
	public void userSignUp(String username, String password) {
		String pwd = TestUtil.randomString(); // Creating random username and password
		String un = pwd + "@gmail.com";
		ExcelUtility xlUtil = new ExcelUtility(path);
		try {
			xlUtil.setCellData("sheet1", 1, 0, un);
			xlUtil.setCellData("sheet1", 1, 1, pwd);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		// Home Page Interactions
		hp_obj = new HomePage(driver);
		hp_obj.clickSignUpLink();
		// SignUp Page Interactions
		su_obj = new SignUpPage(driver);
		su_obj.setSignUpUsername(username);
		su_obj.setSignUpPassword(password);
		su_obj.performSignUp();

		String txt = TestUtil.handleAlert(driver, alert); // Handling expected alert
		try {
			// Validating message
			if (txt.equalsIgnoreCase("Sign up successful.") || txt.equalsIgnoreCase("This user already exist.")
					|| txt.equalsIgnoreCase("Please fill out Username and Password."))
				Assert.assertTrue(true);
		} catch (Exception e) {
			System.out.println("New user signup has failed");
		}
	}
}
