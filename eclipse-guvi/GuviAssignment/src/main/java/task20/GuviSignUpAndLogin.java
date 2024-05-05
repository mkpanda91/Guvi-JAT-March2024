package task20;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuviSignUpAndLogin {

	WebDriver driver = new ChromeDriver();
	String url = "https://www.guvi.in/";

	public GuviSignUpAndLogin() {
		System.setProperty("webdriver.chrome.driver",
				"\\Users\\Mahesh\\Downloads\\Browser Exe Files\\chromedriver.exe");
	}

	public void SignUp() throws InterruptedException {
		// Launches the chrome browser, navigates to the url and maximizes the window
		driver.get(url);
		driver.manage().window().maximize();

		// Navigating to the Registration page and performing registration
		driver.findElement(By.xpath("//div[@id='accountGroup']//ul//following::li[1]")).click();
		driver.findElement(By.id("name")).sendKeys("Assignment User");
		driver.findElement(By.id("email")).sendKeys("uakuj70zgj@elatter.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,360)", "");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("password")).sendKeys("Guvi@2024");
		driver.findElement(By.id("mobileNumber")).sendKeys("7077996564");
		driver.findElement(By.id("signup-btn")).click();
		driver.findElement(By.cssSelector("#laterBtn")).click();

		// Verify if user is registered successfully
		String textPostLogin = driver.findElement(By.cssSelector("div.left-head > h1")).getText();
		String expectedText = "Almost Done! Check Your Inbox!";
		if (textPostLogin.equals(expectedText))
			System.out.println("User is registered successfully");
	}

	public void Login() {
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@id='accountGroup']//ul//li")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,360)", "");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("email")).sendKeys("uakuj70zgj@elatter.com");
		driver.findElement(By.id("password")).sendKeys("Guvi@2024");
		driver.findElement(By.cssSelector("a#login-btn")).click();
	}

	public static void main(String[] args) throws InterruptedException {
		GuviSignUpAndLogin sl = new GuviSignUpAndLogin();
		sl.SignUp();
		sl.Login();
	}

}
