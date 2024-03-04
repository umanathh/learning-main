package selenium_first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait {
	

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "\\D:\\selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			// Dayanamic wait --->
			driver.get("https://www.ebay.com/b/Clearance-DVDs/bn_7024903879");
			driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
           
            
			
			// EXPLICITLY WAIT IS USED FOR ONE SPECIFIC ELEMENT ONLY.
			
			
			
		   WebDriverWait wait = new WebDriverWait(driver,30);
		   
		   wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gh-gb")));
		   

	}

}
