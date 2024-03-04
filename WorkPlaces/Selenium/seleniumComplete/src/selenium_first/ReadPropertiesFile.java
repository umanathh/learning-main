package selenium_first;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("D:\\selenium\\seleniumComplete\\src\\selenium_first\\config.properties");
		
		prop.load(ip);
		System.out.println(prop.getProperty("name"));
		String age = prop.getProperty("age");
		System.out.println(age);
		
		System.setProperty("webdriver.chrome.driver","\\D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(prop.getProperty("URL"));
		driver.findElement(By.linkText(prop.getProperty("ragisterclickbutton_linktext"))).click();
		driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys(prop.getProperty("fname"));
		driver.findElement(By.xpath(prop.getProperty("lastname_xpath"))).sendKeys(prop.getProperty("lname"));
		
	}

}
