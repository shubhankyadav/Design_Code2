package scripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Generics.Generic_Screenshot;

public class Test_Screenshot extends Generic_Screenshot{

	public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver"
			,"./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com");
	Generic_Screenshot.take_screenshot(driver);
	Thread.sleep(3000);
	driver.get("https://www.facebook.com");
	Generic_Screenshot.take_screenshot(driver);
	

	}

}
