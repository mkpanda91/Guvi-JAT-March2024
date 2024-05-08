package task21;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NestedFrames {

	public NestedFrames() {
		// Set the Firefox browser path & open instance of Firefox browser
		System.setProperty("webdriver.gecko.driver", "\\Users\\Mahesh\\Downloads\\Browser Exe Files\\geckodriver.exe");
	}

	WebDriver driver = new FirefoxDriver();
	// Application url
	String url = "http://the-internet.herokuapp.com/nested_frames";

	public void initiateBrowser() {
		// Navigate to the application Url and maximize the window
		driver.get(url);
		driver.manage().window().maximize();
	}

	public void nestedFrameTraversing() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Finding Number of Frames in the TOP FRAME
		WebElement topFrame = driver.findElement(By.cssSelector("frame[name=frame-top]"));
		driver.switchTo().frame(topFrame);
		List<WebElement> numberOfFrames = driver.findElements(By.xpath("//frame"));
		if (numberOfFrames.size() == 3)
			System.out.println("There are 3 frames on the page");

		// Declaring JavaScript object to fetch Text of the required frames
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Navigating to LEFT FRAME, verifying it Text and going back to TOP FRAME
		WebElement leftFrame = driver.findElement(By.xpath("//frameset[@name='frameset-middle']//child::frame[1]"));
		driver.switchTo().frame(leftFrame);
		String leftFrameText = js.executeScript("return document.body.innerText").toString();
		if (leftFrameText.equals("LEFT"))
			System.out.println("\nLeft Frame has a text: " + leftFrameText);
		driver.switchTo().parentFrame();

		// Navigating to MIDDLE FRAME, verifying it Text and going back to TOP FRAME
		WebElement middleFrame = driver.findElement(By.xpath("//frameset[@name='frameset-middle']//child::frame[2]"));
		driver.switchTo().frame(middleFrame);
		String middleFrameText = js.executeScript("return document.body.innerText").toString();
		if (middleFrameText.equals("MIDDLE"))
			System.out.println("Middle Frame has a text: " + middleFrameText);
		driver.switchTo().parentFrame();

		// Navigating to RIGHT FRAME, verifying it Text and going back to TOP FRAME
		WebElement rightFrame = driver.findElement(By.xpath("//frameset[@name='frameset-middle']//child::frame[3]"));
		driver.switchTo().frame(rightFrame);
		String rightFrameText = js.executeScript("return document.body.innerText").toString();
		if (rightFrameText.equals("RIGHT"))
			System.out.println("Right Frame has a text: " + rightFrameText);
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();

		// Navigating to BOTTOM FRAME, verifying it Text and going back to TOP FRAME
		WebElement bottomFrame = driver.findElement(By.cssSelector("frame[name=frame-bottom]"));
		driver.switchTo().frame(bottomFrame);
		String bottomFrameText = js.executeScript("return document.body.innerText").toString();
		if (bottomFrameText.equals("BOTTOM"))
			System.out.println("\nBottom Frame has a text: " + bottomFrameText);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(topFrame);

		// Verify TOP FRAME url to see if user navigated correctly
		String pageUrl = driver.getCurrentUrl();
		if (pageUrl.equals(url))
			System.out.println("\nUser is navigated back correctly");
	}

	public static void main(String[] args) {
		NestedFrames obj = new NestedFrames();
		obj.initiateBrowser();
		obj.nestedFrameTraversing();
	}

}
