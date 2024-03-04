package BasicProjects;

public class ArrayIndexOutOfBoundException {

	public static void main(String[] args) {
		String[] arr= {"Arun","Aravind","Arshi","Aksha","Lekisha","Shestika"};
		//Declaring 6 elements in the string array
		for(int i=0;i<=arr.length;i++) {
			System.out.println(arr[i]);//here, no elements is present at the iteration number arr.length(6) 
			//so, at iteration 6 it will throw an error


	}


		
	}
}
