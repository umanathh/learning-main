package BasicProjects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arrayList {

	public static void main(String[] args) {
		// Here ArrayList is the implementation class and list is an interface.
		//<>.. Generic, this is used to explicitly specify the type of objects we about to work on.
		List<Integer>arrayList = new ArrayList<Integer>();
		arrayList.add(1);//user inputs so that the size of this array list would be determined
		arrayList.add(2);
		arrayList.add(3);
		//Access the list
		
		for(int i=0;i<arrayList.size();i++) {
			System.out.println(arrayList.get(i));
		}
		System.out.println("Using For Enhanced Loop");
		for(Integer i:arrayList) {
			System.out.println(i);
		}
		System.out.println("Using Iterator Interface");
		Iterator<Integer>iterator = arrayList.iterator();
		//iterator.hasNext() nothing just a check on the next available in collection
		while(iterator.hasNext()) {
		System.out.println(iterator.next());
		}

	}

}
