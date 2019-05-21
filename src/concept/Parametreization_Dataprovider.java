package concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parametreization_Dataprovider
{
   
	   /*@Parameters annotation is easy but to test with multiple sets of data we need to use Data Provider.

	   To fill thousand's of web forms using our testing framework we need a different methodology which can give us a very large 
	   dataset in a single execution flow.

	   This data driven concept is achieved by @DataProvider annotation in TestNG.
	   It has only one attribute 'name'. If you do not specify the name attribute then the DataProvider's name will be same as the corresponding method name.

       Data provider returns a two-dimensional JAVA object to the test method and the test method, will invoke M times in a M*N type 
       of object array. For example, if the DataProvider returns an array of 2*3 objects, the corresponding testcase will be invoked 
       2 times with 3 parameters each time.
	   */
	   WebDriver driver;
	   
	   
		String driverPath = "C:\\geckodriver.exe";
		@BeforeTest(groups={"A","B"})
		public void setup(){
			System.setProperty("webdriver.firefox.marionette", driverPath);
			  	driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("https://google.com");
		}
		
		@Test(dataProvider="SearchProvider",groups="A")
		public void testMethodA(String author,String searchKey) throws InterruptedException{
			{
			  //search google textbox
				Thread.sleep(2000);
				WebElement searchText = driver.findElement(By.name("q"));
				//search a value on it
				searchText.sendKeys(searchKey);
				System.out.println("Welcome ->"+author+" Your search key is->"+searchKey);
				Thread.sleep(3000);
				String testValue = searchText.getAttribute("value");
				System.out.println(testValue +"::::"+searchKey);
				searchText.clear();
				//verify correct value in searchbox
				Assert.assertTrue(testValue.equalsIgnoreCase(searchKey));
		}
		}
		
		@Test(dataProvider="SearchProvider",groups="B")
		public void testMethodB(String searchKey) throws InterruptedException{
			{
			  //find google search box
				WebElement searchText = driver.findElement(By.name("q"));
				//search a value on it
				searchText.sendKeys(searchKey);
				System.out.println("Welcome ->Unknown user Your search key is->"+searchKey);
				Thread.sleep(3000);
				String testValue = searchText.getAttribute("value");
				System.out.println(testValue +"::::"+searchKey);
				searchText.clear();
				//verify correct value in searchbox
				Assert.assertTrue(testValue.equalsIgnoreCase(searchKey));
		}
		}
		
		/**
		 * Here the DAtaProvider will provide Object array on the basis on ITestContext
		 * @param c
		 * @return
		 */
		@DataProvider(name="SearchProvider")
		public Object[][] getDataFromDataprovider(ITestContext c){
		Object[][] groupArray = null;
			for (String group : c.getIncludedGroups()) {
			if(group.equalsIgnoreCase("A")){
				groupArray = new Object[][] { 
						{ "Guru99", "India" }, 
						{ "Krishna", "UK" }, 
						{ "Bhupesh", "USA" } 
					};
			break;	
			}
				else if(group.equalsIgnoreCase("B"))
				{
				groupArray = new Object[][] { 
							{  "Canada" }, 
							{  "Russia" }, 
							{  "Japan" } 
						};
				}
			break;
		}
		return groupArray;		
		}
	   
   
}
