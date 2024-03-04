  package testng;

import org.testng.annotations.Test;

public class TestNG_Parallel_part1 {
	  @Test
	  public void f1() {
		  System.out.println("1 :"+ Thread.currentThread().getId());
	  }
	  
	  @Test
	  public void f2() {
		  System.out.println("2 :"+Thread.currentThread().getId());
	  }
	  
	  @Test (threadPoolSize = 2 , invocationCount = 2)                   // giving multiple thread to a single method
	  public void f3() {
		  System.out.println("3 :"+Thread.currentThread().getId() );
	  }
	  
	  @Test       // methods are 4 here but threadcount in testng.xml is 3 it will run in same thread
	  public void f4() {
		  System.out.println("4 :"+Thread.currentThread().getId() );
	  
	  
	  }
}
