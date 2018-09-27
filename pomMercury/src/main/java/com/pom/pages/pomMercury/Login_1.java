package com.pom.pages.pomMercury;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_1 {
	WebDriver driver;
	
	@FindBy(name="userName")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement loginButton;
	
	public Login_1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void login() {
		username.sendKeys("mercury");
		password.sendKeys("mercury");
		loginButton.click();
	}

}
