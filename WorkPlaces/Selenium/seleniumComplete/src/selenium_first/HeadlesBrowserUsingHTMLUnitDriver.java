package selenium_first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlesBrowserUsingHTMLUnitDriver {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
	      System.setProperty("webdriver.chrome.driver","\\D:\\selenium\\chromedriver_win32\\chromedriver.exe");
//    WebDriver driver = new ChromeDriver();
  	     WebDriver driver = new HtmlUnitDriver();
  	     
  	   driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS); 
	      
	// Advantages of HtmlUnitDriver
    // 1. testing will be fast as no browser will be launched
    // 2. testing will happen behind the scene
	      
	      
	// not suitavle for actions class like moveToElement, doubleclick, drag and drop, etc
	      driver.get("https://classic.freecrm.com/index.html");

	      // title print before login
	      
	      System.out.println(driver.getTitle());
	      
	      //LogIn credentials
	      driver.findElement(By.xpath("//input[@name='username']")).sendKeys("naveenk");
	      driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test@123");
	      driver.findElement(By.xpath("//input[@value='Login']")).click();
	      
	      Thread.sleep(5000);
	      // title print after login
	      System.out.println(driver.getTitle());
	}

}
