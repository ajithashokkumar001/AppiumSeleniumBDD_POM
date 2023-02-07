//package stepDefinitions;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//import io.appium.java_client.AppiumDriver;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//
//public class AppiumSteps {
//
//	static AppiumDriver driver;
//
//	@Given("I Open the calculator application")
//	public void i_open_the_calculator_application() throws MalformedURLException {
//
//
//		DesiredCapabilities cap = new DesiredCapabilities();
//
//		cap.setCapability("deviceName", "Ajith's M33");
//		cap.setCapability("udid", "RFCT60GYCNF");
//		cap.setCapability("platformName", "Android");
//		cap.setCapability("platfromVersion", "13");
//
//		cap.setCapability("appPackage", "com.sec.android.app.popupcalculator");
//		cap.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
//
//		URL url = new URL("http://0.0.0.0:4723/wd/hub");
//		driver = new AppiumDriver(url, cap);
//
//		System.out.println("Appium started... ");
//		// log(Status, details)
//
//
//	}
//
//	@When("I do some operation")
//	public void i_do_some_operation() {
//
//		driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_03")).click();
//		driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_add")).click();
//		driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_02")).click();
//
//	}
//
//	@Then("I validate the results")
//	public void i_validate_the_results() {
//		 
//		driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_equal")).click();
//		WebElement result= (WebElement) driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_edt_formula"));
//		Assert.assertEquals(result.getText(), "9");
//
//	}
//	
//	@Given("I Open the calculator application again")
//	public void i_open_the_calculator_application_again() throws MalformedURLException {
//
//
//		DesiredCapabilities cap = new DesiredCapabilities();
//
//		cap.setCapability("deviceName", "Ajith's M33");
//		cap.setCapability("udid", "RFCT60GYCNF");
//		cap.setCapability("platformName", "Android");
//		cap.setCapability("platfromVersion", "13");
//
//		cap.setCapability("appPackage", "com.sec.android.app.popupcalculator");
//		cap.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
//
//		URL url = new URL("http://0.0.0.0:4723/wd/hub");
//		driver = new AppiumDriver(url, cap);
//
//		System.out.println("Appium started... ");
//		// log(Status, details)
//
//
//	}
//
//	@When("I do some operation again")
//	public void i_do_some_operation_again() {
//
//		driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_03")).click();
//		driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_add")).click();
//		driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_02")).click();
//
//	}
//
//	@Then("I validate the results again")
//	public void i_validate_the_results_again() {
//		 
//		driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_equal")).click();
//		WebElement result= (WebElement) driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_edt_formula"));
//		Assert.assertEquals(result.getText(), "5");
//
//	}
//
//
//}
