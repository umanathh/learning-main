package stepDefination;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Maps;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;


public class Stepdefination {

	
	WebDriver driver;
	
	@Before
	public void setURL() {
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\UMANAT\\Documents\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
	}
	
	@After
	public void closeBrowser() {
		driver.quit();
	}

	@SuppressWarnings("deprecation")
	@Given("^User is on the registeration page$")
	public void user_is_on_the_registeration_page(){
		String ExectedPAgeTitle  = "Register";
		Assert.assertEquals(ExectedPAgeTitle, driver.getTitle());
	    
	}

	@Then("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String fname, String lname){
		
		driver.findElement(By.id("FirstName")).sendKeys(fname);
		driver.findElement(By.id("LastName")).sendKeys(lname);
	   
	}

	@Then("^User enters contact details \"([^\"]*)\"$")
	public void user_enters_contact_details(DataTable address){
		List<List<String>> adr = address.raw();
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys(adr.get(0).get(0));
		
	    
	}

	@Then("^user mentioned \"([^\"]*)\"$")
	public void user_mentioned(DataTable PhoneNumber) {
		for(Map<String, String> phone : PhoneNumber.asMaps(String.class,String.class)){
			driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys(phone.get(PhoneNumber));
			
		}
	   
		
	}

	@Then("^User mentioned the \"([^\"]*)\"$")
	public void user_mentioned_the(String arg1, DataTable arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    throw new PendingException();
	}

	@Then("^user sets \"([^\"]*)\" details$")
	public void user_sets_details(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
