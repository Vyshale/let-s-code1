package LearnAnnotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGFlow {
  @Test
  public void test() {
	  System.out.println("Test Case Started");
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("Method is about to start");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("Method executed");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Class is about to start");  
	  
  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println("Class executed");  
  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("Test is about to start");  
  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("Executed Test");  
  }

  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println("I am first");  
  }

  @AfterSuite
  public void afterSuite() {
	  
	  System.out.println("I am Last");  
  }

}
