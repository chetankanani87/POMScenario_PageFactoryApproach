/**
 * 
 */
package com.wordpress.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author ChetanKanani
 *
 *This class will store all the locators and methods of login page.
 */
public class LoginPageLocators {
	
	WebDriver driver;
	
	public LoginPageLocators(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(id="user_login")
	@CacheLookup
	WebElement username;
	
	@FindBy(how = How.ID, using = "user_pass")
	@CacheLookup
	WebElement password;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='wp-submit']")
	@CacheLookup
	WebElement submit_Button;
	
	@FindBy(how = How.LINK_TEXT, using = "Lost your password?")
	@CacheLookup
	WebElement forget_Password_Link;
	
	public void login_wordpress(String uname, String pass) {
		username.sendKeys(uname);
		password.sendKeys(pass);
		submit_Button.click();
	}
}
