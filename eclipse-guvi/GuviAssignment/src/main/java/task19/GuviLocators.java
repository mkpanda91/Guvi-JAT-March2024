package task19;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuviLocators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"\\Users\\Mahesh\\Downloads\\Browser Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guvi.in/register/");
		driver.manage().window().maximize();

		Thread.sleep(4000);

		// Locator technique for the clickable "Guvi name & Image"
		// driver.findElement(By.cssSelector("img[src='/web-build/images/guvi-logo.8eeef9e2027d374479531095b012a87e.svg']")).click();
		// driver.findElement(By.cssSelector("a>img")).click();
		// driver.findElement(By.xpath("//a[@class='logo']//img")).click();
		// driver.findElement(By.xpath("//a[contains(@href,'/')]")).click();

		// Locator technique for the "Login" link
		// driver.findElement(By.className("login")).click();
		// driver.findElement(By.cssSelector(".login")).click();
		// driver.findElement(By.linkText("Login")).click();
		// driver.findElement(By.xpath("//div/p/child::a")).click();

		// Locator technique for the "Signup with Google" button
		// driver.findElement(By.id("buttonDiv")).click();
		// driver.findElement(By.cssSelector("div#buttonDiv")).click();
		// driver.findElement(By.cssSelector("div[id='buttonDiv']")).click();
		// driver.findElement(By.xpath("//div[@id='buttonDiv']")).click();

		// Locator technique for the "Full Name" field
		// driver.findElement(By.id("name")).sendKeys("Mahesh Panda");
		// driver.findElement(By.cssSelector("input#name")).sendKeys("Mahesh Panda");
		// driver.findElement(By.cssSelector("input[id='name']")).sendKeys("Mahesh
		// Panda");
		// driver.findElement(By.tagName("input")).sendKeys("Mahesh Panda");
		// driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Mahesh Panda");

		// Locator technique for the "Email" field
		// driver.findElement(By.id("email")).sendKeys("assignmentuser0@gmail.com");
		// driver.findElement(By.cssSelector("input#email")).sendKeys("assignmentuser0@gmail.com");
		// driver.findElement(By.cssSelector("input[id='email']")).sendKeys("assignmentuser0@gmail.com");
		// driver.findElement(By.cssSelector("input[type='email']")).sendKeys("assignmentuser0@gmail.com");
		// driver.findElement(By.xpath("//input[@id='email']")).sendKeys("assignmentuser0@gmail.com");
		// driver.findElement(By.xpath("//input[@type='email']")).sendKeys("assignmentuser0@gmail.com");

		// To perform Scroll on application using Selenium
		// NOTE: Below js executor is to be enabled & used for Password, Mobile number &
		// Sign Up fields
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");

		// Locator technique for the "Password" field
		// driver.findElement(By.id("password")).sendKeys("Pa$$word1");
		// driver.findElement(By.cssSelector("input#password")).sendKeys("Pa$$word1");
		// driver.findElement(By.cssSelector("input[id='password']")).sendKeys("Pa$$word1");
		// driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Pa$$word1");
		// driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Pa$$word1");
		// driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Pa$$word1");

		// Locator technique for the "Mobile Number" field
		// driver.findElement(By.id("mobileNumber")).sendKeys("9988776655");
		// driver.findElement(By.cssSelector("input#mobileNumber")).sendKeys("9988776655");
		// driver.findElement(By.cssSelector("input[id='mobileNumber']")).sendKeys("9988776655");
		// driver.findElement(By.cssSelector(".form-control.countrycode-left")).sendKeys("9988776655");
		// driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("9988776655");

		// Locator technique for the "Sign Up" field
		// driver.findElement(By.id("signup-btn")).click();
		// driver.findElement(By.cssSelector("a#signup-btn")).click();
		// driver.findElement(By.cssSelector("a[id='signup-btn']")).click();
		// driver.findElement(By.xpath("//a[@id='signup-btn']")).click();
		// driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
		// driver.findElement(By.partialLinkText("Sign")).click();
		// driver.findElement(By.linkText("Sign Up")).click();
	}

}
