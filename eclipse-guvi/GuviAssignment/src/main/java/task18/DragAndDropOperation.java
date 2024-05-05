package task18;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DragAndDropOperation {

	public DragAndDropOperation() {
		// Setting the path of the Firefox driver
		System.setProperty("webdriver.gecko.driver", "\\Users\\Mahesh\\Downloads\\Browser Exe Files\\geckodriver.exe");
	}

	// Creating webdriver object & storing the application url in a String variable
	WebDriver driver = new FirefoxDriver();
	String url = "https://jqueryui.com/droppable/";

	public void dragAndDrop() {
		// Launching the application and performing drag and drop
		driver.get(url);
		// Switching to an iframe
		WebElement frameElement = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frameElement);

		// Find the drag and drop elements and performing the action
		WebElement fromElement = driver.findElement(By.id("draggable"));
		WebElement toElement = driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		action.dragAndDrop(fromElement, toElement).build().perform();

		// Check color property of the target element's CSS
		String expectedBackgroundColor = "rgb(255, 250, 144)";
		WebElement afterDropped = driver.findElement(By.id("droppable"));
		String actualBackgroundColor = afterDropped.getCssValue("background-color");
		if (actualBackgroundColor.equals(expectedBackgroundColor))
			System.out.println("Drag and Drop operation is Successful");

		// Verify the text of the Target element after Drag and Drop operation
		String afterDroppedText = afterDropped.getText();
		System.out.println("\nText of the Target element after the drop: " + afterDroppedText);
		if (afterDroppedText.equals("Dropped!"))
			System.out.println("Text of the Target element is successfully changed after the drop");
	}

	public static void main(String[] args) {
		DragAndDropOperation dd = new DragAndDropOperation();
		dd.dragAndDrop();
	}
}
