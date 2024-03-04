package BasicProjects;
public class SwapnigTwoNumbers {

	public static void main(String[] args) {
		int x=4, y=6;
        System.out.println("before swapping numbers: "+"x = "+x +" and y = "+ y);  
       /*Swapping*/  
        x = x + y;   
        y = x - y;   
        x = x - y;   
        System.out.println("After swapping: "+"x = "+x +" and y = "+ y);
	}

}
