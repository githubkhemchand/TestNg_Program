package concept;

import org.testng.annotations.Test;

public class DependsOnMethod
{
	
/*  Hard dependencies
           In this type of dependency, if test2 fails, test1 is not executed and marked as Skipped. This is the default dependency.
      Soft dependencies
           In this type of dependency, even if test2 fails, test1 is executed. This is achieved by adding alwaysRun=true as shown 
           in below example

	Hard dependency
	@Test (dependsOnMethods ={"methodName"})
	
	Soft Dependency
	@Test (dependsOnMethods ={"methodName"}, alwaysRun=true)
*/

   
   @Test(priority=1)
   public void ClickOn_Login_Link()
   {
	  System.out.println("This is Click on login linkd test case");
   }
   
   @Test(priority=2, dependsOnMethods={"ClickOn_Login_Link"},alwaysRun=true)
   public void Login()
   {
	   System.out.println("This is login test cases");
	   
   }
   
   @Test(dependsOnMethods={"Login"})
   public void Dashbord()
   {
	   System.out.println("This is Dashbord test cases");
   }
}
