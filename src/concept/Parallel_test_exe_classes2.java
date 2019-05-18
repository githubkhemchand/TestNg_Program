package concept;

import org.testng.annotations.Test;

public class Parallel_test_exe_classes2
{
	@Test
	  public void testCase4()
	  {
	      long id =Thread.currentThread().getId();
	      System.out.println("Test Case 4 is Successful - Thread id is: "+ id);
	  }
	  
	  @Test
	  public void testCase5()
	  {
	      long id =Thread.currentThread().getId();
	      System.out.println("Test Case 5 is Successful - Thread id is: "+ id);
	  }
	  
	  public void testCase6()
	  {
	      long id =Thread.currentThread().getId();
	      System.out.println("Test Case 6 is Successful - Thread id is: "+ id);
	  }
}
