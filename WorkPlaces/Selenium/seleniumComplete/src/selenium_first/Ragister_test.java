package selenium_first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ragister_test {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","\\D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("FirstName")).sendKeys("shivam");
		driver.findElement(By.id("LastName")).sendKeys("bhai");
		driver.findElement(By.id("gender-male")).click();
		
		
		

	}

}
