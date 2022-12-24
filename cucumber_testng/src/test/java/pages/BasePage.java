package pages;

import org.openqa.selenium.WebDriver;

public class BasePage {
	public WebDriver webDriver;
	
	
	public BasePage(WebDriver driver) {
		this.webDriver = driver;
	}
	
	public void click() {
		System.out.println("from basepage click method");
	}
}

