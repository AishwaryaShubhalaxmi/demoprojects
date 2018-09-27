package makemytrip.com.makemytrip;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
	static WebDriver driver;
    @Test
    public void openBrowser() {
	String path="C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe";
	 System.setProperty("webdriver.chrome.driver", path);
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.google.com");
    }
}
