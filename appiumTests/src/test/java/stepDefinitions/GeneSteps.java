package stepDefinitions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.AppiumCalcPage;
import pages.GeneSignupPage;

public class GeneSteps {
	
	static AppiumDriver driver;

@Given("I Open the Gene App")
public void i_open_the_gene_app() throws MalformedURLException {
	
	DesiredCapabilities cap = new DesiredCapabilities();

	cap.setCapability("deviceName", "Ajith's M33");
	cap.setCapability("udid", "RFCT60GYCNF");
	//cap.setCapability("udid", "192.168.1.17:5555");
	cap.setCapability("platformName", "Android");
	cap.setCapability("platfromVersion", "13");

	cap.setCapability("appPackage", "com.genedrive");
	cap.setCapability("appActivity", "com.genedrive.startup.StartupActivity");

	URL url = new URL("http://0.0.0.0:4723/wd/hub");
	driver = new AppiumDriver(url, cap);

	System.out.println("Appium started... ");
}


@When("I do some operation Gene")
public void i_do_some_operation_Gene() {
	GeneSignupPage genePage = new GeneSignupPage(driver);

	genePage.tapBtn();
	
	
	 
}


}
