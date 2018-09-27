package com.ddf.assertions;

import org.openqa.selenium.WebDriver;

public class Assertion {
	
	public static boolean validatePageUrl(WebDriver driver,String expUrl) {
		boolean flag= false;
		if(driver.getCurrentUrl().equalsIgnoreCase(expUrl)) {
			flag= true;
		}
		return flag;
		
	}
	
	public static boolean validatePageTitle(WebDriver driver,String expTitle) {
		boolean flag= false;
		if(driver.getTitle().equals(expTitle)) {
			flag= true;
		}
		return true;
	}

}
