package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	static WebDriver driver;
	By username= By.id("user_login");
	By password=By.xpath("//input[@id='user_pass']");
	By login= By.cssSelector("input[id='wp-submit']");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void typeUsername(String name) {
		driver.findElement(username).sendKeys(name);
	}
	
	public void typePassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void pressLogin() {
		driver.findElement(login).click();
	}
}
