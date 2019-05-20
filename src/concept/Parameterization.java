package concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class Parameterization
{ 
	private WebDriver driver;
	@BeforeMethod
	public void launchDriver()
	{
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println("Chrome Driver is loaded");
	}
	
	
	@Parameters({"name","password"})
	public void login()
	{
		driver.findElement(By.id("email")).sendKeys("name");
		driver.findElement(By.id("pass")).sendKeys("password");
		driver.findElement(By.id("u_0_2")).click();
	}

}
