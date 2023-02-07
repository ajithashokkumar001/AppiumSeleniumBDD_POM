package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
	}

	public void getUrl(WebDriver driver) {

		driver.get("https://example.testproject.io/web/");
	}
}
