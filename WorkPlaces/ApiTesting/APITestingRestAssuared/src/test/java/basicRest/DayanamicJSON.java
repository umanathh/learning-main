package basicRest;

import static io.restassured.RestAssured.given;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import files.payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class DayanamicJSON {
	
	@Test(dataProvider ="bookData")
	public void addBook(String isbn, String aisle) {
		
		RestAssured.baseURI = "http://216.10.245.166";
		String response = given().log().all().header("Content-Type","application/json")
		.body(payload.AddBook(isbn,aisle))
		.when().post("Library/Addbook.php")
		.then().log().all().assertThat().statusCode(200)
		.extract().response().asString();
		
		JsonPath js = new JsonPath(response);
		String id = js.getString("ID");
		System.out.println(id);
	}
	
	@DataProvider(name = "bookData")
	
	public Object[][] getData(){
		
		return new Object[][] {
			{"qwe","923"},
			{"asd","965"},
			{"xdt","998"}
			
		};
		
		
	}
	
}
