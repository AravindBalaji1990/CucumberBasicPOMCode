package ModuleDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import PageObjectsDefinitions.BasePageDefinitions;
import Utility.Logging;

public class PageVerificationLogin extends BasePageDefinitions {
	public PageVerificationLogin(WebDriver driver) {
		super(driver);
	}

	public static void VerifyPageDetails(WebDriver driver) {
		if (PageObjectsDefinitions.FacebookLoginVerifyPage.lbl_notvalidUser.isDisplayed() == true) {
			Logging.info("The page is available");
		} else {
			Logging.error("The page not displayed");
		}
	}
}
