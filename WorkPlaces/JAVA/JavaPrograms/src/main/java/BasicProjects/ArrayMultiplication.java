package BasicProjects;

public class ArrayMultiplication {

	public static void main(String[] args) {
		int arr[] = {2,3,4,5,6}; //declaration and initialization of array
		
		mul(arr); //method
		
	}
	private static void mul(int[] arr) {
		
		int mul = 1; //local variable
		for(int i=0;i<arr.length;i++) {
			mul = mul * arr[i];
			
			//first iteration mul=1, arr[0]=2, mul = mul*arr[0] = 2;
			//second iteration mul=2, arr[1]=3, mul = mul*arr[1] = 6;
			//third iteration mul=6, arr[2]=4, mul = mul*arr[2] = 24;
			//fourth iteration mul=24, arr[3]=5, mul = mul*arr[3]= 120;
			//fifth iteration mul=120, arr[4]=6, mul = mul*arr[4] = 720;
			
			
		}
		System.out.println("Multiplication of array is: " + mul);
	}

}
