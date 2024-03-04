package selenium_first;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","\\D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("yashwanth2799@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("yashu2799");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		try {
			driver.findElement(By.linkText("Log out"));
			System.out.println("Login Successfull");
			driver.findElement(By.linkText("Log out")).click();
		}catch(NoSuchElementException e){
			System.out.println("Login Unsuccessfull");
		}

	}

}
