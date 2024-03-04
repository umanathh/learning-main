package BasicProjects;

import java.util.HashMap;

public class MapInterface {

	public static void main(String[] args) {
		HashMap<String,String> Details = new HashMap<String,String>();  
		//Adding elements to map using put() function
		Details.put("FirstName","Puja");  
		Details.put("LastName","Kadam");  
		Details.put("PhoneNumber","123456789");  
		Details.put("Gender","Female");  
		
		System.out.println(Details); 
		
		//using get() to obtain elements in Details
		 System.out.println(Details.get("FirstName")); 
		 System.out.println(Details.get("LastName")); 
		 System.out.println(Details.get("PhoneNumber")); 
		 
	}  
}

