package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG_Parallel_Part2 {
 
	@Test   (threadPoolSize = 3 , invocationCount = 3)
	  public void f1() throws InterruptedException {
		  System.out.println("1 :"+ Thread.currentThread().getId());
		  System.setProperty("webdriver.chrome.driver", "\\D:\\selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://demo.automationtesting.in/Alerts.html");   //use to get main url on which operation will be performed
//			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.navigate().to("http://www.google.com");
	  }
	  
	  @Test    (threadPoolSize = 3 , invocationCount = 3)
	  public void f2() throws InterruptedException {
		  System.out.println("2 :"+Thread.currentThread().getId());
		  System.setProperty("webdriver.chrome.driver", "\\D:\\selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://demo.automationtesting.in/Alerts.html");   //use to get main url on which operation will be performed
//			driver.manage().window().maximize();
			//Thread.sleep(3000);
			driver.navigate().to("http://www.google.com");
	  }
	  
	  @Test (threadPoolSize = 2 , invocationCount = 2)                   // giving multiple thread to a single method
	  public void f3() {
		  System.out.println("3 :"+Thread.currentThread().getId() );
		  System.setProperty("webdriver.chrome.driver", "\\D:\\selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://demo.automationtesting.in/Alerts.html");   //use to get main url on which operation will be performed
//			driver.manage().window().maximize();
			driver.navigate().to("http://www.google.com");
	  }
	  
	  @Test       // methods are 4 here but threadcount in testng.xml is 3 it will run in same thread
	  public void f4() {
		  System.out.println("4 :"+Thread.currentThread().getId() );
	  
	  
	  }

}
