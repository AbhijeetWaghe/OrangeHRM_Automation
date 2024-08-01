package TestNG_Assignment;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Methods 
{
		@Test(priority=1)
		public void registertest()
		{
			System.out.println("this is register test");
			
		}
		@Test(priority=2)
		public void logintest()
		{
			System.out.println("This is login test");
		}
		@Test(priority=3)	
		public void logouttest()
		{
			System.out.println("This is logot test");
			
		}
		@BeforeMethod
		public void BMethod()
		{
			System.out.println("Before method will execute before every test case");
		}
		@AfterMethod()
		public void AMethod()
		{
			System.out.println("After method will execute after every test case");
		}
}
