package BasicProjects;
public class IsVowelPresent {

	public static void main(String[] args) {
		 // Declare a variables
		  String str = null;
		  String s = "assignment";  
		  // Convert String to lower case letter
		  str = s.toLowerCase();

		  // Print all vowels
		  System.out.print("Vowels in the given String are:");
		  // For loop to iterate String
		  for (int i = 0; i < str.length(); i++) {
		   // Check a character is vowel or not..."a,e,i,o,u"
		   if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
		     || str.charAt(i) == 'u') {
		    // Display each vowel
		    System.out.print(" " + str.charAt(i));
		   }

	}

	}
}
