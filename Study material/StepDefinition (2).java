package stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	
	// @Before AND @After ARE HOOKS.
	// hooks run before and after every scenario
	
	@Before(order = 1)                      // global hooks
	public void before() {
		System.out.println("this is before");
	}
	
	@After(order = 1)                      // global hooks
	public void after() {
		
		System.out.println("this is after");
	}
	
	@Before(order = 0)                    // global hooks
	public void before0() {
		System.out.println("this is before");
	}
	
	@After(order = 0)                       // global hooks
	public void after0() {
		
		System.out.println("this is after");
	}
	
	@Before("@first")                      // tagged hooks  --- it will be applicable with scenario tagged with @first
	public void beforeFirst() {
		System.out.println("this is before First");
	}
	
	@Given("^search contacts$")
	public void search_contacts() {
		System.out.println("search contact");
	}

	@When("^contact search completed$")
	public void contact_search_completed() {
		System.out.println("contact_search_completed");
	}

	@Then("^click on save button$")
	public void click_on_save_button() {
		
		System.out.println("click_on_save_button");
	}

	@Given("^search password$")
	public void search_password() {
		
		System.out.println("search_password");
	}

	@When("^password search completed$")
	public void password_search_completed() {
		
		System.out.println("password_search_completed");
	}

	@Then("^click on remember button$")
	public void click_on_remember_button() {
		
		System.out.println("click_on_remember_button");
	}
	
	@Given("^search email$")
	public void search_email() {
		
		System.out.println("search_email");
	}

	@When("^email search completed$")
	public void email_search_completed() {
		
		System.out.println("email_search_completed");
	}

	@Then("^click on format button$")
	public void click_on_format_button() {
		
		System.out.println("click_on_format_button");
	}
}
