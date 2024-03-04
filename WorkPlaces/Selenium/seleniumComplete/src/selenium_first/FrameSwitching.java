package selenium_first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameSwitching 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\UMANAT\\Documents\\Eclipse Workspace\\Chrome Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/");
		driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
		
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(3000);
		driver.switchTo().frame("mainpanel"); // we can give name of frame or index of frame
		                              // index no. start from zero.   ->  driver.switchTo().frame(0);
		driver.findElement(By.xpath("//a[contains(text(),'submit')]")).click();
		
	}

}
