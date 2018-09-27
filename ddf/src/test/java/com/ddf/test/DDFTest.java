package com.ddf.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ddf.utils.ReadExcel;

public class DDFTest {
    WebDriver driver;
	@BeforeTest
	public void openBrowser() {
		String path="C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com");
	}
	
	@Test
	public void ddf() throws Exception {
		String[][] data= ReadExcel.getData("D:\\ExcelSheets\\BookNo2.xlsx", "Sheet1");
		for(int i=1;i<data.length;i++) {
			String username= data[i][0];
			String password=data[i][1];
	    driver.findElement(By.name("userName")).clear();
	    driver.findElement(By.name("userName")).sendKeys(username);
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys(password);
	    driver.findElement(By.xpath("//input[@value='Login']")).click();
	    String expectedTitle="Sign-on: Mercury Tours";
	    String actualTitle= driver.getTitle();
	    Assert.assertEquals(actualTitle, expectedTitle);
	    driver.navigate().back();
		}
	}
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
}
