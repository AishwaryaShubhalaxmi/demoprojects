package com.fight.makmytrip;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlightSearch {
	static WebDriver driver;

public static void selectPlaces(String fromCity, String fromCityCode, String toCity, String toCityCode){
    //To select source city
	WebElement ele=  driver.findElement(By.id("hp-widget__sfrom"));
	ele.click();
	ele.sendKeys(fromCity);
	
     List<WebElement> options= driver.findElements(By.className("locationFilter autocomplete_from"));
	 for(WebElement option: options) {
		 String s1=option.getText();
		 if(s1.substring(s1.length()-3, s1.length()).equals("fromCityCode")){
			 option.click();
		 }
	 }
	 
    //To select destination city
	 driver.findElement(By.id("hp-widget__sTo")).sendKeys(toCity);
	 List<WebElement> options1= driver.findElements(By.className("locationFilter autocomplete_to"));
	 for(WebElement opt: options1) {
		 String s2= opt.getText();
		 if(s2.substring(s2.length()-3, s2.length()).equals(toCityCode)) {
			 opt.click();
		 }
	 }
	 
 //To select departure date
	 Date d= new Date();
	 SimpleDateFormat f= new SimpleDateFormat("dd");
	 String str= f.format(d);
	 driver.findElement(By.id("hp-widget__depart")).click();
	  if(Integer.parseInt(str)>10) {
		  str=str.substring(1);
	  }
	 driver.findElement(By.xpath("//td[@class='ui-datepicker-current-day ui-state-minDate']//a[contains(text(), '"+str+"')]")).click();
	 
 //To select return date
	 int d2= Integer.parseInt(str)+4;
	 if(d2<10) {
		 d2=d2%10;
	 }
	 driver.findElement(By.id("hp-widget__return")).click();
	 
	 
 //Click on search button
	 
	driver.findElement(By.id("searchBtn")).click(); 
	 
}
}
