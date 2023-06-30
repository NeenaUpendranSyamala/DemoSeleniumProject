package testCases;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTestCases extends BaseClass {


	LoginPage lp;

	@Test (enabled = true)
	public void verifyLoginBtnText() {
		 lp = new LoginPage(driver);
		String actual = lp.getLoginButtonText();
		String expected = "LOGIN";
		logger.info("Login button text verification....");
		Assert.assertEquals(actual, expected, "Text not as expected");
		
	}

	@Test (enabled = true)
	public void verifyLogin_ValidUser() {
		 lp = new LoginPage(driver);
		lp.performLogin(config.getUserName(),config.getPassword());
		logger.info("Looking for Home PAge title....");
		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}
}
