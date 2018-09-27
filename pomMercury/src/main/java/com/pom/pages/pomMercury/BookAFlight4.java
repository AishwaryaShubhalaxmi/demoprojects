package com.pom.pages.pomMercury;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAFlight4 {
     WebDriver driver;
   
     @FindBy(name="passFirst0")
	private WebElement firstName;
	
	@FindBy(name="passLast0")
	private WebElement lastName;
	
	@FindBy(name="creditnumber")
	private WebElement credit;
	
	@FindBy(name="buyFlights")
	private WebElement buy;
	
	public BookAFlight4(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void bookFlight(String fname, String lname,String cnumber) {
		firstName.sendKeys(fname);
		lastName.sendKeys(lname);
		credit.sendKeys(cnumber);
		buy.click();
		
	}
}
