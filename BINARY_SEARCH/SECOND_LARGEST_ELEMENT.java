package BINARY_SEARCH;
import java.util.Scanner;
public class SECOND_LARGEST_ELEMENT {

	public static int SecondLargestElement(int arr[],int n)
	{
		int largest=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++)
		{
			largest=Math.max(largest,arr[i]);
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]!=largest)
			{
				second=Math.max(second,arr[i]);
			}
		}
		return second;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int result = SecondLargestElement(arr,n);
		System.out.print(result+" ");
		s.close();
	}

}
