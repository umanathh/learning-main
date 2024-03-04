package BasicProjects;
//n=n-1 + n-2
public class Fibonacci {

	public static void main(String[] args) {
		int n=7; 
		int n1=0,n2=1,n3;
		System.out.print(n1+" "+n2);//printing 0 and 1    
		for(int i=2;i<n;i++) {
		  n3=n1+n2; 
		  //n3=0+1=1 
		  //n3=1+1=2  
		  //n3=1+2=3 
		  //n3=2+3=5 
		  //n3=3+5=8
		  System.out.print(" "+n3);//prints 1 ,2 ,3, 5, 8  
		  n1=n2;
		  //n1=1 =1 =2 =3
		  n2=n3;
		  //n2=1 =2 =3 =5
		 }    

	}

}
