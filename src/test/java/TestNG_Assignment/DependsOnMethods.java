package TestNG_Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods 
{
	WebDriver driver;
	@Test
	public void launchSite()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/");
		Assert.assertTrue(driver.getCurrentUrl().contains("auth/login"));
		System.out.println("Launch Successfully!");
	}
	
	@Test(dependsOnMethods="launchSite")
	public void login()
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.className("oxd-button")).click();
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"Login Fail");
		System.out.println("Login Completed!");
	}
	
	@Test(dependsOnMethods="login")
	public void logout() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.className("oxd-userdropdown-name")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Assert.assertTrue(driver.getCurrentUrl().contains("auth/login"));
		System.out.println("Logout Successfully!");
	}
}
	


