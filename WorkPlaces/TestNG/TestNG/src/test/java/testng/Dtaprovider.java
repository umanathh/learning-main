package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import DataProvider.Data;



// DataProviders returns a two dimensional object array

// you have to specify rows and cols



public class Dtaprovider {
	
	static WebDriver driver;
	
  @SuppressWarnings("deprecation")
  
  
@BeforeTest
  public void fun()
  {
	 
	  System.setProperty("webdriver.chrome.driver", "\\D:\\selenium\\chromedriver_win32\\chromedriver.exe" );
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	 
  }
  
  @Test(dataProviderClass = Data.class, dataProvider = "getdata")
  public void f( String n, String s) {         // No. of parameter is equal to no. of coloum in array of dataprovider
	  driver.get("https://classic.freecrm.com/index.html"); 
	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys(n);
      driver.findElement(By.xpath("//input[@name='password']")).sendKeys(s);
      driver.findElement(By.xpath("//input[@value='Login']")).click();
      
      
      
  }

 
	   
 
  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }

}
