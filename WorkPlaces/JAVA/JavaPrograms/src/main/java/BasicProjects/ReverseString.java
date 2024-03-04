package BasicProjects;

public class ReverseString {

	public static void main(String[] args) {
		String str="oopoo";
		String rev="";
		
		int len = str.length(); // len = 5
		for(int i = len - 1; i >= 0; i--) // i = 5 - 1 = 4 .. i > = 0 means whenever i value becomes zero or less than zero that means condition becomes false. 
 //i-- goes in reverse direction
		{
			rev= rev + str.charAt(i); //as per charAt index start from 0
			
			//first iteration, i=4, str.charAt(4)= o, rev= ""+ o, rev=o
			//second iteration, i=3, str.charAt(3)= o, rev= o + o, rev=oo
			//third iteration, i=2, str.charAt(2)= p, rev= oo + p, rev=oop
			//fourth iteration, i=1, str.charAt(1)= o, rev= oop + o, rev=oopo
			//first iteration, i=0, str.charAt(0)= o, rev= oopo + o, rev=oopoo

	}
		System.out.println(rev);
}
}
