package StepDefinitionsImplementation;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import HookDefinitions.hookIntialisation;
import ModuleDefinitions.PageSignInImplementation;
import ModuleDefinitions.PageVerificationLogin;
import PageObjectsDefinitions.BasePageDefinitions;
import PageObjectsDefinitions.FacebookLoginPage;
import PageObjectsDefinitions.FacebookLoginVerifyPage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionFacebookPage {
	public WebDriver driver;

	// Constructor - to  initialise the hooks
	public StepDefinitionFacebookPage() {
		driver = hookIntialisation.driver;
	}

	@Given("^I enter the url for the applciation$")
	public void i_enter_the_url_for_the_applciation() throws Throwable {
		driver.get("https://facebook.com");
	}

	@When("^I enter the login details$")
	public void I_enter_the_login_details() throws Throwable {
		PageSignInImplementation obj = new PageSignInImplementation(driver);
		obj.ExecuteSignIn(driver);
	}

	@Then("^I verify the invalid message page details$")
	public void i_verify_the_page_details() throws Throwable {
		PageFactory.initElements(driver, FacebookLoginVerifyPage.class);
		PageVerificationLogin.VerifyPageDetails(driver);
	}

}
