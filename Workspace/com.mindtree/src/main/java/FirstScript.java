
//WebDriver Class which instantiates a new Browser
import org.openqa.selenium.WebDriver;  
//ChromeDriver Class which instantiates a new Chrome Driver onto the Chrome Browser instantiated above
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {
     static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String path="C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe";  //path of the chrome driver
      System.setProperty("webdriver.chrome.driver", path);
      driver=new ChromeDriver();  //Driver object is instantiated
      driver.get("https://www.javatpoint.com"); //Launches the browser session
      String expectedTitle="Tutorials - Javatpoint";
      String actualTitle= driver.getTitle();
      System.out.println(actualTitle);
      if(actualTitle.contentEquals(expectedTitle)) {
    	  System.out.println("True");
      }else {
    	  System.out.println("false");
      }
      driver.close(); //closes the browser session
	}

}
