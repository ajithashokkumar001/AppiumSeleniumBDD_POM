package stepDefinitions;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {

	WebDriver driver;

@Given("Browser is open")
public void browser_is_open() {
   
	System.out.println("Inside step - Browser is open");
	System.setProperty("webdriver.chrome.driver",
			new File(System.getProperty("user.dir"), "chromedriver.exe").getAbsolutePath());
	driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
}

@Given("User is on google search page")
public void user_is_on_google_search_page() throws InterruptedException {
	
	driver.get("https://www.google.com");
	
	Thread.sleep(2500);
	
	driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();
	
    
}

@When("User enters a text in search box")
public void user_enters_a_text_in_search_box() {
	
	driver.findElement(By.name("q")).sendKeys("Ajith Ashokkumar");
    
}

@When("Hits Enter")
public void hits_enter() {
	
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	System.out.println("Success");

   
}

@Then("User is navigated to the search results page")
public void user_is_navigated_to_the_search_results_page() {
    
	driver.getPageSource().contains("ajith.ashokkumar");
	
	driver.quit();
}

}
