package com.selenium.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FaceBookLogin {
static WebDriver driver;
 @BeforeTest
 public void before() {
	 String path="C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe"; 
     System.setProperty("webdriver.chrome.driver", path);   
     driver= new ChromeDriver();
     driver.manage().window().maximize();
 }
 
@Test
public void login() {
	driver.get("https://www.facebook.com");
	//boolean email=driver.findElement(By.id("")).si
}
}
