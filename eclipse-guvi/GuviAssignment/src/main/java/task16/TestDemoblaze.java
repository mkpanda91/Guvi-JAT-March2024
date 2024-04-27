package task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDemoblaze {

	public TestDemoblaze() {
		// Variable declared and initialized to store the path of Chrome driver
		String driverPath = "C:\\Users\\Mahesh\\Downloads\\Browser Exe Files\\chromedriver.exe";

		// Setting the path for the driver of the Chrome browser
		System.setProperty("webdriver.chrome.driver", driverPath);
	}

	public void launchAndCheckTitle() {
		// Application Url under test
		String url = "https://www.demoblaze.com/";
		// Variable storing expected title of the page
		String expectedTitle = "STORE";
		// Instantiating the driver of Chrome browser
		WebDriver driver = new ChromeDriver();
		// Maximizing the window
		driver.manage().window().maximize();
		// Launching the application with the help of WebDriver object
		driver.get(url);
		// Fetch and store the title of the page
		String actualTitle = driver.getTitle();
		// Verifies the title of the page
		if (actualTitle.equals(expectedTitle))
			System.out.println("Page landed on correct website");
		else
			System.out.println("Page not landed on correct website");
	}

	public static void main(String[] args) {
		TestDemoblaze tbz = new TestDemoblaze();
		tbz.launchAndCheckTitle();
	}

}
