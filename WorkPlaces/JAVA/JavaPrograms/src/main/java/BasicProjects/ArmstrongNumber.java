package BasicProjects;
//Armstrong number is a number that is equal to the sum of cubes of its digits.

public class ArmstrongNumber {
	 public static void main(String args[]) {
          int num = 407;
          int newNum = 0;
          int rem, temp;
          temp = num;
      
          
          while(temp > 0){
                rem = temp % 10; 
                //rem = 407 % 10 = 7
                //rem = 40 % 10 = 0
                //rem = 4 % 10 = 4
                
                newNum = newNum + rem*rem*rem;
                //newNum = 0 + 7*7*7 = 343
                //newNum = 343 + 0 = 343
                //newNum = 343 + 4*4*4 = 343 + 64 = 407
                
                temp = temp/10;
                //temp= 407/10 = 40
                //temp= 40/10 = 4
          }
          //Check if sum of all digit's cube of the number is equal to the given number or not.
          if(newNum == num){
                System.out.println(num +" is armstrong.");
          }else{
                System.out.println(num +" is not armstrong.");
          }
    }     

 }
