package com.mindtree.ddf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class DataDrivenFramework {

	static WebDriver driver;
	@BeforeTest
	public void open() {
		String path="C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	@Test(dataProvider="wordData")
	public void Login(String username, String password) {
		
		driver.get("http://demosite.center/wordpress/wp-login.php");
		driver.findElement(By.id("user_login")).sendKeys(username);
		driver.findElement(By.id("user_pass")).sendKeys(password);
		driver.findElement(By.id("wp-submit")).click();
		
		//validation
		Assert.assertTrue(driver.getTitle().contains("Dashboard"));
		System.out.println("Login successful");
	}
		
    @DataProvider(name="wordData")
    public Object[][] passData(){
    	Object[][] obj= new Object[3][2];
    	obj[0][0]="user";
    	obj[0][1]="pass";
    	
    	obj[1][0]="admin";
    	obj[1][1]="demo123";
    	
    	obj[2][0]="user1";
    	obj[2][1]="pass1";
    	
    	return obj;
    }
    
 
    
    
    	
    	
    }
    
		
	
	

