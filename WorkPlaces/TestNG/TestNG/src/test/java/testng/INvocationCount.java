package testng;

import org.testng.annotations.Test;

public class INvocationCount {
 
	// Invocationcount is used to run a single test case multiple time
	
	@Test (invocationCount = 5)
  public void f() {
		
		System.out.println("hello TestNG");
		
		
  }
}
