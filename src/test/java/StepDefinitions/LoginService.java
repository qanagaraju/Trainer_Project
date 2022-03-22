package StepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import AppElements.Login_PageObjects;
import AppUtilities.BrowserDriver;
import AppUtilities.Property_Loader;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginService {
	
	static WebDriver driver;
	static BrowserDriver browser = new BrowserDriver();
	static Property_Loader prop = new Property_Loader();
	static Login_PageObjects loginpage;
	
	@BeforeStep
	public void setupSuite() {
		loginpage = PageFactory.initElements(driver, Login_PageObjects.class);
	}
	
	
	@Given("user launch browser")
	public void user_launch_browser() {
		
		driver = browser.startBrowser(prop.getbrowerType(), prop.geturl());
	  
	}
	
		
	@When("user insert username and password")
	public void user_insert_username_and_password() {
	    
		loginpage.getUsername(prop.getusername()).getPassword(prop.getpassword());
		
	}
	
	
	@Then("click submit")
	public void click_submit() throws InterruptedException {
	  
		loginpage.getLoginButton();
		Thread.sleep(3000);
		loginpage.getSignOut();
		
	}

	
	@AfterStep
	public void addScreenshot(Scenario scenario){

		//validate if scenario has failed
		if(scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "image"); 
		}
		
	}
	
	

	
	@After
	public void closeBrowser() {
		
		driver.close();
	}
	
	
	
	

	
	
	
}
