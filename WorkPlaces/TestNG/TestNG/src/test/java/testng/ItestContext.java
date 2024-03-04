package testng;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class ItestContext {
	
	         // It is an interface
	         // It helps to share data  in the same java file or same class file, within the test cases.
	         // 
	
  @Test (priority = 1)
  public void fun1(ITestContext context) { // passing the object reference og the interface inside the method body
	  
	    System.out.println("this is fun1");
	    context.setAttribute("Windows10", "Dell");
  }
  
	
  @Test (priority =2, dependsOnMethods = "fun1")
  public void fun2(ITestContext context) {
	  
	  System.out.println("this is fun2");
	  String operatingsystem = (String) context.getAttribute("Windows10");
	  System.out.println("the operating system is" + operatingsystem);
	  
	  context.setAttribute("eclipse", "java8");
  }
  
	
  @Test  (priority =3, dependsOnMethods = {"fun1", "fun2"})
  public void fun3(ITestContext context) {
	  
	  System.out.println("this is fun3");
	  
	  String operatingsystem = (String) context.getAttribute("eclipse");
	  System.out.println("the sogtware in use is" + operatingsystem);
	  
	  
	  String software = (String) context.getAttribute("eclipse");
	  System.out.println("the sogtware in use is" + software);
  }
}
