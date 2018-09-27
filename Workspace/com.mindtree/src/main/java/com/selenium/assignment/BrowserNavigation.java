 package com.selenium.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigation {
      static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe";
   	 System.setProperty("webdriver.chrome.driver", path);
   	 driver=new ChromeDriver();
   	 driver.manage().window().maximize();
   	 driver.get("https://www.google.com");  //use of get method
   	 driver.findElement(By.xpath("//a[@class='gb_P']")).click();
   	 driver.navigate().back();  //goes back to the previous page
   	 try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
	   System.out.println(e.getMessage());
	
	}
   	 driver.navigate().forward(); //goes again to the new page
   	 driver.navigate().to("https://www.amazon.com"); //goes to the given url
   	 driver.navigate().refresh(); //refreshes the current page
   	 driver.close();
	}

}
