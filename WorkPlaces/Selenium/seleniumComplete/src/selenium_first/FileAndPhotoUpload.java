package selenium_first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileAndPhotoUpload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "\\D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://html.com/input-type-file/");
		driver.findElement(By.id("fileupload")).sendKeys("D:\\Downloads\\SUBDL.com__reign.first.season803979\\Reign.S01E01.HDTV.x264-2HD.srt");
		// We can use this only if type in input is file
		driver.findElement(By.xpath("//input[@value='submit']")).click();
		


	}

}
