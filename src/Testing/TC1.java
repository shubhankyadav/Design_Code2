package Testing;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC1 {
   @Test(priority=1)
   public void test1()
   {
	   Reporter.log("2",true);
   }
   
  @Test(priority=0,invocationCount=3)
   public void test2(){
	   Reporter.log("1",true);
   }
   
}
