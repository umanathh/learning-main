package selenium_first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");   //use to get main url on which operation will be performed
//		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().to("http://www.google.com");         // use to get external url
		
		
		
		Thread.sleep(3000);
		driver.navigate().back();                    // to go back
//		Thread.sleep(5000);
		driver.navigate().forward();               // to go forward
		
		driver.navigate().refresh();               // to refresh page
		

	}

}
