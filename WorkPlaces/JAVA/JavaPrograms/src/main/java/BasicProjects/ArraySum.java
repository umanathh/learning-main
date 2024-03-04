package BasicProjects;

public class ArraySum {

	public static void main(String[] args) {
		int arr[] = {2,3,4,5,6}; //declaration and initialization of array
		
		sum(arr); //method
		
	}
	private static void sum(int[] arr) {
		
		int sum = 0; //local variable
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
			
			//first iteration sum=0, arr[0]=2, sum = sum+arr[0] = 2;
			//second iteration sum=2, arr[1]=3, sum = sum+arr[1] = 5;
			//third iteration sum=5, arr[2]=4, sum= sum+arr[2] = 9;
			//fourth iteration sum=9, arr[3]=5, sum = sum+arr[3]= 14;
			//fifth iteration sum=14, arr[4]=6, sum = sum+arr[4] = 20;
			
			
		}
		System.out.println("Multiplication of array is: " + sum);
	}

}