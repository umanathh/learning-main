package testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo1 {
  @Test
  public void f() {
	  System.out.println("1");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("2");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("3");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("4");
  }
  

}
