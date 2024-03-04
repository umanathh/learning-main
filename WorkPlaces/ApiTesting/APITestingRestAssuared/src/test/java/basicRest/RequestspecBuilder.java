package basicRest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;

import files.payload;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class RequestspecBuilder {

	public static void main(String[] args) {
		
		RequestSpecification spec = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").addQueryParam("key", "qaclick123")
				.setContentType(ContentType.JSON).build();
		
		ResponseSpecification expect = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		
		
        RequestSpecification req =	given().spec(spec)
		                           .body(payload.Body());
				
				
        String response =  
                 req.when().post("maps/api/place/add/json")
		        .then().spec(expect)
	        	.extract().response().asString();


		System.out.println(response);
			
		JsonPath js = new JsonPath(response);     // jsonpath is an class. If I create an object for this class, it takes string as an input and converts it into JSON
		String placeId = js.getString("place_id");
		System.out.println("'placeId' : " + placeId);
		
		
		
// updating the address
		
		String newAddress = "Amethi UP 227801";
		
		
		req.body("{\r\n"
				+ "\"place_id\":\""+placeId+"\",\r\n"
				+ "\"address\":\""+newAddress+"\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}")
		.when().put("maps/api/place/update/json")
		.then().spec(expect)
		.body("msg", equalTo("Address successfully updated"));
		
		
		
// Getting the Address and validating the same
		
		String updatedResponse = req.queryParam("place_id", placeId)
		.when().get("maps/api/place/get/json")
		.then().log().all().extract().response().asString();
		
		JsonPath updtdJs = new JsonPath(updatedResponse);
		String updatedAddress = updtdJs.getString("address");
		
		Assert.assertEquals(updatedAddress, newAddress);
		System.out.println("updated Address = " +updatedAddress);
		
		
		

	}



	}


