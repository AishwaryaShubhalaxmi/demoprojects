package com.fight.makmytrip;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
 static WebDriver driver;
	
 public void open() {
	
	 String path="C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe";
	 System.setProperty("webdriver.chrome.driver", path);
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.makemytrip.com");
 }
}
