package interviewsPracticeQuestions;

public class PrintMinimumNmberOfArray {

	public static void main(String[] args) {
		
		int [][] arr = {{1,2},{21,7,4},{123,123,123,6789,0}};
		System.out.println(arr.length);
		
		
		int MinimumNum = arr[0][0];
		int MinNumberCoulmn = 0;
		int maxNumberOfMinNumCloulmn=0;
		
		for (int i = 0;i<arr.length;i++)
		{
			for (int j = 0; j<arr[i].length;j++)
			{
				if(arr[i][j] < MinimumNum)
			
				{									
					MinimumNum = arr[i][j];	
					MinNumberCoulmn = j;
				}
			
				
			}
			

		 }
		
		
		System.out.println("MinimuNumberOfArray= " +MinimumNum);
		System.out.println(maxNumberOfMinNumCloulmn);
		
		

	}

}