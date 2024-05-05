package task18;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookSignUp {

	public FacebookSignUp() {
		// Setting the path for the driver of the Firefox browser
		System.setProperty("webdriver.gecko.driver", "\\Users\\Mahesh\\Downloads\\Browser Exe Files\\geckodriver.exe");
	}

	public void SignUp() throws InterruptedException {
		// Create a WebDriver object and launch the facebook website
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");

		// Verify that user is redirected to Facebook Login page
		String pageTitle = "Facebook – log in or sign up";
		if (pageTitle.equals(driver.getTitle()))
			System.out.println("Welcome to Facebook Login Page");

		// Click on the create new account button
		driver.findElement(By.xpath("//form/div/a[@role='button']")).click();

		/*
		 * Enter the details as below: first name as "Test", last name as "User" Valid
		 * email address and password
		 */
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Nick");
		driver.findElement(By.name("lastname")).sendKeys("Fury");
		driver.findElement(By.name("reg_email__")).sendKeys("assignmentuser0@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("fb@Mar2024");

		/*
		 * Enter the details as below: Select date of birth from the date picker as 11
		 * May, 1985
		 */
		WebElement dayDropDown = driver.findElement(By.id("day"));
		Select select1 = new Select(dayDropDown);
		select1.selectByValue("11");

		WebElement monthDropDown = driver.findElement(By.id("month"));
		Select select2 = new Select(monthDropDown);
		select2.selectByValue("5");

		WebElement yearDropDown = driver.findElement(By.id("year"));
		Select select3 = new Select(yearDropDown);
		select3.selectByValue("1985");

		// Select Gender and click SignUp
		driver.findElement(By.cssSelector("input[value='2']")).click();
		driver.findElement(By.cssSelector("button[name='websubmit']")).click();

		/*
		 * Since Facebook restriction are not allowing for Signup and Home page
		 * navigation hence, tried the below code with personal credentials and Output
		 * screenshot is provided
		 */
		// Check is user is redirected to Home Page after successful registration
		String expectedHomeTitle = "Facebook";
		// driver.findElement(By.cssSelector("a[aria-label='Home']")).click();
		String actualHomeTitle = driver.getTitle();
		if (actualHomeTitle.equals(expectedHomeTitle)) {
			System.out.println("User is successfully registered and navigated to Home Page");
		}

	}

//	public void login() throws InterruptedException
//	{
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://www.facebook.com/");
//		// Verify that user is redirected to Facebook Login page
//		String pageTitle = "Facebook – log in or sign up";
//		if (pageTitle.equals(driver.getTitle()))
//		System.out.println("Welcome to Facebook Login Page");
//		driver.findElement(By.name("email")).sendKeys("xxx@gmail.com");
//		driver.findElement(By.name("pass")).sendKeys("xxx@yyy");
//		driver.findElement(By.name("login")).click();
//		Thread.sleep(5000);
//		String expectedHomeTitle="Facebook";
//		String actualHomeTitle = driver.getTitle();
//		if (actualHomeTitle.equals(expectedHomeTitle))
//		{
//			System.out.println("\n\nUser is successfully registered and navigated to Home Page");
//		}
//		
//		
//	}
	public static void main(String[] args) throws InterruptedException {
		FacebookSignUp fb = new FacebookSignUp();
		fb.SignUp();
		// fb.login();

	}

}
