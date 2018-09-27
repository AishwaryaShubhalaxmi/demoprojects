package com.wordpress.main;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.wordpress.pages.LoginPage;
import com.wordpress.pages.OpenChromeBrowser;

public class MainClass {
	static WebDriver driver;
	@BeforeTest
	public void openBrowser() {
	 OpenChromeBrowser ocb= new  OpenChromeBrowser();
	 ocb.open();
	}
    @Test
    public void testLogin() {
    	LoginPage log= new LoginPage(driver);
    	log.typeUsername("admin");
    	log.typePassword("demo123");
    	log.pressLogin();
    }
}
