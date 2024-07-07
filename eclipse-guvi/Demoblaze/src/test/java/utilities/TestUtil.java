package utilities;

import java.time.Duration;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestUtil {

	public static void explicitWait(WebDriver driver, int Seconds, WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Seconds));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}

	public static void JSClick(WebDriver driver, WebElement ele) {
		TestUtil.explicitWait(driver, 10, ele);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", ele);
	}

	public static void sendKeys(WebDriver driver, WebElement ele, String txt) {
		TestUtil.explicitWait(driver, 10, ele);
		ele.clear();
		ele.sendKeys(txt);
	}

	public static void clickOn(WebDriver driver, WebElement ele) {
		TestUtil.explicitWait(driver, 10, ele);
		ele.click();
	}

	public static String handleAlert(WebDriver driver, Alert alert) {
		String alertTxt;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			alert = driver.switchTo().alert();
			alertTxt = alert.getText();
			alert.accept();
		} catch (TimeoutException e) {
			alertTxt = "Log out";
		}
		return alertTxt;
	}

	public static String randomString() {
		String generatedString = RandomStringUtils.randomAlphabetic(8);
		return generatedString;
	}

}
