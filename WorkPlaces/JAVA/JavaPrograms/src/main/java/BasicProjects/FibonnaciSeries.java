package BasicProjects;
public class FibonnaciSeries {

	public static void main(String[] args) {
		  int a=0,b=1,temp,i,count=10;  
		  System.out.print(a+" "+b);//printing 0 and 1  
		   
		  for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed  
		  {  
		   temp=a+b;  
		   System.out.print(" "+temp);  
		   a=b;  
		   b=temp;  
		  }  

	}

}
