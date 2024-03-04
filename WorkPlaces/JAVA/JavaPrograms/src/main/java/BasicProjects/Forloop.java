package BasicProjects;

public class Forloop {

	public static void main(String[] args) {
		for(int x=1;x<=5;x++) {
			System.out.println(x);
		}
		String arr[]= {"Hello","Hi","Test","Hey"};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		//enhanced for loop
		//mostly used during collection
		System.out.println("enhanced for loop");
		for(String str:arr) {
			System.out.println(str);
		}
	}

}
