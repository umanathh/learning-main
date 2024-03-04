package BasicProjects;
import java.util.ArrayList;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {
		
		   List<Integer> arr = new ArrayList<Integer>();
		     arr.add(1);
		     arr.add(2);
		     arr.add(3);
		     arr.add(4);
		     arr.add(5);
		     System.out.println(arr);
		     
		     // Removes element from index 1
		     arr.remove(1);
		     System.out.println(arr);


		     // Prints element at index 3 in list 1
		     // using get() method
		     System.out.println(arr.get(3));


		     // Replace 0th element with 5
		     // in List 1
		     arr.set(0, 6);
		     System.out.println(arr);

		 }

}

