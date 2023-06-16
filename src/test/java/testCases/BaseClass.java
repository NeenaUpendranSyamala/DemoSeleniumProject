package testCases;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilities.ReadConfig;

public class BaseClass {

	WebDriver driver;
	ReadConfig config = new ReadConfig();
	
	
	protected static final Logger logger = LogManager.getLogger("DemoSeleniumProject");
	
	
	@BeforeMethod
	public void beforeMethod() {
		
		System.setProperty("webdriver.chrome.driver",config.getChromeDriver() );
		driver = new ChromeDriver();
		logger.info("Loading the website...");
		driver.get(config.getAppURL());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}
}
