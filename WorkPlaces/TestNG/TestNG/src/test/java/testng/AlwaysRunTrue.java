package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlwaysRunTrue {
	
	public static WebDriver driver;
	
	    // alwaysRun = true , it forces to execute the testcase when Testng skips test case
	    // Enabled has higher priority than alwaysRun = true
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void fun() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\UMANAT\\Documents\\Eclipse Workspace\\Chrome Webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.mycarhelpline.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		
	}
	
  @Test (enabled = true, alwaysRun = true )
  public void f() 
  {
	  	  System.out.println(driver.getCurrentUrl() + 1);
  }
  
  @AfterMethod
  public void quit()
  {
	  driver.close();
  }
  
  
}
