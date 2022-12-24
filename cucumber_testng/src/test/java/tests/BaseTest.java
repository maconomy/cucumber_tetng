package tests;

import java.time.LocalDateTime;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BaseTest {
	public WebDriver webDriver = null;
	@Given(value = "I want to open browser")
	@BeforeTest
	public void Before() {

		System.out.println("========beforetest========");
		
		LocalDateTime DT = LocalDateTime.now();
		System.setProperty("cucumber.plugin=", "json:target/cucumber" + DT + ".json");
		System.out.println("beforecucumberplugin");
		
		}
		
	
	@Then(value = "Close browser")
	@AfterTest
	public void After() {
		System.out.println("after test: close browser");

	}
}

