package selenium_first;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalFramesPresent {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\UMANAT\\Documents\\Eclipse Workspace\\Chrome Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println("totalframe"+frames.size());
		for(int i= 0; i< frames.size();i++)
		{
			String text = frames.get(i).getText();
		   System.out.println(i+"th frame is " +text);
		}
		   

	}

}
