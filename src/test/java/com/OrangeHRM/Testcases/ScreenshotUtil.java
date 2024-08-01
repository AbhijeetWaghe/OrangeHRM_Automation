package com.OrangeHRM.Testcases;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.OutputType;

public class ScreenshotUtil

{
	public static void getScreenshot(WebDriver driver)
	{
	TakesScreenshot ts=(TakesScreenshot) driver;
	File temp=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\ABHIJEET WAGHE\\eclipse-workspace\\MavenSelenium\\Screenshots\\Login"+System.currentTimeMillis()+".png");
	
	try {
		FileHandler.copy(temp, dest);
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
}
