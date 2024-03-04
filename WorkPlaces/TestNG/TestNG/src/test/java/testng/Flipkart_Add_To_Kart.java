package testng;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Flipkart_Add_To_Kart {
 
	WebDriver driver;
	

	@Test
  public void fun() throws InterruptedException {
		
		driver.findElement(By.xpath("//span[contains(text(),'Enter Email/Mobile number')]/../..//input")).sendKeys("xxxxxxxxxxxxxx");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("xxxxxx");
		driver.findElement(By.xpath("//span[contains(text(),'Login')]/../..//button")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@title=\"Search for products, brands and more\"]")).sendKeys("mobiles");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
    	driver.findElement(By.xpath("//div[contains(text(),'POCO C31 (Royal Blue, 64 GB)')]")).click();
    	
        Set<String> handler = driver.getWindowHandles();      // It will store all windows open, as set element
		
		Iterator <String> it = handler.iterator();        // to get the particular element of set to handle window
		String parentWindowId = it.next();
		String childWindowId = it.next();
		driver.switchTo().window(childWindowId);
		
		driver.findElement(By.className("_3v1-ww")).click();
		
		
		
    	
		
  }
	
		
	
	@SuppressWarnings("deprecation")
	@BeforeMethod
  public void beforeTest() {
		
		System.setProperty("webdriver.chrome.driver", "\\D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new  ChromeDriver();
		driver.get("https://www.flipkart.com/");
//		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		
		
  }

 
	
	@AfterMethod
  public void afterMethod() {
  }

}
