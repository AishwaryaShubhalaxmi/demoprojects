package com.hybrid.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.hybrid.base.TestBase;
import com.hybrid.pages.LoginPage;

public class LoginTest extends TestBase {
	LoginPage loginpage;
	public  LoginTest() {
		super();
	}
	
    @BeforeTest
	public void setUp() {
    	initialisation();
    	loginpage= new LoginPage();
    	}
    
    @Test
    public void loginChkTest() {
    	String title= loginpage.validatePageTitle();
        Assert.assertEquals(title, "#1 Free CRM software in the cloud for sales and service");
    	
    }
    
    @Test
    public void LoginTest() {
         loginpage.login(p.getProperty("username"), p.getProperty("password"));
    }
    
    @AfterTest
    public void closeBrowser() {
    	driver.close();
    }
}
