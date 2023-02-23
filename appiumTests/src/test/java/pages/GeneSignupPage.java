package pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;

public class GeneSignupPage {
	
	AppiumDriver driver;
	
	By createAcntBtn =  By.id("com.genedrive:id/createAccountButton");
	By createusrName =  By.id("com.genedrive:id/usernameField");
	By barcodeIcon = By.id("com.genedrive:id/barcodeIcon");
	
	public GeneSignupPage(AppiumDriver driver) {

		this.driver = driver;
	}
	
	public void tapBtn() {

		driver.findElement(createAcntBtn).click();
		driver.findElement(barcodeIcon).click();
	}

}
