   package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
	
	WebDriver driver;
 	SoftAssert s_assert;
	
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void funbefore() {
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\UMANAT\\Documents\\Eclipse Workspace\\Chrome Webdriver\\chromedriver.exe" );
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		  driver.get("https://google.com"); 
		  
	}
	
	
	// In Every  soft assert at the end of Test s_assert.assertAll(); is mandatory.
	// assertAll() gives the exception for all the failed assertions within testCases
	// if soft assert fails, following lines will execute but in case of hard assert following line will not execute.
	
	
	
	@Test (priority = 1)
	  public void softassert() {
			
		String acctualtitle = driver.getTitle();
		String expectedtitle = "1Google" ;
		s_assert.assertEquals(acctualtitle, expectedtitle);
		System.out.println("test case not pass");
		
		s_assert.assertAll();
	  }
 
	
	@Test   (priority = 2)
  public void hardassert() {
		
	String acctualtitle = driver.getTitle();
	String expectedtitle = "Google" ;
	Assert.assertEquals(acctualtitle, expectedtitle, "title is not matched");
	System.out.println("test case pass");
  }
	
	@AfterMethod
	public void after() {
		
		driver.quit();
	}
}
