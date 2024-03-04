package piramids;

import java.util.Iterator;

public class NumberPramidAssecnding {
	
	public static void main(String []args)
	{
		int num = 1;
		int NoOfRows = 4;
		int NoOfColoumnInFirstRow = 4;
		
		for( int i = NoOfRows;i>0  ;i--)
		{
			
			
			for ( int j = NoOfColoumnInFirstRow ; j>0 ; j--)
			{
				
				System.out.print("  " + num++);
		
				
			}
			System.out.println("");
			NoOfColoumnInFirstRow--;
			
		}
	}

}
