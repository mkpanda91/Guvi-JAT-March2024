package task15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void searchKeyword() {
		// Setting the path of the Chrome browser driver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mahesh\\Downloads\\Browser Exe Files\\chromedriver.exe");

		// Instantiating the driver of Chrome browser
		WebDriver driver = new ChromeDriver();
		// Launching the required website
		driver.get("https://www.google.com/");
		// Maximising the browser window to fit the screen
		driver.manage().window().maximize();

		// Locating the webelement
		WebElement wb = driver.findElement(By.id("APjFqb"));
		// Sending and submitting the search keyword to begin search
		wb.sendKeys("Selenium Browser Driver");
		wb.submit();
	}

	public static void main(String[] args) {
		searchKeyword();
	}

}
