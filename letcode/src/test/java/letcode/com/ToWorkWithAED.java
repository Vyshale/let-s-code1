package letcode.com;

import org.testng.annotations.Test;

public class ToWorkWithAED {
	
	@Test(description = "Started")
	public void signup()
	{
		System.out.println("User Registered");
	}

	@Test(enabled = false)
	public void signin()
	{
		System.out.println("User loggedin");
	}
	
	@Test()
	public void cart()
	{
		System.out.println("User Registered");
		throw new RuntimeException();
	}
	
	@Test(alwaysRun = true)
	public void logout()
	{
		System.out.println("User user signed out");
	}
	

}
