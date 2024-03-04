package org.arpit.java2blog;
import java.util.Scanner;
import java.lang.*;

/* Employee Salary Program in Java or Employee Bonus Calculation in Java*/

public class binarySearch {
	
	public boolean contains(int[] a, int b) {
	        if (a.length == 0) {
	            return false;
	        }
	        int low = 0;
	        int high = a.length-1;

	        while(low <= high ) {
	            int middle = (low+high) /2;
	            if (b> a[middle] ){
	                low = middle +1;
	            } else if (b< a[middle]){
	                high = middle -1;
	            } else { // The element has been found
	                return true;
	            }
	        }
	        return false;
	    }
	

	public static void main(String args[]) {
		
		binarySearch Z = new binarySearch() ;
		int[] a = {1,2,3,4,5,6,7};
		System.out.println(Z.contains(a,0));
		
		
		
	}
	

}