package task16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestWikipedia {

	public TestWikipedia() {
		// Variable declared and initialized to store the path of Firefox driver
		String driverPath = "C:\\Users\\Mahesh\\Downloads\\Browser Exe Files\\geckodriver.exe";

		// Setting the path for the driver of the Firefox browser
		System.setProperty("webdriver.gecko.driver", driverPath);
	}

	public void wikipediaSearch() {
		// Application Url under test
		String url = "https://www.wikipedia.org/";
		// Instantiating the driver of Firefox browser
		WebDriver driver = new FirefoxDriver();
		// Launching the application with the help of WebDriver object
		driver.get(url);
		// Maximizing the window
		driver.manage().window().maximize();
		//Obtain the title after searching the keyword and navigating to History section
		driver.findElement(By.id("searchInput")).sendKeys("Artificial Intelligence");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("(//span[contains(text(),'View history')])[1]")).click();
		String pageTitle = driver.getTitle();
		System.out.println("Section title: " + pageTitle);
	}

	public static void main(String[] args) {
		TestWikipedia tw = new TestWikipedia();
		tw.wikipediaSearch();

	}

}
