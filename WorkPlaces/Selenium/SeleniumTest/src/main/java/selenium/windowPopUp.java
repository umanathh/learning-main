package selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class windowPopUp {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); 	
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/admin/");
		WebElement user=driver.findElement(By.name("username"));
		user.sendKeys("demo");    //demo 		 		
		WebElement pass=driver.findElement(By.name("password")); 
		pass.clear();
		pass.sendKeys("demo");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click(); 
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebElement closebtn=driver.findElement(By.xpath("//*[@id=\"modal-security\"]/div/div/div[1]/button")); 
		
		closebtn.click();
	}	
		

}
