package serialisation;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.ArrayList;
import java.util.List;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import pojoClassesSerialisation.Location;
import pojoClassesSerialisation.SetDetails;

public class Serialisation {

	public static void main(String[] args) {
		

//Setting location
		Location location = new Location();
		location.setLng(-64646);
		location.setLat(66468.84);
		
// setting types
		List<String> type = new ArrayList<String>();
		type.add("baba ji ka thullu");
		type.add("shivam");
		type.add("uma");
		
		
//setting details 		
		SetDetails sdtls = new SetDetails();
		sdtls.setAccuracy(80);
		sdtls.setAddress("Amethi UP 27801");
		sdtls.setLanguage("Marathi and Awadhi");
		sdtls.setLocation(location);
		sdtls.setName("shivam");
		sdtls.setWebsite("htpps://www.shivam.uss");
		sdtls.setPhone_number("+91 7081502850");
		sdtls.setTypes(type);
		
//Adding The Location
	
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		Response response = 
				given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
		        .body(sdtls)
		        .when().post("/maps/api/place/add/json")
		        .then().log().all().assertThat().statusCode(200)
//		        .body("scope",equalTo("APP"))
		        .header("server","Apache/2.4.52 (Ubuntu)")
	        	.extract().response();
//		System.out.println(response);
		
	}

}
