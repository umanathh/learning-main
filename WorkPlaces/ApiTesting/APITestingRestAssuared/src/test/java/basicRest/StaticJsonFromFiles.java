package basicRest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.annotations.Test;

import files.payload;
import io.restassured.RestAssured;

public class StaticJsonFromFiles {
	
	@Test
	public void addPlace() throws IOException
	{
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String response = 
				given().log().all().queryParam("key","qaclick123").header("Content-type","application/json")
		        .body(new String(Files.readAllBytes(Paths.get("C:\\Users\\UMANAT\\Documents\\AP Testing\\addplace.json"))))
		        .when().post("maps/api/place/add/json")
		        .then().assertThat().statusCode(200)
		        .body("scope",equalTo("APP"))
		        .header("server","Apache/2.4.52 (Ubuntu)")
	        	.extract().response().asString();
		System.out.println(response);
	}

}
