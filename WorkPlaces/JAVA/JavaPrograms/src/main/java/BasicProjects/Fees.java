package BasicProjects;

public class Fees extends Student {
	   private float Fees;   
	   
	   public Fees(String name, String address, float Fees) {
	      super(name, address);
	      setFees(Fees);
	   }
	   
	   public void mail() {
	    
	      System.out.println("Mailing fees details to " + getName() + " with Fees " + Fees);
	   }
	 
	   public double getFees() {
	      return Fees;
	   }
	   
	   public void setFees(float newFees) {
	      if(newFees >= 0.0) {
	         Fees = newFees;
	      }
	   }
	   }
	