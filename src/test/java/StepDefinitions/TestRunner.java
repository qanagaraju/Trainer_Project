package StepDefinitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




@CucumberOptions(
		
		features = {"E:\\Selenium_Training_Batches\\Selenium_7.30pm_24-01-2022\\Selenium_Training_Project\\CucumberTest\\src\\test\\resources\\Features"},
				
		glue = {"StepDefinitions"},
		
		//plugin = { "pretty", "html:target/cucumber-reports" }
				//plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json"},
				//plugin = { "pretty", "junit:target/cucumber-reports/Cucumber.xml" },
		
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		monochrome = true,
		publish = true
		
		
		)














public class TestRunner extends AbstractTestNGCucumberTests {
 


	

}