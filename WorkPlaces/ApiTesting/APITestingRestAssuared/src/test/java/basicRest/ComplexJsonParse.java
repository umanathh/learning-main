package basicRest;

import org.testng.Assert;

import files.payload;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {

	public static void main(String[] args) {
		
		JsonPath js = new JsonPath(payload.CoursePrice());
		
//Print No of courses returned by API

		
		int NoOfCoureses = js.getInt("courses.size()");
		System.out.println("Total number of Courese are : " +NoOfCoureses);
		

//Print Purchase Amount		
		
		int purchaseAmount = js.getInt("dashboard.purchaseAmount");
		System.out.println("Total Purchase Ammount is = "+purchaseAmount);
		
//Print Title of the first course
		
		String firstCourseName = js.getString("courses[0].title");
		System.out.println("Tital of the first course - "+firstCourseName);
		
//Print All course titles and their respective Prices
		
		for(int i = 0; i<NoOfCoureses; i++)
		{
			
			String CourseName = js.getString("courses["+i+"].title");
			int coursePrice = js.getInt("courses["+i+"].price");
			
			System.out.println('\n'+"Name of the Course = " +CourseName+ '\n' +"price of the course = " + coursePrice + '\n');
			
		}
		
//Print no of copies sold by RPA Course
		
		for(int i = 0; i<NoOfCoureses; i++)
		{
			
			String CourseName = js.getString("courses["+i+"].title");
			
			if(CourseName.equalsIgnoreCase("rpa"))
			{
				int NoOfCopies = js.getInt("courses["+i+"].copies");
				System.out.println("Number of copies for rpa = " +NoOfCopies + '\n');
				break;
			}
			
		}
//Verify if Sum of all Course prices matches with Purchase Amount
			
		    int actualPurcaseAmmount = 0;
		    
			for(int i = 0; i<NoOfCoureses; i++)
			{
				int coursePrice = js.getInt("courses["+i+"].price");
				int NoOfCopies = js.getInt("courses["+i+"].copies");
				   actualPurcaseAmmount = coursePrice*NoOfCopies + actualPurcaseAmmount;
								
			}
			
			System.out.println("Actual Purchase amount = "+actualPurcaseAmmount);
			System.out.println("expected purchase amount = " +purchaseAmount);
			Assert.assertEquals(purchaseAmount, actualPurcaseAmmount, "Actual and expected purachase amount is not same");
			
		}
		

	}


	
