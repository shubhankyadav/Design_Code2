package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Generics.Generic_Common;

public class Login extends Generic_Common   {
	@Test
	public void login() {
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
		WebDriverWait wait=new WebDriverWait(driver, 10);
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		wait.until(ExpectedConditions.titleContains("Enter"));
		String title = driver.getTitle();
		SoftAssert s= new SoftAssert();
		s.assertEquals(title,"actiTIME - Enter Time-Trac");
//		Assert.assertEquals(title,"actiTIME - Enter Time-Track");
		
//		Reporter.log(title);
		System.out.println(title);
		s.assertAll();
	
	}

}
