package com.mindtree.firstScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ams {
    static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String path="C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe";
     System.setProperty("webdriver.chrome.driver", path);
     driver=new ChromeDriver();
     driver.get("https://corpapps.mindtree.com/ams");
     driver.manage().window().maximize();
     WebElement element=driver.findElement(By.xpath("//img[@class='purple']"));
     element.click();
     driver.findElement(By.xpath("//input[@id='newReq']")).click();
    WebElement e= driver.findElement(By.xpath("//input[@id='txtFromDate']"));
     e.sendKeys("08/15/2018");
     WebElement em=driver.findElement(By.xpath("//input[@name='requestToDate']"));
     em.sendKeys("08/15/2018");
     driver.findElement(By.id("requestorComments")).sendKeys("Outing");
     WebElement rt=driver.findElement(By.xpath("//select[@id='ddlRequestType'] //option[@value='1']"));
      rt.click();
      try {
		Thread.sleep(2000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
    // WebElement ert=driver.findElement(By.xpath("//select[@name='requestFromTime'] //option[@value='5:30 PM']"));
      WebElement ert=driver.findElement(By.xpath("//select[@name='requestFromTime']"));
     ert.click();
     try {
		Thread.sleep(2000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
     WebElement ers=driver.findElement(By.xpath("//option[@value='5:30 PM']"));
     ers.click();
     driver.findElement(By.xpath("//select[@name='requestToTime'] //option[@value='10:30 PM']")).click();
     driver.findElement(By.xpath("//input[@id='chkBoxNone']")).click();
  //  driver.findElement(By.xpath("//input[@id='submit']")).click();
     
	}

}
