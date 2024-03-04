package BasicProjects;

public class PalindromeNumber {

	public static void main(String[] args) {
		int rem, temp;
		int sum=0, n=454; 
		temp=n;
		
		while(n>0) {
			rem = n%10; 
			//rem=454%10 = 4
			//rem=45%10 = 5
			//rem=4%10 = 4
			
			sum=(sum*10)+rem; 
			//sum=(0*10)+4=4
			//sum=(4*10)+5=45
			//sum=(45*10)+4=454
			n=n/10;
			//n=454/10=45
			//n=45/10=4
		}
		
		if(sum==temp) {
			System.out.println("It is a palindrome number");
		}
		else {
			System.out.println("It is not a palindrome number");
			
		}

	}

}
