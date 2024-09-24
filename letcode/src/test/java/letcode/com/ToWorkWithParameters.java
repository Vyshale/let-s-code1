package letcode.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ToWorkWithParameters {
	
	WebDriver driver = new ChromeDriver();
	@Parameters({"emailId","password"})
	@Test
	
	void login(String email,String pass)
	{
	driver.get("https://letcode.in/signin");
	driver.findElement(By.name("email")).sendKeys(email);
	driver.findElement(By.name("password")).sendKeys(pass);
	driver.findElement(By.xpath("//button[@class='button is-primary'][1]")).click();
	driver.quit();
	
	}

}
