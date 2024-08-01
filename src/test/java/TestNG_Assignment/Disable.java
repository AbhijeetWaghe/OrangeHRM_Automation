package TestNG_Assignment;

import org.testng.annotations.Test;

public class Disable 
{
	@Test(priority=1,description="This is Functional test")
	  public void registerTest() 
	  {
		  System.out.println("This is Register Process");
	  }
	  
	  
	  @Test(priority=2,description="This is Functional test")
	  public void loginTest() 
	  {
		  System.out.println("This is Login Process");
	  }
	  
	  @Test(priority=3)
	  public void searchTest() 
	  {
		  System.out.println("This is search Product Process");
	  }
	  
	 @Test(priority=4,enabled=false)
	  public void addToCartTest() 
	  {
		  System.out.println("This is Add to cart Process");
	  }
	  
}



