package selenium_first;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotsInSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "\\D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);                                               //will take screenshot
	    try {
			FileUtils.copyFile(src, new File("D:\\selenium\\seleniumComplete\\src\\selenium_first\\google.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}              // will save screenshot
		
	}
	
	// we can use a predeifined function search on google.

}
