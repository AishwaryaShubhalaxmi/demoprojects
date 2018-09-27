package registration;

public class MainClass {
    static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String path="C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe";
     System.setProperty("webdriver.chrome.driver", path);
     driver=new ChromeDriver();
	}

}
