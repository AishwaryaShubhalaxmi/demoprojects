package com.mindtree.ddfDataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class MainClass {
	static WebDriver driver;
	@BeforeTest
	public void openBrowser() {
		String path="C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test(dataProvider="LoginData")
	public void login(String username, String password) {
		driver.get("http://demosite.center/wordpress/wp-login.php");
		driver.findElement(By.id("user_login")).sendKeys(username);
		driver.findElement(By.id("user_pass")).sendKeys(password);
		driver.findElement(By.id("wp-submit")).click();
		
		//validation
		Assert.assertTrue(driver.getTitle().contains("Dashboard"));
		System.out.println("Login successful");
		
		
	}
   
	@DataProvider(name="LoginData")
	public Object[][] passData() throws Exception{
		DataConfig config= new DataConfig("D:\\ExcelSheets\\BookNo2.xlsx");
		int rows= config.getRowCount(0);
		Object[][] obj= new Object[rows][2];
		for(int i=0;i<rows;i++) {
		obj[i][0]=config.getData(0,i, 0);
		obj[i][1]=config.getData(0, i, 1);
	}return obj;
	}
}
