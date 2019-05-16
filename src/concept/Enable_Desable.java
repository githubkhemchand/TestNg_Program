package concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Enable_Desable
{
   //Enabled= true, false use when we want to execute only specific test case
	WebDriver driver = new ChromeDriver();
	
	   @Test(priority=1,enabled=true)
	   public void A()
	   {
		   System.out.println("This is A function");
	   }
	   
	   @Test(priority=3,enabled=false)
	   public void B()
	   {
		   System.out.println("This is B function");  
	   }
	   
	   @Test(priority=2,enabled=false)
	   public void C()
	   {
		   System.out.println("This is C Function");  
	   }
}
