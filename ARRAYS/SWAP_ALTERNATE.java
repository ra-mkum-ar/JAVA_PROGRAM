package ARRAYS;
import java.util.Scanner;
public class SWAP_ALTERNATE {
	
	public static void swap(int arr[])
	{
		for(int i=0;i<arr.length;i+=2)
		{
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		swap(arr);
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		s.close();

	}
}


