package com.hybrid.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hybrid.base.TestBase;

public class LoginPage extends TestBase {
  //PageFactory- Object repository
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	//Initialize the page factory
	public LoginPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	//Actions:
	public String validatePageTitle() {
		return driver.getTitle();
	}
	
	public void login(String un, String pwd) {
		username.sendKeys(un);
		username.sendKeys(pwd);
		loginBtn.click();
	}
	
}
