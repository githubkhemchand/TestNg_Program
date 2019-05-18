package concept;

import org.testng.annotations.Test;

public class Parallel_test_exe_method
{
  @Test
  public void testCase1()
  {
      long id =Thread.currentThread().getId();
      System.out.println("Test Case 1 is Successful - Thread id is: "+ id);
  }
  
  @Test
  public void testCase2()
  {
      long id =Thread.currentThread().getId();
      System.out.println("Test Case 2 is Successful - Thread id is: "+ id);
  }
  
  public void testCase3()
  {
      long id =Thread.currentThread().getId();
      System.out.println("Test Case 3 is Successful - Thread id is: "+ id);
  }
}
