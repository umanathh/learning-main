package interviewsPracticeQuestions;

public class SortingOfArray {
	
	public static void main(String []args)
	{
		int [] arr = {11,2,3,4};

		for (int i = 0; i<arr.length;i++)			
		{
			for(int j = i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					arr[i] += arr[j];
					arr[j] = arr[i]-arr[j];
					arr[i] -=arr[j];
				}
				
				
			}
			
			System.out.println(arr[i]);
		}
	}

}

//if(arr[i][j]<arr[row][col])
//	arr[row][col] = arr[i][j];