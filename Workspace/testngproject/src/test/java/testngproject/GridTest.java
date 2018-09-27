package testngproject;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridTest {

	@Test
	public void test1() throws MalformedURLException {
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		URL url = new URL(" http://172.17.124.184:4444/wd/hub");
	   WebDriver driver= new RemoteWebDriver(url,cap);
		
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
		
	}
}