package letcode.com;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportsExample {

	public static void main(String[] args) {
	

		ExtentSparkReporter sparkReporter = new ExtentSparkReporter("./ExtentReports/execution1.html");
		ExtentReports report = new ExtentReports();
		report.attachReporter(sparkReporter);
		ExtentTest test = report.createTest("New Test Case");
		
		WebDriver driver = new ChromeDriver();
		
		test.log(Status.INFO,"Browser Launched");
		
		driver.manage().window().maximize();
		test.log(Status.INFO, "Browser Maximized");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.royalenfield.com/");
		test.log(Status.INFO, "Royal Test");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		
		test.addScreenCaptureFromBase64String(ts.getScreenshotAs(OutputType.BASE64));
		
		driver.close();
		test.log(Status.INFO,"Browser Closed");
		
		report.flush();

	}

}
