package task21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TextIntoParagraph {

	public TextIntoParagraph() {
		// Set the Firefox browser path & open instance of Firefox browser
		System.setProperty("webdriver.gecko.driver", "\\Users\\Mahesh\\Downloads\\Browser Exe Files\\geckodriver.exe");
	}

	WebDriver driver = new FirefoxDriver();
	// Application url
	String url = "https://the-internet.herokuapp.com/iframe";

	public void initiateBrowser() {
		// Navigate to the application url and maximize the window
		driver.get(url);
		driver.manage().window().maximize();
	}

	public void writeIntoParagraph() {
		// Switch to the frame with the WebElement using css locator
		WebElement frameElement = driver.findElement(By.cssSelector("iframe[id='mce_0_ifr']"));
		driver.switchTo().frame(frameElement);
		// Locate and write the desired text to the paragraph
		WebElement ele = driver.findElement(By.cssSelector("body p"));
		ele.click();
		ele.clear();
		new Actions(driver).sendKeys("Hello People").build().perform();
		// Close the browser instance
		driver.close();
	}

	public static void main(String[] args) {
		TextIntoParagraph obj = new TextIntoParagraph();
		obj.initiateBrowser();
		obj.writeIntoParagraph();
	}
}
