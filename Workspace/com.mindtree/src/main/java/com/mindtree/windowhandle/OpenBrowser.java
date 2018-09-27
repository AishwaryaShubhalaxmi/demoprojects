package com.mindtree.windowhandle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
 static WebDriver driver;
 
 public void openChrome() {
	 String path="C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe";
     System.setProperty("webdriver.chrome.driver", path);   
	 driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.hdfcbank.com/");
 }
}
