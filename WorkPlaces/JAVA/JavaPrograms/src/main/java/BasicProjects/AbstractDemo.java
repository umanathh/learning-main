package BasicProjects;

public class AbstractDemo {

	   public static void main(String [] args) {
	      Fees f = new Fees("Puja Kadam", "Pune, MH",  70000);
	      Student s = new Fees("Radhika Pawar", "Mumbai, MH", 70000);
	     
	      f.mail();
	      s.mail();
	   }
	}