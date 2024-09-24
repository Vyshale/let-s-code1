package letcode.com;

import org.testng.annotations.Test;


public class ToWorkWithGroups {
	
	@Test(groups = {"Smoke"})
	public void signup()
	{
		System.out.println("User registered");
	}
	
	@Test(groups = {"Smoke"})
	public void signin()
	{
		System.out.println("User loggedin");
	}
	
	@Test(groups = {"Sanity"})
	public void search()
	{
		System.out.println("User is searching a product");
	}
	
	@Test(groups = {"Sanity"})
	public void cart()
	{
		System.out.println("User added a product to cart");
	}
	
	@Test(groups = {"Regression"})
	public void logout()
	{
		System.out.println("User signed off");
	}

}
