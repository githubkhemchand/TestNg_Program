package concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitle
{
	
   @Test
   public void vrifyTitle()
   { 
	   System.setProperty("WebDriver.chrome.driver", "D:\\Java Practice programs\\TestNg Practice\\chromedriver.exe");
	   WebDriver driver= new ChromeDriver();
	   driver.get("https://www.gmail.com");
	   String title = driver.getTitle();
	   Assert.assertEquals(title, "Gmail");
	   
   }
}
