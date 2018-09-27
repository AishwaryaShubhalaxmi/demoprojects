package com.mindtree.windowhandle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class WaitCommands {
	static WebDriver driver;

	public void waitImplicitly() {
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
}
