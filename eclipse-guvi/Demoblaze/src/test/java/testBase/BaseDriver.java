package testBase;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriver {

	String current_project_dir = System.getProperty("user.dir");
	protected String path = current_project_dir + "\\src\\test\\resources\\testData\\Demoblaze_TestData.xlsx";
	protected static WebDriver driver;
	protected Properties p;
	public static ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();
	FirefoxOptions foptions;
	EdgeOptions eoptions;
	ChromeOptions coptions;

	@BeforeMethod(alwaysRun = true)
	@Parameters({ "browser" })
	public void setup(String br) {
		// loading properties file
		FileReader file;
		try {
			file = new FileReader("./src/test/resources/config.properties");
			p = new Properties();
			p.load(file);
		} catch (FileNotFoundException e) {
			System.out.println("Caught FileNotFoundException: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Caught IOException: " + e.getMessage());
		}

		// launching browser based on parameter
		switch (br.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case "headless chrome":
			coptions = new ChromeOptions();
			coptions.addArguments("--headless=new", "--start-maximized", "--disable-gpu", "--window-size=1920,1080");
			driver = new ChromeDriver(coptions);
			break;

		case "headless firefox":
			foptions = new FirefoxOptions();
			foptions.addArguments("--headless=new");
			driver = new FirefoxDriver(foptions);
			break;

		case "headless edge":
			eoptions = new EdgeOptions();
			eoptions.addArguments("--headless=new");
			driver = new EdgeDriver(eoptions);
			break;

		default:
			System.out.println("No matching browser for execution");
		}
		// generic steps for browser
		driver.manage().deleteAllCookies();
		driver.get(p.getProperty("appUrl"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		driver.close();
	}

	public String captureScreen(String tname) throws IOException {
		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);

		String targetFilePath = System.getProperty("user.dir") + "\\screenshots\\" + tname + "_" + timeStamp + ".png";
		File targetFile = new File(targetFilePath);

		sourceFile.renameTo(targetFile);
		return targetFilePath;
	}
}
