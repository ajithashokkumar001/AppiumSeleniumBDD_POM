package pages;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class AppiumCalcPage {

	AppiumDriver driver;

	By keypad_3 = By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_03");
	By keypad_2 = By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_02");
	By keypad_add = By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_add");
	By keypad_equal = By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_equal");
	By validate = By.id("com.sec.android.app.popupcalculator:id/calc_edt_formula");
	
	By calc_textScreen = By.id("com.sec.android.app.popupcalculator:id/calc_edt_formula");

	public AppiumCalcPage(AppiumDriver driver) {

		this.driver = driver;
	}

//	public void desiredCapabilities(AppiumDriver driver) throws MalformedURLException {
//		
//
//		DesiredCapabilities cap = new DesiredCapabilities();
//
//		cap.setCapability("deviceName", "Ajith's M33");
//		//cap.setCapability("udid", "RFCT60GYCNF");
//		cap.setCapability("udid", "192.168.1.17:5555");
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
//	}
	
	public void tap3() {

		driver.findElement(keypad_3).click();
	}

	public void tap2() {

		driver.findElement(keypad_2).click();
	}

	public void tapAdd() {

		driver.findElement(keypad_add).click();
	}

	public void tapEqual() {

		driver.findElement(keypad_equal).click();
	}

	public void AssertValidate() {

		WebElement result= (WebElement) driver.findElement(validate);
		Assert.assertEquals(result.getText(), "9");
	}

	public void AssertValidate2() {

		WebElement result= (WebElement) driver.findElement(validate);
		Assert.assertEquals(result.getText(), "11");
	}
	
	public void InsertText(String Num1, String Num2) {
		
		WebElement insert = (WebElement) driver.findElement(calc_textScreen);
		insert.sendKeys(Num1);
		insert.sendKeys(Num2);
	}
	
}
