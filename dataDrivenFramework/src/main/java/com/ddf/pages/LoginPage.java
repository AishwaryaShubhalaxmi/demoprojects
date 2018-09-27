package com.ddf.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.ddf.utility.Utility;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LoginPage {
	WebDriver driver;
	Utility util= new Utility();
	 ExtentReports extent;
		ExtentTest logger;
	
	public LoginPage(WebDriver driver) {
		this.driver= driver;
		
	}
	public void enterEmail(String username ) throws Exception {
		driver.findElement(By.id(util.fetchLocators("login_username_id"))).sendKeys(username);
		 extent = new ExtentReports("D:\\ExtentReport\\report.html");
			logger=extent.startTest("enterEmail"); 
			TakesScreenshot scrShot = ((TakesScreenshot)driver);
			File src = scrShot.getScreenshotAs(OutputType.FILE);
			File dest = new File("D:\\Screenshots\\enteremail.jpg");
			try {
				FileUtils.copyFile(src,dest);
			} catch (IOException e1) {
				
				System.out.println("IOEXPN");
			} 
			logger.log(LogStatus.INFO, "<a href = 'D:\\Screenshots'>Files</a>");
			extent.endTest(logger);
			extent.flush();
		
		
		
	}
	public void enterPassword(String password) throws Exception {
		driver.findElement(By.id(util.fetchLocators("login_password_id"))).sendKeys(password);
		
	}
	public void clickButton() throws Exception {
		driver.findElement(By.xpath(util.fetchLocators("login_click_xpath"))).click();
		
	}
	

}
