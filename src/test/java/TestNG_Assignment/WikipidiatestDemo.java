package TestNG_Assignment;

import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

public class WikipidiatestDemo
{

	@DataProvider (name = "Logindata")
	public Object[][] TestData()

{

		Object[][] data = { {"Nandini baraskan","***********" } };
		return  data;
}

	@Test(dataProvider ="Logindata")
	public void Logintest(String un,String psw)
	{
			System.out.println("username :"+un+": "+"password :"+psw);
	}
		
}