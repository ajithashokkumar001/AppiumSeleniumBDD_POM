package stepDefinitions;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AppiumCalcPage;


public class AppiumStepsPOM {

	static AppiumDriver driver;
	
//	public void takeScraenshotOnFailure(Scenario scenario) {
//
//		if (scenario.isFailed()) {
//
//		TakesScreenshot ts = (TakesScreenshot) driver;
//
//		byte[] src = ts.getScreenshotAs(OutputType.BYTES);
//		scenario.attach(src, "image/png", "screenshot");
//		}
//	}
	
	@Given("I Open the calculator application")
	public void i_open_the_calculator_application() throws MalformedURLException {


		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability("deviceName", "Ajith's M33");
		cap.setCapability("udid", "RFCT60GYCNF");
		//cap.setCapability("udid", "192.168.1.17:5555");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platfromVersion", "13");

		cap.setCapability("appPackage", "com.sec.android.app.popupcalculator");
		cap.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");

		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AppiumDriver(url, cap);

		System.out.println("Appium started... ");
	}

	@When("I do some operation")
	public void i_do_some_operation() {
		AppiumCalcPage calcPage = new AppiumCalcPage(driver);

		calcPage.tap2();
		calcPage.tapAdd();
		calcPage.tap3();

	}

	@Then("I validate the results")
	public void i_validate_the_results() {
		AppiumCalcPage calcPage = new AppiumCalcPage(driver);		
		calcPage.tapEqual();		
		calcPage.AssertValidate();
	}
	
	@Given("I Open the calculator application again")
	public void i_open_the_calculator_application_again() throws MalformedURLException {


		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability("deviceName", "Ajith's M33");
		cap.setCapability("udid", "RFCT60GYCNF");
		//cap.setCapability("udid", "192.168.1.17:5555");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platfromVersion", "13");

		cap.setCapability("appPackage", "com.sec.android.app.popupcalculator");
		cap.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");

		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AppiumDriver(url, cap);

		System.out.println("Appium started... ");

	}

	@When("I do some operation again")
	public void i_do_some_operation_again() {

		AppiumCalcPage calcPage = new AppiumCalcPage(driver);

		calcPage.tap2();
		calcPage.tapAdd();
		calcPage.tap3();

	}

	@When("I do some operation again User enters (.*) and (.*)$")
	public void i_do_some_operation_again_User_enters(String Num1, String Num2) {
		 
		AppiumCalcPage calcPage = new AppiumCalcPage(driver);

		 calcPage.InsertText(Num1, Num2);

	}
	
	@Then("I validate the results again")
	public void i_validate_the_results_again() {
		 
		AppiumCalcPage calcPage = new AppiumCalcPage(driver);		
		calcPage.tapEqual();		
		calcPage.AssertValidate2();

	}


}
