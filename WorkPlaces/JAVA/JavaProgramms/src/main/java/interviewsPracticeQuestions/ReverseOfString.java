package interviewsPracticeQuestions;

public class ReverseOfString {

	public static void main(String[] args) {
		int[] a = { 1, 9, 8, 8, 7, 6, 5, 4, 3, 3, 2, 1 };

		for(int i = 0; i<a.length;i++)
		{
		 int x = a[i];
		 int oc = 0;
		 for ( int j = 0; j< a.length;j++)
		 {		 
		 if(a[j] == a[i])
		 oc++;
		 }		
		 System.out.println("occurence of " + x + " is " + oc );
		 a = ReverseOfString.removeElementFromArray(a, x, oc);
		}
		

	}

	public static int[] removeElementFromArray(int array[], int element, int occurence)
	
	{
		int updatedArray[] = new int[array.length-occurence];
		int index = 0;
		for(int i = 0;i<array.length;i++) {
			if(array[i] != element)
			{
				updatedArray[index] = array[i];
				index++;
			}
		}
		for (int j = 0; j<updatedArray.length;j++)
		System.out.println(updatedArray[j]);
		
		return updatedArray;
	}
}
