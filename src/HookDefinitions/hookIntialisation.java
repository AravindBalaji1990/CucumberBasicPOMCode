package HookDefinitions;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hookIntialisation {
	public static WebDriver driver;

	@Before
	public void openBrowser() throws MalformedURLException {
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\aravind\\Desktop\\Selenium_Class\\LatestBrowserJar\\chromedriver_win32_2.33\\chromedriver.exe");
		// driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\aravisa\\Documents\\SeleniumJava\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@After
	public void Close() {
		driver.quit();
	}
}
