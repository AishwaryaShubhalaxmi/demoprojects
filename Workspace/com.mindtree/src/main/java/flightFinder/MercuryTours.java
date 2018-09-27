package flightFinder;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class MercuryTours {
 static WebDriver driver;
 @BeforeTest
 public void before() {
	 String path="C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe";
   	 System.setProperty("webdriver.chrome.driver", path);
   	 driver=new ChromeDriver();
   	 driver.manage().window().maximize();
   	 driver.get("http://newtours.demoaut.com/");
 }
 
 @Test(priority=1)
 public void Login() {
	 try {
	 driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
	 driver.findElement(By.xpath("//input[@name='login']")).click();
	 
	 //Validation
	 String actual=driver.getTitle();
	 String expected="Find a Flight: Mercury Tours:";
	  Assert.assertEquals(expected, actual);
	 System.out.println(driver.getTitle());
 } catch(Exception e) {
	 System.out.println(e.getMessage());
 }
 }
 @Test(priority=2)
 public void enterDetails() {
	 try {
	 driver.findElement(By.xpath("//input[@value='roundtrip']")).click();
	 Select drpPass= new Select(driver.findElement(By.xpath("//select[@name='passCount']")));
	 drpPass.selectByIndex(3);
	 Select drpLoc= new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
	 drpLoc.selectByVisibleText("New York");
	  Select drpMnth= new Select(driver.findElement(By.xpath("//select[@name='fromMonth']")));
	 drpMnth.selectByVisibleText("November");
	  Select drpDate= new Select(driver.findElement(By.xpath("//select[@name='fromDay']")));
	 drpDate.selectByIndex(18);
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 Select drpDest= new Select(driver.findElement(By.xpath("//select[@name='toPort']")));
	 drpDest.selectByVisibleText("London");
	 Select drpretMnth= new Select(driver.findElement(By.xpath("//select[@name='toMonth']")));
	 drpretMnth.selectByVisibleText("November");
	 Select drpDate1= new Select(driver.findElement(By.xpath("//select[@name='toDay']")));
	 drpDate1.selectByIndex(19);
	 driver.findElement(By.xpath("//input[@value='First']")).click();
	 Select drpAir= new Select(driver.findElement(By.xpath("//select[@name='airline']")));
	 drpAir.selectByVisibleText("Unified Airlines");
	 driver.findElement(By.xpath("//input[@name='findFlights']")).click();
	
	 //Validation
	 String actual=driver.getTitle(); 
	 String expected ="Select a Flight: Mercury Tours";
      Assert.assertEquals(actual, expected);
	 }catch(Exception e) {
		 System.out.println(e.getMessage());
	 }
	 
 }
     @Test(priority=3)
     public void moreDetails() {
    	 try {
    	 driver.findElement(By.xpath("//input[@value='Unified Airlines$363$281$11:24']")).click();
    	 driver.findElement(By.xpath("//input[@value='Pangea Airlines$632$282$16:37']")).click();
    	 driver.findElement(By.xpath("//input[@name='reserveFlights']")).click();
    	 
    	 //Validation
    	 String actual=driver.getTitle();
    	 String expected="Book a Flight: Mercury Tours";
    	 Assert.assertEquals(expected, actual);
    	 }catch(Exception e) {
    		 System.out.println(e.getMessage());
    	 }
     }
     
     @Test(priority=4)
     public void bookFlight() {
  
    	 driver.findElement(By.xpath("//input[@name='passFirst0']")).sendKeys("Tester1");
    	 driver.findElement(By.xpath("//input[@name='passFirst1']")).sendKeys("Tester2");
    	 driver.findElement(By.xpath("//input[@name='passFirst2']")).sendKeys("Tester3");
    	 driver.findElement(By.xpath("//input[@name='passFirst3']")).sendKeys("Tester4");
    	 
    	 driver.findElement(By.xpath("//input[@name='passLast0']")).sendKeys("LN1");
    	 driver.findElement(By.xpath("//input[@name='passLast1']")).sendKeys("LN2");
    	 driver.findElement(By.xpath("//input[@name='passLast2']")).sendKeys("LN3");
    	 driver.findElement(By.xpath("//input[@name='passLast3']")).sendKeys("LN4");
    	 
    	 Select drpmeal1= new Select(driver.findElement(By.xpath("//select[@name='pass.0.meal']")));
    	 drpmeal1.selectByVisibleText("Hindu");
    	 Select drpmeal2= new Select(driver.findElement(By.xpath("//select[@name='pass.1.meal']")));
    	 drpmeal1.selectByVisibleText("Low Calorie");
    	 Select drpmeal3= new Select(driver.findElement(By.xpath("//select[@name='pass.2.meal']")));
    	 drpmeal1.selectByVisibleText("Kosher");
    	 
    	 driver.findElement(By.xpath("//input[@name='creditnumber']")).sendKeys("234234");
    	 driver.findElement(By.xpath("//input[@name='buyFlights']")).click();    	 
         }
     
     @Test(priority=5)
     public void logout() {
    	 driver.findElement(By.xpath("//a[@href='mercurysignoff.php']")).click();
    	 
   
     }

     @AfterTest
     public void after() {
    	 driver.close();
     }
}
