package com.selenium.assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DropDwnBox {
  static WebDriver driver;
  
  @BeforeTest
  public void before() {
	  String path="C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe"; 
	     System.setProperty("webdriver.chrome.driver", path);   
	     driver= new ChromeDriver();
	     driver.manage().window().maximize();
  }
  
  @Test
  public void dropdown() {
	  driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
	  Select drpContinent= new Select(driver.findElement(By.id("continents")));
	   drpContinent.selectByIndex(1);
	   drpContinent.selectByVisibleText("Africa");
	   
	   //prints all the elements of the drop down box
	  List<WebElement> e = drpContinent.getOptions(); 
	  int itemCount = e.size();

	  for(int l = 0; l < itemCount; l++)
	  {
	      System.out.println(e.get(l).getText());
	  }
  }
}
