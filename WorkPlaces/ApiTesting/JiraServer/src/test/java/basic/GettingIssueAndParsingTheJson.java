package basic;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import files.body;
import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;

public class GettingIssueAndParsingTheJson {
	
	@Test	
	public void getIssue() {
		
// Logging In
		SessionFilter session = new SessionFilter();
		RestAssured.baseURI = "http://localhost:8080";
		given().log().all().header("content-type", "application/json")
		.body(body.credentials())
		.filter(session)
		.when().post("rest/auth/1/session")
		.then().log().all().assertThat().statusCode(200)
		.extract().response().asString();

		
// Get Issue
		
		given().log().all().pathParam("issueID", "AP-1")
		.filter(session)
		.when().get("/rest/api/2/issue/{issueID}/")
		.then().log().all().assertThat().statusCode(200);
		
	}

}
