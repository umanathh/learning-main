package basic;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

import java.io.File;

import files.body;
import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class BasicOprationsOnJiraServer {

	@Test
	public void login() {
		
		RestAssured.baseURI = "http://localhost:8080";
		String response = given().log().all().header("content-type", "application/json")
		.body(body.credentials())
		.when().post("rest/auth/1/session")
		.then().log().all().assertThat().statusCode(200)
		.extract().response().asString();

	}
	
	@Test
	public void crateissue() {
		
		// Session filter is used when we need to have cookies and authentication of one session to be remembered in subsequent session

// Logging in
		
		SessionFilter session = new SessionFilter();
		RestAssured.baseURI = "http://localhost:8080";
		String response = given().log().all().header("content-type", "application/json")
		.body(body.credentials())
		.filter(session)
		.when().post("rest/auth/1/session")
		.then().log().all().assertThat().statusCode(200)
		.extract().response().asString();

		
// Creating issue		
		given().log().all().header("Content-Type","application/json")
		.body("{"+
			    "\"fields\": {"+
			       "\"project\":{"+
			          "\"key\": \"AP\""+
			       "},"+
			       "\"summary\": \"credit\","+
			       "\"description\": \"Creating\","+
			       "\"issuetype\": {"+
			          "\"name\": \"Bug\""+
			       "}"+
			   "}}")
		.filter(session)
		.when().post("/rest/api/2/issue")
		.then().log().all().assertThat().statusCode(201);
	
	
// Adding Comment - 	
		
		given().log().all().pathParam("issueID", "AP-1").header("Content-Type","application/json")
		.body("{\r\n"
				+ "    \"body\": \"This is my first comment\",\r\n"
				+ "    \"visibility\": {\r\n"
				+ "        \"type\": \"role\",\r\n"
				+ "        \"value\": \"Administrators\"\r\n"
				+ "    }\r\n"
				+ "}")
		.filter(session)
		.when().post("/rest/api/2/issue/{issueID}/comment")
		.then().log().all().assertThat().statusCode(201);

// Add attachement 
		
		given().log().all().header("X-Atlassian-Token","no-check")
		.filter(session)
		.multiPart("Files",new File("Info.txt"))                       // used to attach attachments
		.when().post("/rest/api/2/issue/AP-1/attachments")
		.then().log().all().assertThat().statusCode(200);
	}
}
