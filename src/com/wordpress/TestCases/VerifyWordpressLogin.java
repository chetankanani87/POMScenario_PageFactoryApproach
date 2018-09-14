/**
 * 
 */
package com.wordpress.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import com.wordpress.pages.LoginPageLocators;
import lib.BrowserDriverUtility;
import lib.ScreenshotUtility;

/**
 * @author ChetanKanani
 *
 */
public class VerifyWordpressLogin {

	WebDriver dr;
	String path;

	@BeforeTest
	public void InvokeBrowser() {
		dr = BrowserDriverUtility.InvokeBrowser("webdriver.chrome.driver",
				"C:\\Chetan\\SeleniumSuite\\WebDrivers\\chromedriver.exe",
				"http://demosite.center/wordpress/wp-login.php");
		path = ScreenshotUtility.CaptureScreenshot(dr, "1_MainPage");
	}

	@Test
	public void verifyValidLogin() {
		//Created Page Object using PageFactory
		LoginPageLocators login = PageFactory.initElements(dr, LoginPageLocators.class);
		
		//Call the method
		login.login_wordpress("admin", "demo123");
		path = ScreenshotUtility.CaptureScreenshot(dr, "2_HomePage");

	}

	@AfterTest
	public void tearDown() {

		dr.close();

	}
}
