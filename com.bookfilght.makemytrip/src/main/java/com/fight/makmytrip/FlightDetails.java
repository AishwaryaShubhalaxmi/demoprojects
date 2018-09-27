package com.fight.makmytrip;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FlightDetails {
	static WebDriver driver;
	 public static String index1;
     public static String index2;

	public static void flightBook(String airline) {
		String fname=airline;
		List<WebElement> selectFrom=driver.findElements(By.xpath("//div[@class='col-xs-6 left_pannel']"));
	    index1=selectFrom.get(0).getText().split("\n")[1];
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",selectFrom.get(0));
		Actions as=new Actions(driver);
		as.moveToElement(selectFrom.get(0)).click().perform();
	}
		
  public  static void returnFlight(String airline) {
	    String fname1=airline;
	    List<WebElement> selectFrom1=driver.findElements(By.xpath("//"));
	    index2=selectFrom1.get(0).getText().split("\n")[1];
	    JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",selectFrom1.get(0));
		Actions as=new Actions(driver);
		as.moveToElement(selectFrom1.get(0)).click().perform();
	    
  }
		
	public static void bookFlight() {
		driver.findElement(By.linkText("Book")).click();
		List<WebElement> selectfrom3=driver.findElements(By.xpath("//span[@class='block review_fligh_number ng-binding']"));
		String id1=selectfrom3.get(0).getText();
		String id2=selectfrom3.get(0).getText();
		BookingValidation.validate(index1, index2, id1, id2);
		
	}
		
		
		
	}

