package com.makemytrip;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	static WebDriver driver;
 public static void launchbrowser() {
	 Properties p= new Properties();
	 String driverpath="path";
	 System.setProperty("property", driverpath);
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("url");
 }
}
