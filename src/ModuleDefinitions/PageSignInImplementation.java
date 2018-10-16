package ModuleDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import PageObjectsDefinitions.BasePageDefinitions;
import PageObjectsDefinitions.FacebookLoginPage;
import Utility.Logging;

public class PageSignInImplementation extends FacebookLoginPage {
	public PageSignInImplementation(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public  void ExecuteSignIn(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		FacebookLoginPage.txt_emailUser.sendKeys("aravindbalaji.balaji7@gmail.com");
		Logging.info("Entered the username");
		FacebookLoginPage.txt_password.sendKeys("test@123");
		Logging.info("Entered the password");
		FacebookLoginPage.btn_submit.click();
		Logging.info("clicked the submit");
	}
}
