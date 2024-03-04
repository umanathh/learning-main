package BasicProjects;
import java.util.Set;
import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		
		Set<String>hashset = new HashSet<String>();
		hashset.add("A");
		hashset.add("B");
		hashset.add("C");
		hashset.add("D");
		System.out.println(hashset);
		for(String set:hashset) {
			System.out.println(set);
		}

	}

}
