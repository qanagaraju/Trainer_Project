package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import AppElements.Login_PageObjects;
import AppElements.UserMenu_Elements;
import Config.BrowserDriver;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserMenu {
	
	WebDriver driver;
	
	static UserMenu_Elements usermenu;
	
	@BeforeStep
	public void setupSuite() {
		usermenu = PageFactory.initElements(BrowserDriver.getCurrentDriver(), UserMenu_Elements.class);
	}
	
	@When("user click aboutUs")
	public void user_click_aboutUs() {
		
		
		usermenu.click_AboutUs();
		
		//driver.findElement(By.xpath("//a[contains(text(),'About Us')]")).click();
		
	}
	
	
	@When("user click Help")
	public void userclick_Help () throws InterruptedException {
		
		usermenu.click_Help();
		
		BrowserDriver.getCurrentDriver().close();
		
		
		//driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
		Thread.sleep(3000);
		
	}
	

}
