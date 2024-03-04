package BasicProjects;

public class AverageOfNumbers {

	public static void main(String[] args) {
		int[] array = { -7, 8, 9, 10, 11, 12}; //declared an array
		int sum = 0;
		int n = array.length;
		
		for(int i=0;i<n;i++) {
			sum = sum + array[i]; 
			//sum = sum + array[0] = 0 + -7 = -7
			//sum = sum + array[1] = -7 + 8 = 1
			//sum = sum + array[2] = 1 + 9 = 10
			//sum = sum + array[3] = 10 + 10 = 20
			//sum = sum + array[4] = 20 + 11 = 31
			//sum = sum + array[5] = 31 + 12 = 43
		}
		
		float avg = sum/n; // avg = 43/6
		
		System.out.println("Average is:" + avg);
		
		}

	

}
