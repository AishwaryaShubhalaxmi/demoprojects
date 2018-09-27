package com.makemytrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SignUp {
	static WebDriver driver;
	
	@Test
	public void signup() {
	driver.findElement(By.id("ch_signup_icon")).click();
	driver.findElement(By.id("ch_signup_email")).sendKeys("aishwaryashubhalaxmi8@gmail.com");
    driver.findElement(By.id("ch_signup_phone")).sendKeys("7077964857");
    driver.findElement(By.id("ch_signup_password")).sendKeys("as@831996");
    driver.findElement(By.id("ch_signup_btn")).click();
	}
	
	@Test
	public void login() {
	driver.findElement(By.id("ch_login_email")).sendKeys("aishwaryashubhalaxmi8@gmail.com");
	driver.findElement(By.id("ch_login_password")).sendKeys("as@831996");
	driver.findElement(By.id("ch_login_btn")).click();
	}
	
	@Test
	public void bookTicket() {
		driver.findElement(By.className("label_text flight-trip-type")).click();
	}

}
