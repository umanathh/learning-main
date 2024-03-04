package testng;

import org.testng.annotations.Test;


       // It is used to stop execution of testcase forcefully after a given time.
       // so if testcase did not passed in a particular time limit, it will be failed.

public class invocationTimeOut {
 
	
	
	@Test (invocationTimeOut = 5)
  public void f() {
	  int i = 1;
	  while (i==1) {
		  System.out.println("HELLO WORLD");
	  }
	 }
	
	@Test  (expectedExceptions = ArithmeticException.class)          // used to send msg that I am expecting this exception, and test case will be passed
	public void f1()
	{
		int k = 1/0 ;
		System.out.println(k);
	}
	
}
