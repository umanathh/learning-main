package testng;



import org.testng.annotations.Test;

public class ProrityAndEnabled {
 
	// If there are multiple @test then they will work in alphabetical order of the method name
	// If we don't give priority to every test then priority will not work.
	// there is nothing like disabled
	// By default enabled remains true.
	// enabled false means that test will not be performed
	
	
	@Test (priority = 1, enabled = true)
  public void f() {
	  System.out.println("user registration");
	  }
	
	
  @Test (priority = 2, enabled = false)
  public void f2() {
	  System.out.println("user login");
	  }
  
  @Test (priority = 3, enabled = true)
  public void f1()
  {
	  System.out.println("performance");
  }


}
