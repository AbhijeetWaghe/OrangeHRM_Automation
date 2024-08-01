package com.OrangeHRM.Testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFunctionality
{
	WebDriver driver;
	@DataProvider(name="Exceldata")
	public Object [][] getData()
	{
		Object [][] arr=ExcelUtil.getSheetData("UserData");
		return arr;
	  
  }
	@Test(dataProvider = "Exceldata")
	public void readFile(String un, String psw)
	{
		System.out.println("Username: "+un+" : "+"Password: "+psw);
	}
	
	 @Test(dataProvider = "Exceldata",dataProviderClass = LoginFunctionality.class)
	  public void loginTest(String un,String psw) throws InterruptedException
	  {
		 	driver=new ChromeDriver();
	
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

			
			driver.findElement(By.name("username")).sendKeys(un);
			
			driver.findElement(By.name("password")).sendKeys(psw);
			
			
			driver.findElement(By.className("oxd-button")).click();
			Thread.sleep(10000) ;
			ScreenshotUtil.getScreenshot(driver);


			Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"Login Fail");
			
			System.out.println("Login Completed!");
	
			

	  }
	 @Test (dependsOnMethods = { "loginTest" })
	 public void logOutTest() throws InterruptedException
	 {
		 
		 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.className("oxd-userdropdown-name")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[text()='Logout']")).click();
			Assert.assertTrue(driver.getCurrentUrl().contains("auth/login"));
			
	 }
	}



