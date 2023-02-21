package stepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/", glue= {"stepDefinitions"},

//plugin= {"pretty", "html:target/HtmlReports",
//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
//tags= "@MobileMultipleTests")

plugin= {"pretty", "html:target/HtmlReports"},
tags= "@MobileMultipleTests")
			

//"io.qameta.allure.cucumberjvm.AllureCucumberJvm"})
//plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"})
public class TestRunner  {
	
	
//	public static void writeExtentReport() {
//        Reporter.loadXMLConfig(new File("config/report.xml"));
}





