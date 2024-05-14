package ARRAYS;
import java.util.Scanner;
public class ARRAYS_USING_FUNCTIONS {
	public static void printArray(int arr[])
	{
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static int[]takeinput()
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Entered the"+i+"index");
			arr[i]=s.nextInt();
		}
		s.close();
		return arr;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=takeinput();
		printArray(arr);

	}
	

}
