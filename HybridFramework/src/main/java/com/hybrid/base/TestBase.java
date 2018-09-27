package com.hybrid.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hybrid.util.TestUtil;

public class TestBase {
	public static WebDriver driver;
	public static Properties p;
	
	public TestBase() {
	try {
	p=new Properties();
	FileInputStream file1= new FileInputStream("D:\\SPringBoot\\HybridFramework\\src\\main\\java\\com\\hybrid\\config\\config.properties");
    p.load(file1);
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialisation() {
	String browserName= p.getProperty("browser");
	if(browserName.equals("chrome")) {
		String path=p.getProperty("browser_path");
	   	 System.setProperty("webdriver.chrome.driver", path);
	   	 driver=new ChromeDriver();
	   	 driver.manage().window().maximize();
	   	 driver.manage().timeouts().implicitlyWait(TestUtil.implicitwait, TimeUnit.SECONDS);
	   	 driver.get(p.getProperty("url"));
	}
	}

}
