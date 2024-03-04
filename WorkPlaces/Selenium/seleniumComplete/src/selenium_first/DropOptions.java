package selenium_first;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropOptions {

	 public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\UMANAT\\Documents\\Eclipse Workspace\\Chrome Webdriver\\chromedriver.exe");
//		  ChromeOptions option = new ChromeOptions().setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("http://demowebshop.tricentis.com/");
		  //TO Mouse Over Menus and operation.
		  WebElement Electronic = driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Electronic')]"));
		  Actions act = new Actions(driver);
		  act.moveToElement(Electronic).build().perform();
		  try {
		   Thread.sleep(3000);
		  } catch (InterruptedException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		  }
		  WebElement cellPhone = driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Cell phones')]"));
		  act.moveToElement(cellPhone).click().perform();
		  driver.quit();
		 }
		}

