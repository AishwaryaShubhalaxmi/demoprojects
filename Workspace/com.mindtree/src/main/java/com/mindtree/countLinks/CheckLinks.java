package com.mindtree.countLinks;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CheckLinks {
    
	static WebDriver driver;
	@BeforeTest
	public void open() {
		String path="C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe"; 
	     System.setProperty("webdriver.chrome.driver", path);   
	     driver= new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("http://www.facebook.com");
	  
	}
	@Test
	public void checkLinks() {
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println("Total number of links: " + links.size());
		for(int i=0;i<links.size();i++) {
			WebElement ele= links.get(i);
		  String str=ele.getAttribute("href");
		 System.out.println(str);
		  verifyLink(str);
		}
	}
		public static  void verifyLink(String linkurl) {
		try {
			URL chklink= new URL(linkurl);
			HttpURLConnection httpcon= (HttpURLConnection)chklink.openConnection();
			httpcon.setConnectTimeout(2000);
			httpcon.connect();
			if(httpcon.getResponseCode()==200) {
				System.out.println(linkurl + "-" + httpcon.getResponseMessage() );
			
			}
			if(httpcon.getResponseCode()>=400) {
				System.out.println(linkurl + "-" + httpcon.getResponseMessage() +  HttpURLConnection.HTTP_NOT_FOUND);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
