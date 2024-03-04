package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paramatrizedtestngxml {
	
	static WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void before() {

		 System.setProperty("webdriver.chrome.driver", "\\D:\\selenium\\chromedriver_win32\\chromedriver.exe" );
		  
   
		 driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
  @Test
  @Parameters({"Browser", "url" , "username" , "password" })
  public void f(@Optional("Chrome") String Browser , String url , String username , String password) {  // optional means if that parameter not present in testNG.xml then it will not give error it will take default value present in racket
	  if(Browser.equals("Chrome"))
		  driver = new ChromeDriver();
	  if(url.equals("https://classic.freecrm.com/index.html"))
	  driver.get(url); 
	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
      driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
      driver.findElement(By.xpath("//input[@value='Login']")).click();
  }
  
  @AfterMethod
  public void after()
  {
	  driver.quit();
  }
}
