package concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeMethodANDAfterMethod
{
	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser(){
	driver = new ChromeDriver();   
	}

	@Test
	public void verifyPageTitle1(){
	driver.get("https://www.gmail.com");
	Assert.assertEquals("Gmail", driver.getTitle());
	}

	@Test
	public void verifyPageTitle2(){
	driver.get("https://in.yahoo.com/");
	Assert.assertEquals("Yahoo", driver.getTitle());
	}
	@AfterMethod
	public void closeBrowser(){
	driver.close();
	}
	
}
