package PageObjectsDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookLoginVerifyPage extends BasePageDefinitions {

	public FacebookLoginVerifyPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[@id='loginbutton']")
	public static WebElement lbl_notvalidUser;

}
