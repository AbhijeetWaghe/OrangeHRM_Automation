package TestNG_Assignment;


import java.time. Duration;


import org.openqa.selenium.By;
import org.openqa.selenium. WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations. Test;


 public class WikipidiasiteusingDataDriven
 {
	 @Test (dataProvider="Logindata")
	
	 public void LoginData (String un, String psw)
	 {
		 
		 WebDriver driver = new ChromeDriver();

		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds (10));//globle wait

		 driver.get("https://en.wikipedia.org/w/index.php?title=Special Userlogin&return to Main Page");

				 driver.findElement(By.id("upliare1")).sendKeys(un);

				 driver.findElement(By.id("wploginAttempt")).click();

				 Assert.assertTrue(driver.getCurrentUrl().contains("Main Page"), "Login failed");

				 System.out.println("Login completed");
				 
	 }
 }