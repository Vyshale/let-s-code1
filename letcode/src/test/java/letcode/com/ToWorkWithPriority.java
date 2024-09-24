package letcode.com;

import org.testng.annotations.Test;

public class ToWorkWithPriority {
	
	@Test(priority = 1)
	public void signup()
	{
		System.out.println("User Registered");
	}
	
	@Test(priority = 2)
	public void signin()
	{
		System.out.println("User LoggedIn");
	}
	
	@Test(priority = 3)
	public void cart()
	{
		System.out.println("User added a product to cart");
	}
	
	@Test(priority = 4)
	public void logout()
	{
		System.out.println("User Signed Out");
	}
	
	
	
	
	

}
