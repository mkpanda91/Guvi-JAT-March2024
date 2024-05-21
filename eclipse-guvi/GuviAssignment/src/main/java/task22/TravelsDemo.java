package task22;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TravelsDemo {

	public TravelsDemo() {
		// Set the path to the Chrome driver
		System.setProperty("webdriver.chrome.driver",
				"\\Users\\Mahesh\\Downloads\\Browser Exe Files\\chromedriver.exe");
	}

	// Instantiate chrome driver object
	static WebDriver driver = new ChromeDriver();

	// Application url
	String url = "https://phptravels.com/demo";

	// Variable initialized with string to check the successful form submission
	String expectedTextMessage = "Thank you!";

	// javascript executor is used for scrolling, until element is located
	JavascriptExecutor js = (JavascriptExecutor) driver;

	// WebDriverWait is used till element is visible
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	// Function1: To maximize the window and access the application Url
	public void initiateBrowser() {
		driver.manage().window().maximize();
		driver.get(url);
	}

	// Function2: To submit the form & verify is form is submitted successfully
	public void verifyFormSubmission() {
		// scrolls till Submit button is clearly visible
		WebElement submitButton = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[id='demo']")));
		js.executeScript("arguments[0].scrollIntoView();", submitButton);

		// Locators for the text fields are found and text is entered in the same
		driver.findElement(By.cssSelector("input[name='first_name']")).sendKeys("Test");
		driver.findElement(By.cssSelector("input[name='last_name']")).sendKeys("User");
		driver.findElement(By.cssSelector("input[name='business_name']")).sendKeys("Assignment user");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("cwe5xlkyli@elatter.com");

		// Below logic : To fetch elements and result is calculated
		WebElement element1 = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[id='numb1']")));
		String str1 = element1.getText();
		WebElement element2 = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[id='numb2']")));
		String str2 = element2.getText();
		int finalValue = Integer.parseInt(str1) + Integer.parseInt(str2);
		driver.findElement(By.cssSelector("input[id='number']")).sendKeys(String.valueOf(finalValue));

		// Form is submitted
		submitButton.click();

		// Below logic : To verify the form submission
		WebElement messageElement = wait
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//strong[contains(text(),'Thank you')]")));
		String actualTextMessage = messageElement.getText();
		if (expectedTextMessage.equals(actualTextMessage))
			System.out.println("Form is submitted successfully");
	}

	// Function3: To Take screenshot
	public void TakeScreenshot() throws IOException {
		// TakesScreenshot method captures screenshot
		TakesScreenshot takeScreenShot = ((TakesScreenshot) driver);
		File source = takeScreenShot.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				"C:\\Users\\Mahesh\\Downloads\\Guvi\\Guvi_Java-Assignments\\eclipse-guvi\\GuviAssignment\\src\\main\\java\\task22\\Task22_Screenshot.png");
		// Save screenshot to desired location
		FileUtils.copyFile(source, destination);
		System.out.println("Screenshot is captured and saved successfully");
	}

	// Function4: To Quit the browser instances
	public void quitBrowser() {
		driver.quit();
	}

	public static void main(String[] args) {
		TravelsDemo td = new TravelsDemo();
		td.initiateBrowser();
		td.verifyFormSubmission();
		try {
			td.TakeScreenshot();
		} catch (IOException e) {
			e.printStackTrace();
		}
		td.quitBrowser();
	}
}
