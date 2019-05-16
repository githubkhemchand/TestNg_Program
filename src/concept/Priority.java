package concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Priority
{
	WebDriver driver = new ChromeDriver();
	//By default all test cases are executed by alphabetically.
	//We can define priority by priority=0 
	
   @Test(priority=1)
   public void A()
   {
	   System.out.println("This is A function");
	/*  
	   driver.get("https://www.google.com");
	   String title = driver.getTitle();
	   Assert.assertEquals(title, "Google");
	   driver.close();*/
   }
   
   @Test(priority=3)
   public void B()
   {
	   System.out.println("This is B function");
	  
   }
   @Test(priority=2)
   public void C()
   {
	   System.out.println("This is C Function");
	  
   }
}
