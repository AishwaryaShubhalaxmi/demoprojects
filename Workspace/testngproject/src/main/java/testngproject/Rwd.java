package testngproject;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Rwd {
    static WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		}
	
	@Test(dataProvider="resize")
	public void resize(int height,int width ) {
		Dimension d= new Dimension(height,width);
		driver.manage().window().setSize(d);
		TakesScreenshot scrShot = ((TakesScreenshot)driver);
		File src = scrShot.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\Screenshots\\" + timestamp()+".jpg");
		try {
			FileUtils.copyFile(src,dest);
		} catch (IOException e) {
			e.getMessage();
		}
		
	}
	 public static String timestamp() {
	        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	    }
	@DataProvider(name="resize")
	public Object[][] getData(){
		Object[][] data= new Object[3][2];
		data[0][0]= 500;
		data[0][1]= 600;
		
		data[1][0]=200;
		data[1][1]=400;
		
		data[2][0]=420;
		data[2][1]=600;
		
		return data;
	}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}
