package com.selenium.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HeaderFooter {
    static WebDriver driver;
    
    @BeforeTest
	public void before() {
		String path="C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe"; 
	     System.setProperty("webdriver.chrome.driver", path);   
	     driver= new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("http://www.opensourcecms.com/demo/1/319/InterPhoto_Image_Gallery");
	}
  /*  
	@Test
	public void headerFooter () {
	   boolean header=driver.findElement(By.id("header")).isDisplayed();
	   if(header) {
		   System.out.println("Header is present");
	   }
	   else {
		   System.out.println("No header is present");
	   }
		
	}*/
	
	
}
