package letcode.com;


import org.testng.annotations.Test;

public class ToWorkWithTimeOutThreadPoolExpectedException {
	
	//@Test(expectedExceptions = {TestNGException.class})
	@Test
	public void signup()
	{
		System.out.println("User Registered");
	}

	@Test(timeOut = 5000)
	public void signin()
	{
		System.out.println("User LoggedIn");
	}

	@Test(dependsOnMethods = "signin")
	public void cart()
	{
		System.out.println("User added a product to cart");
		throw new RuntimeException();
	}

	@Test(dependsOnMethods="cart")
	public void logout()
	{
		System.out.println("User Signed Out");
	}

}
