package com.selenium.assignment;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.selenium.pages.OpenChromeBrowser;

public class OpenBrowsers {
   static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter your choice:");
     System.out.println("1.Open Chrome 2.Open Internet Explorer");
     int choice=sc.nextInt();
     switch(choice) {
     case 1:
    	String path="C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe";
    	 System.setProperty("webdriver.chrome.driver", path);
    	 driver=new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.get("https://www.google.com");
    	 break;
    	 
     case 2:
    	 String path1="C:\\Users\\M1046926\\Downloads\\IEDriverServer_x64_3.13.0\\IEDriverServer.exe";
    	 System.setProperty("webdriver.ie.driver", path1);
    	 driver=new InternetExplorerDriver();
    	 driver.manage().window().maximize();
    	 driver.get("https://www.google.com");
    	 break;
    
     }
	}

}
