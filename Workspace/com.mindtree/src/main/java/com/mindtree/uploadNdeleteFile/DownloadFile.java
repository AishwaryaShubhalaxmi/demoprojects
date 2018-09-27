package com.mindtree.uploadNdeleteFile;

import java.io.File;
import java.util.HashMap;
import java.util.UUID;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DownloadFile {

	static WebDriver driver;
	File folder;
	
	public void setUp() {
		folder= new File(UUID.randomUUID().toString()); //generates random uid for files
		folder.mkdir();
		String path="C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path); 
		ChromeOptions options= new ChromeOptions();
		HashMap<String,Object> prefs= new HashMap<String,Object>();
		prefs.put("profile.default_content_settings.popups", 0); //disables all the popup windows
		prefs.put("download.default_directory", folder.getAbsolutePath());
		options.setExperimentalOption("prefs", prefs);
		DesiredCapabilities cap= DesiredCapabilities.chrome();
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		driver= new ChromeDriver();
		
		
	
	}
	

}
