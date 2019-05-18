package concept;

import org.testng.annotations.Test;

public class Grouping_Test_Cases
{
   @Test(groups ={"sanity","regression"}, priority=1)
   public void login()
   {
	   System.out.println("Login Test case");
   }
   
   
   @Test(groups={"sanity"}, priority=2)
   public void fundTransefer()
   {
	   System.out.println("Fund Transfer test case");
   }
   
   @Test(groups={"sanity"}, priority=3)
   public void search()
   {
	   System.out.println("This is search test case");
   }
   
   @Test(groups={"regression"}, priority=4)
   public void advanceSearch()
   {
	   System.out.println("This is advance search");
   }
}
