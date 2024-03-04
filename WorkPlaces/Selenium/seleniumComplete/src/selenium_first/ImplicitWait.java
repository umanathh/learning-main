package selenium_first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "\\D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Dayanamic wait --->
		driver.get("https://www.ebay.com/b/Clearance-DVDs/bn_7024903879");
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);             // maximum time to wait for page to be fullyloaded.
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);              // maximum time to wait for all elements in page to be loaded.
	
	}

}
           //we can use in xpath contains,starts-with,ends-with functions;   --->  for dyanamic users or text names.
