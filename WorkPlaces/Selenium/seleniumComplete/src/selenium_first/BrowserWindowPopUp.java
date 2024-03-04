package selenium_first;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowPopUp {

	public static void main(String[] args) {
	      
		System.setProperty("webdriver.chrome.driver", "\\D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://popuptest.com/goodpopups.html");
		driver.findElement(By.xpath("//img[@src='//nx-cdn.trgwl.com/Images/nexus-alpha/blue/mobile/layout/footer/contact-us.svg?v=20210310']")).click();
		
		Set<String> handler = driver.getWindowHandles();    // It will store all windows open, as set element
		
		Iterator <String> it = handler.iterator();        // to get the particular element of set to handle window
		String parentWindowId = it.next();
		String childWindowId = it.next();
		driver.switchTo().window(childWindowId);
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getTitle());
		
	}

}
