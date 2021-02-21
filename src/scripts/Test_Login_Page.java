package scripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Generics.Generic_Common;
import pom.Home_Page;
import pom.Login_Page;

public class Test_Login_Page extends Generic_Common {
 
	@Test
	public void login() throws InterruptedException {
		
		Login_Page lp= new Login_Page(driver);
		lp.enter_un();
		
		lp.enter_pwd();
		
		lp.check_box();
		Thread.sleep(2000);
		lp.click_login_button();}
//By writting two times test annotation , it will restart the execution from annotations from the start
	@AfterMethod
	public void logout() throws InterruptedException {
		Thread.sleep(2000);
		 Home_Page hm=new Home_Page(driver); 		
		 hm.click_help();
		 hm.click_option();
		 hm.print_Actitime_Version();
		 Thread.sleep(2000);
		 hm.close_btn();
		 Thread.sleep(2000);
		  hm.logout_btn();
	
	}
		 





}


