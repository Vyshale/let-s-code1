package letcode.com;
import org.testng.annotations.Test;
public class ToWorkWithDependsON {
	@Test
	public void signup()
	{
		System.out.println("User Registered");
	}

	@Test(dependsOnMethods = "signup")
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



