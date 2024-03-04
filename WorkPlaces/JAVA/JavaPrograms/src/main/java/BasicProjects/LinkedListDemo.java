package BasicProjects;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		List<String>string = new LinkedList<String>();
		string.add("H");
		string.add("Y");
		string.add("M");
		string.add("E");
		
		Iterator<String>iterator = string.iterator();
		//iterator.hasNext() nothing just a check on the next available in collection
		while(iterator.hasNext()) {
		System.out.println(iterator.next());
		}
		System.out.println("Befare Remove");
		string.remove(0);
		string.remove("Y");
		
		Iterator<String>iterator1 = string.iterator();
		//iterator.hasNext() nothing just a check on the next available in collection
		while(iterator1.hasNext()) {
		System.out.println(iterator1.next());
		}

	}

}
