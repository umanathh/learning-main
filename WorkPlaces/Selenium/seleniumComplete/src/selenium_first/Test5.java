package selenium_first;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test5 {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","\\D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.linkText("Log in"))).contextClick().perform();
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        ArrayList<String> windowdetails=new ArrayList<>(driver.getWindowHandles());
        System.out.println("total tabs opened are "+windowdetails.size());
        driver.switchTo().window(windowdetails.get(1));
        driver.findElement(By.id("Email")).sendKeys("manzoor");
	}

}
