package selenium_first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DyanamicID {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\UMANAT\\Documents\\Eclipse Workspace\\Chrome Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        
        
//        1. we can use anyone of them
        
        
//        driver.findElement(By.xpath("//input[contains(@id,'test_')"));     
//        driver.findElement(By.xpath("//input[starts-with(@id,'test_')"));
//        driver.findElement(By.xpath("//input[ends-with(@id,'test_')"));
        

	}

}
