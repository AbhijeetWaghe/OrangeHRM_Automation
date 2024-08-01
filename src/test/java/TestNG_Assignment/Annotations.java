package TestNG_Assignment;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations 
{
	 @Test(priority=1)
	  public void registerTest() 
	  {
		  System.out.println("This is register test");
		  
	  }
	  
	  @Test(priority=2)
	  public void loginTest() 
	  {
		  System.out.println("This is Login test");
		  
	  }
	  
	  
	  @Test(priority=3)
	  public void logoutTest() 
	  {
		  System.out.println("This is Logout test");
		  
	  }
	  
	  //Annotation
	  @BeforeMethod
	  public void bmethod()
	  {
		  System.out.println("BeforeMethod will execute before every test case");
	  }
	  
	  @AfterMethod
	  public void amethod()
	  {
		  System.out.println("AfterMethod will execute after every test case");
	  }
	  
	  
	  @BeforeClass
	  public void bclass()
	  {
		  System.out.println("BeforeClass will execute before first test case");
	  }
	  
	  
	  @AfterClass
	  public void aclass()
	  {
		  System.out.println("AfterClass will execute After last test case");
	  }
	  
	  @BeforeTest
	  public void btest()
	  {
		  System.out.println("BeforeTest will exeute before class");
		  
	  }
	  
	  
	  @AfterTest
	  public void atest()
	  {
		  System.out.println("AfterTest will exeute After class");
		  
	  }
	  
	  
	  @BeforeSuite
	  public void bsuite()
	  {
		  
		  System.out.println("Before suite will run before test");
	  }
	  
	  
	  @AfterSuite
	  public void asuite()
	  {
		  
		  System.out.println("Aftersuite will run After test");
	  }

}
