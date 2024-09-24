package letcode.com;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ToWorkWithInvocation {
	@Test(invocationCount = 1,invocationTimeOut = 50000)
	public void invocation() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("cricket",Keys.ENTER);
	     List<WebElement> cricket = driver.findElements(By.xpath("//*[contains(text(),'cricket') or contains(text(),'Cricket')]"));
		wait.until(ExpectedConditions.visibilityOfAllElements(cricket));
		Thread.sleep(3000);
		System.out.println(cricket.size());
		driver.quit();
	}

}
