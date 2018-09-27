package testngproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Launch {
  public static WebDriver driver;
//  public UIMap uimap;
  public Launch datafile;
  public String workingDirectory;
   


	public Launch(String string) {
	// TODO Auto-generated constructor stub
}

	@BeforeTest
	public void before() {
		 String path="C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe"; 
	     System.setProperty("webdriver.chrome.driver", path);   
	     driver= new ChromeDriver();
	     driver.manage().window().maximize();
  }
	
	@Test
	public void login() {
		//launch=new Launch(workingDirectory + "\\Resources\\locator.properties");
	//	WebElement username= driver.findElement(((Object) launch).getLocator())
		
	}
	
}
