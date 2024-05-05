package task20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PickADate {
	WebDriver driver = new ChromeDriver();
	String url = "https://jqueryui.com/datepicker/";

	public PickADate() {
		System.setProperty("webdriver.chrome.driver",
				"\\Users\\Mahesh\\Downloads\\Browser Exe Files\\chromedriver.exe");
	}

	public void datePicker() throws InterruptedException {
		// Launches the chrome browser, navigates to the url and maximizes the window
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);

		// switch to the frame containing the date picker
		driver.switchTo().frame(0);

		// Navigating to the next month and selecting the 22nd date
		driver.findElement(By.id("datepicker")).click();
		driver.findElement(By.cssSelector("a[title='Next']")).click();
		driver.findElement(By.xpath("//tbody//tr[4]//following::td[6]")).click();

		// Print the selected date on the console
		String month = driver.findElement(By.className("ui-datepicker-month")).getText();
		String year = driver.findElement(By.className("ui-datepicker-year")).getText();
		String day = driver.findElement(By.xpath("//tbody//tr[4]//following::td[6]")).getText();
		System.out.println("Selected Date is: " + day + " " + month + " " + year);

		// Closing the browser instances and the driver session
		driver.quit();

	}

	public static void main(String[] args) throws InterruptedException {
		PickADate dateSelection = new PickADate();
		dateSelection.datePicker();
	}

}
