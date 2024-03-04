package selenium_first;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTab_test {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","\\D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).sendKeys(Keys.CONTROL,Keys.RETURN);
		Thread.sleep(3000);
		driver.findElement(By.linkText("Log in")).sendKeys(Keys.SHIFT,Keys.ENTER);

	}

}
