package task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestGoogle {

	public TestGoogle() {
		// Variable declared and initialized to store the path of Firefox driver
		String driverPath = "C:\\Users\\Mahesh\\Downloads\\Browser Exe Files\\geckodriver.exe";

		// Setting the path for the driver of the Firefox browser
		System.setProperty("webdriver.gecko.driver", driverPath);
	}

	public void googleOperations() {
		// Application Url under test
		String url = "https://www.google.com/";
		// Instantiating the driver of Firefox browser
		WebDriver driver = new FirefoxDriver();
		// Maximizing the window
		driver.manage().window().maximize();
		// Launching the application with the help of WebDriver object
		driver.get(url);
		// Fetch and print url of the current page
		String currentUrl = driver.getCurrentUrl();
		System.out.println("The Current Url is: " + currentUrl);
		// Refreshes the page
		driver.navigate().refresh();
		// Closes the browser
		driver.close();
	}

	public static void main(String[] args) {
		TestGoogle tg = new TestGoogle();
		tg.googleOperations();

	}

}
