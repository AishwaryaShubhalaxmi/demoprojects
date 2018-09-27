package com.pom.pages.pomMercury;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Flight_Finder2 {
     WebDriver driver;
	@FindBy(css="input[value='Business']")
	private WebElement radio;
	
	@FindBy(name="airline")
	private WebElement airline;
	
	@FindBy(name="findFlights")
	private WebElement flight;
	
	public Flight_Finder2(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void flightFinder() {
		radio.click();
		Select drpdown= new Select(airline);
		drpdown.selectByIndex(2);
		flight.click();
	}
}
