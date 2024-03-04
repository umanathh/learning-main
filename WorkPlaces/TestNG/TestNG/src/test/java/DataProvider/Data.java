package DataProvider;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class Data {
	
	 @DataProvider
	  public Object[][] getdata(Method name) {
		  
		    Object[][] data = new Object[2][2];
		    
		    data[0][0] = "naveenk";
		    data[0][1] = "test@123";
		    
		    data[1][0] = "shivam";
		    data [1][1] = "password2";
		    
		    return data;

}
}
