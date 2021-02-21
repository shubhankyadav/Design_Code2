package Generics;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public  class Generic_Common {
    public  WebDriver driver;
    static {//It Executes before than @BM(Static Block) 
    	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
    }
	@BeforeMethod
	public  void Open_application() {
		
	   driver= new ChromeDriver();
	   driver.get("http://localhost/login.do");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	/*@AfterMethod
	public void Close_application() {
		
		 driver.close();
		*/
	}

