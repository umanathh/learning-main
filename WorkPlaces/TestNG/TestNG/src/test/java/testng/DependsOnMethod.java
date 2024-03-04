package testng;

import org.testng.annotations.Test;

public class DependsOnMethod {
	
	// if any test case method fails, all depending method will skip.
  
	@Test (priority = 1, enabled = true )
	  public void f() {
		  System.out.println("user registration");
		  }
		
		
	  @Test (priority = 2, enabled = true,  dependsOnMethods = "f" )
	  public void f2() {
		  System.out.println("user login");
		  }
	  
	  @Test (priority = 3, enabled = true, dependsOnMethods = {"f" , "f2" })
	  public void f1()
	  {
		  System.out.println("performance");
	  }
}
