package deserialsation;

import static io.restassured.RestAssured.given;

import java.util.Iterator;

import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import pojoClassesDeserialisation.GetCourses;

public class Deserialisation {

	public static void main(String[] args) {
		
	// signin to this url to generate urlContaingCode = https://accounts.google.com/o/oauth2/v2/auth?response_type=code&client_id=692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com&scope=https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email&redirect_uri=https%3A%2F%2Frahulshettyacademy.com%2FgetCourse.php 
		
		
		String urlcotainigCode = "https://rahulshettyacademy.com/getCourse.php?code=4%2F0AfJohXlCkDAgPV09q8MAF63mZR2qjXZe3xIxZ19EpM1b9m0bT0UbQ92rOjbEnYIJuAXAWQ&scope=email+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email+openid&authuser=0&prompt=consent";
		String partialCode = urlcotainigCode.split("code=")[1];
		String code = partialCode.split("&scope")[0];

		
// To Get AccessToken
		
		
		String Coderesponse = 
				given() 
                .urlEncodingEnabled(false)                    // Used to disable url encoding. 
                       .queryParams("code",code)
                        .queryParams("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
                        .queryParams("client_secret", "erZOWM9g3UtwNRj340YYaK_W")
                        .queryParams("grant_type", "authorization_code")
                        .queryParams("state", "verifyfjdss")
                        .queryParams("session_state", "ff4a89d1f7011eb34eef8cf02ce4353316d9744b..7eb8")
                     // .queryParam("scope", "email+openid+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email")
                        .queryParams("redirect_uri", "https://rahulshettyacademy.com/getCourse.php")
                        .when().log().all()
                        .post("https://www.googleapis.com/oauth2/v4/token").asString();
		
		JsonPath js = new JsonPath(Coderesponse);
		String accessToken = js.getString("access_token");

//CallBack URL 
		
    GetCourses gtcrs = new GetCourses();
	gtcrs =	
	     given().log().all()
		.queryParam("access_token", accessToken)
		.expect().defaultParser(Parser.JSON)                         // TO make understand that output will be in jason format, it would not require if header has content type as applicatio/jason.
		.when().get("https://rahulshettyacademy.com/getCourse.php")
	    .as(GetCourses.class);
	
	 System.out.println(gtcrs.getInstructor());
	 
// Gettingprice of SoapUI Webservices testing course
	 
	 for(int i=0;i<gtcrs.getCourses().getApi().size();i++) {
		 
		 String coursesTitle = gtcrs.getCourses().getApi().get(i).getCourseTitle();
		 
		 
		 if(coursesTitle.equalsIgnoreCase("SoapUI Webservices testing"))
		 {
			 System.out.println(coursesTitle);
			 System.out.println(gtcrs.getCourses().getApi().get(i).getPrice());
			 break;
		 }
		 
	 }
		
	

		
		

	}

}
