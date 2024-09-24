package letcode.com;

import java.io.IOException;

import org.bouncycastle.openssl.EncryptionException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utils.ExcelReader;


public class ToWotkWithDetailedDP {
	
	@Test(dataProvider = "loginData")
	
	public void login(String email,String pass)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/signin");
		
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@class='button is-primary'][1]")).click();
		driver.quit();
	}
	
	@DataProvider(name="loginData")
	
		public Object[][] dataSuppy() throws EncryptionException,IOException
		{
			return ExcelReader.Excel("Sheet1");
		}
}
	

