package letcode.com;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class ToWorkWithDragAndDrop {
@Test
	public void dragAndDrop() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropable");
		WebElement source1 =driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		Actions builder = new Actions(driver);
		builder.dragAndDrop(source1, target).perform();
		Thread.sleep(3000);
		driver.quit();
		
	//	driver.get("https://play.letcode.in/aui");

	}

}
