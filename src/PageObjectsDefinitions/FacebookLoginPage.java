package PageObjectsDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage extends BasePageDefinitions {

	public FacebookLoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how= How.XPATH , using = "//*[@id='email']")
	public static WebElement txt_emailUser;
//	@FindBy(xpath = "//*[@id='email']")
//	public static WebElement txt_emailUser;
	
	@FindBy(xpath = "//*[@id='pass']")
	public static WebElement txt_password;
	
	@FindBy(xpath = "//*[@value='Log In']")
	public static WebElement btn_submit;
}
