package task21;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewWindowHandle {

	public NewWindowHandle() {
		// Set the Firefox browser path & open instance of Firefox browser
		System.setProperty("webdriver.gecko.driver", "\\Users\\Mahesh\\Downloads\\Browser Exe Files\\geckodriver.exe");
	}

	WebDriver driver = new FirefoxDriver();
	// Application url
	String url = "https://the-internet.herokuapp.com/windows";

	public void initiateBrowser() {
		// Navigate to the application Url and maximize the window
		driver.get(url);
		driver.manage().window().maximize();
	}

	public void windowHandle() {
		/*
		 * Introducing implicit wait to wait for child window to close and parent window
		 * to be navigated to
		 */
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// Storing the current first window handle
		String firstWindowHandle = driver.getWindowHandle();
		// Click the required button to open a new window
		driver.findElement(By.linkText("Click Here")).click();
		/*
		 * Store all the window handles in a set and iterating by a iterator to navigate
		 * to the new window, verify the text on new window and close the new window
		 */
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> I1 = windowHandles.iterator();
		while (I1.hasNext()) {
			String newWindowHandle = I1.next();
			if (!firstWindowHandle.equals(newWindowHandle)) {
				driver.switchTo().window(newWindowHandle);
				String newWindowText = driver.findElement(By.cssSelector("div[class='example'] h3")).getText();
				if (newWindowText.equals("New Window"))
					System.out.println("New Window text is present on the page");
				driver.close();
			}
		}
		/*
		 * Navigating to the original window Check if the original window is active and
		 * close the browser instance
		 */
		driver.switchTo().window(firstWindowHandle);
		String currentUrl = driver.getCurrentUrl();
		if (currentUrl.equals(url))
			System.out.println("\nOriginal Window is active");
		driver.close();
	}

	public static void main(String[] args) {
		NewWindowHandle obj = new NewWindowHandle();
		obj.initiateBrowser();
		obj.windowHandle();
	}
}
