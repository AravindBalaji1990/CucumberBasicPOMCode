package PageObjectsDefinitions;

import org.openqa.selenium.WebDriver;

public abstract class BasePageDefinitions {
	public static WebDriver driver = null;

	public BasePageDefinitions(WebDriver driver) {
		BasePageDefinitions.driver = driver;
	}
}
