package stepDefinitions;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AppiumCalcPage;
import pages.LoginPage;

public class LoginSteps {

	WebDriver driver;

	@Given("User is on login page")
	public void user_is_on_login_page() {

		
		LoginPage LogPag = new LoginPage(driver);

		System.out.println("Reached Given");
		System.setProperty("webdriver.chrome.driver",
				new File(System.getProperty("user.dir"), "chromedriver.exe").getAbsolutePath());
		driver = new ChromeDriver();
		
		LogPag.getUrl(driver);
		//driver.get("https://example.testproject.io/web/");
	}

	@When("User enters (.*) and (.*)$")
	public void user_enters_username_and_password(String Username, String Password) throws InterruptedException {
		System.out.println("Reached When");
		Thread.sleep(5000);
		driver.findElement(By.id("name")).sendKeys(Username);
		Thread.sleep(5000);
		driver.findElement(By.id("password")).sendKeys(Password);
		Thread.sleep(5000);
	}

	@When("Clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("Reached When Again");
		driver.findElement(By.id("login")).click();
	}

	@Then("User is navigated to the Home Page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("Reached Then");
		if (driver.findElement(By.id("save")).isDisplayed()) {
			System.out.println("Successfully submitted the login");
		} else {
			System.out.println("Not reached the login page");
		}
		driver.quit();
	}

}
