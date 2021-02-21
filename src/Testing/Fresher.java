package Testing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fresher {

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe" );
		WebDriver driver = new FirefoxDriver();
		driver.get("https://ww.facebook.com");
		/*List<WebElement> links = driver.findElements(By.xpath("//a"));
		int n = links.size();
		for(int i=0;i<n;i++) {
			WebElement we = links.get(i);
			String text = we.getText();
			System.out.println(text);*///Text of links
		
		
		
		/*
		 * List<WebElement> links = driver.findElements(By.xpath("//a")); int count =
		 * links.size(); for(int i=count-1;i>=0;i--) { WebElement we = links.get(i);
		 * String text = we.getText(); System.out.println(text); }
		 *///Reverse order Text
		
		
		/*
		 * List<WebElement> links = driver.findElements(By.xpath("//a")); int count =
		 * links.size(); System.out.println(count); ArrayList<String> l = new
		 * ArrayList<String>(); for(WebElement we:links) { String text = we.getText();
		 * l.add(text); } // Collections.sort(l);
		 * Collections.sort(l,Collections.reverseOrder()); for( String texts:l) {
		 * 
		 * System.out.println(texts); }
		 */
		
		
		/*
		 * List<WebElement> links = driver.findElements(By.xpath("//a")); int count =
		 * links.size(); System.out.println(count); for( int i=0;i<count;i++) {
		 * WebElement text = links.get(i); String text1 = text.getText();
		 * System.out.println(text1); }
		 */
		
		
		 List<WebElement> links = driver.findElements(By.xpath("//a"));
		 int count = links.size();
		 ArrayList<String> a=new ArrayList<String>();
		 for(WebElement we:links) {
			 String text = we.getText();
			 a.add(text);
		 }
		Collections.sort(a);
		for(String t:a) {
			System.out.println(t);
			
			
			
		}
		
		
		
		
		
		
	}}
