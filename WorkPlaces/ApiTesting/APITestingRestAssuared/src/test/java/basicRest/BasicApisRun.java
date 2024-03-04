package basicRest;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;

import files.payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;


public class BasicApisRun {
	
	public static void main( String[] args ) {
		
// Validation if add APIsi working fine
	
		// Given - All the input details needs to submit
		// when - submit the API ( whether it is get, post or what 
		// Then - validate the response 
		
		
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String response = 
				given().log().all().queryParam("key","qaclick123").header("Content-type","application/json")
		        .body(payload.Body())
		        .when().post("maps/api/place/add/json")
		        .then().assertThat().statusCode(200)
		        .body("scope",equalTo("APP"))
		        .header("server","Apache/2.4.52 (Ubuntu)")
	        	.extract().response().asString();
		System.out.println(response);
			
		JsonPath js = new JsonPath(response);     // jsonpath is an class. If I create an object for this class, it takes string as an input and converts it into JSON
		String placeId = js.getString("place_id");
		System.out.println("'placeId' : " + placeId);
		
		
		
// updating the address
		
		String newAddress = "Amethi UP 227801";
		
		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body("{\r\n"
				+ "\"place_id\":\""+placeId+"\",\r\n"
				+ "\"address\":\""+newAddress+"\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}")
		.when().put("maps/api/place/update/json")
		.then().log().all().assertThat().statusCode(200)
		.body("msg", equalTo("Address successfully updated"));
		
		
		
// Getting the Address and validating the same
		
		String updatedResponse = given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeId)
		.when().get("maps/api/place/get/json")
		.then().log().all().extract().response().asString();
		
		JsonPath updtdJs = new JsonPath(updatedResponse);
		String updatedAddress = updtdJs.getString("address");
		
		Assert.assertEquals(updatedAddress, newAddress);
		System.out.println("updated Address = " +updatedAddress);
		
		
		

	}

}
