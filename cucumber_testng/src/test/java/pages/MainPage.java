package pages;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;

public class MainPage {
	WebDriver webDriver;
	BasePage basePage = new BasePage(webDriver);
	
	@Then("I expect to see the menu")
	public void verifyMenuExists() {
		System.out.println("from mainpage verify menu exists");
	}
}
