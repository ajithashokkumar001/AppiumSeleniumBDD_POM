package appiumTests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;

public class FirstTest {	
	//as we are using it in a static method add the keyword static with the AppiumDriver
	//static AppiumDriver<MobileElement> driver;
	static AppiumDriver driver;
	
public static void main(String[] args) throws MalformedURLException {
	
	calculatorTest();
}
	public static AppiumDriver calculatorTest() throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "Ajith's M33");
		cap.setCapability("udid", "RFCT60GYCNF");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platfromVersion", "13");
		
		cap.setCapability("appPackage", "com.sec.android.app.popupcalculator");
		cap.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
		
		
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AppiumDriver(url, cap);
		
		System.out.println("Appium started... ");
		
		driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_03")).click();
		driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_add")).click();
		driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_02")).click();
		
		driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_equal")).click();
		
		return driver;
				
	}
}
