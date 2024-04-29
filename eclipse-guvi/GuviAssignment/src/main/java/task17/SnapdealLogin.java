package task17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapdealLogin {
	public static void main(String[] args) throws InterruptedException {
		// Test Data for login
		String username = "assignmentuser0@gmail.com";
		@SuppressWarnings("unused")
		String password = "snapdeal@Mar2024";
		// Application Url under test
		String url = "https://www.snapdeal.com/";
		// Variable declared and initialized to store the Chrome driver path
		String driverPath = "C:\\Users\\Mahesh\\Downloads\\Browser Exe Files\\chromedriver.exe";
		// XPath for different clicks to be performed during login
		String signInXPath = "//span[text()='Sign In']";
		String logInXPath = "//a[text()='login']";

		// Setting the path of the Chrome browser driver
		System.setProperty("webdriver.chrome.driver", driverPath);
		// Instantiating the driver of Chrome browser
		WebDriver driver = new ChromeDriver();
		// Launching the application with the help of WebDriver object
		driver.get(url);
		// Maximizing the window
		driver.manage().window().maximize();
		// Locating the elements and performing login
		driver.findElement(By.xpath(signInXPath)).click();
		driver.findElement(By.xpath(logInXPath)).click();
		Thread.sleep(2000);
		driver.switchTo().frame("loginIframe");
		driver.findElement(By.id("userName")).sendKeys(username);
		driver.findElement(By.xpath("//button[@id='checkUser']")).click();
		//Introducing Thread.sleep() to complete the manual process of entering OTP
		Thread.sleep(13000);
		driver.findElement(By.id("loginUsingOtp")).click();
		driver.navigate().refresh();
		Thread.sleep(3000);
		//Verify if user logged in and print relevant message
		driver.findElement(By.xpath("//span[text()='Mahesh']")).click();
		String stName = driver.findElement(By.xpath("//a[text()='Logout']")).getText();
		if (stName.equals("LOGOUT"))
			System.out.println("User is logged in Successfully");
		else
			System.out.println("User is not logged in");
	}
}
