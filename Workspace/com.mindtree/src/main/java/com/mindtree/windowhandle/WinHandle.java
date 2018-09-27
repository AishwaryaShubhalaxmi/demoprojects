package com.mindtree.windowhandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WinHandle {
 static WebDriver driver;
 public void winHandles() {
	 
   driver.findElement(By.id("loginsubmit")).click();
   System.out.println(driver.getWindowHandle()); //returns the parent window handle
   
   for(String win: driver.getWindowHandles()) {     //returns all the window handles
   driver.switchTo().window(win);
   }
   
   driver.findElement(By.xpath("//a[@class='btn btn-default redBtn']")).click(); //performs operation on child window
   System.out.println(driver.getWindowHandle());
 }
}
