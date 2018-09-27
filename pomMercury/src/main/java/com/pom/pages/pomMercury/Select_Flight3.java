package com.pom.pages.pomMercury;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Flight3 {
	  WebDriver driver;

	@FindBy(xpath="//input[@value='Blue Skies Airlines$361$271$7:10']")
	private WebElement departure;
	
	@FindBy(xpath="//input[@value='Blue Skies Airlines$631$273$14:30']")
	private WebElement returnFlight;
	
	@FindBy(name="reserveFlights")
	private WebElement reserve;
	
	public Select_Flight3(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void reserveFlight() {
		departure.click();
		returnFlight.click();
		reserve.click();
	}
}
