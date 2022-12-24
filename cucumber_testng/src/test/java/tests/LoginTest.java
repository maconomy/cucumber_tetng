package tests;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.LoginPage;



public class LoginTest {
	public WebDriver webDriver = null;

	@Test
	public void test1() {
		
		LoginPage loginPage = new LoginPage();
		loginPage.fromBasepage();
		
	}
	
	@DataProvider (name = "DP")
	public Object[][] dpMethod() {
		
		return new Object[][] {{"alex"},{"nat"}};
		
	}
	
	@Test (dataProvider = "DP")
	public void dp(String val) {
		System.out.println("data provider" + val);
	}
	
}
