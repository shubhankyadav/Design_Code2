package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	WebElement ele = driver.findElement(By.xpath("//select[@id='first']"));
	Select s=new Select(ele);
	boolean b = s.isMultiple();
	System.out.println(b);
	s.selectByIndex(0);
	List<WebElement> p = s.getOptions();
	System.out.println(p.size());
//	Thread.sleep(3000);
//	s.selectByValue("Google");
	Thread.sleep(3000);
	
	s.selectByVisibleText("Google");
	  WebElement ele1 = driver.findElement(By.xpath("//select[@id='second']"));
	Select s1=new Select(ele1);
	List<WebElement> options = s1.getOptions();
	System.out.println(options.size());
	s1.selectByIndex(1);
	s1.selectByIndex(2);
	/*
	 * for(int i=0;i<options.size();i++) { s1.selectByIndex(i);
	 * 
	 * 
	 * } s1.deselectAll();
	 */
	for( WebElement ele2:options) {
		String text = ele2.getText();
		System.out.println(text);
	}
     
	 

	}

}
