package BINARY_SEARCH;
import java.util.Scanner;
public class find_element {
	public static int binary_search(int arr[],int x)
	{
		int n=arr.length;
		int start=0;
		int end=n-1;
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(arr[mid]<x)
			{
				start=mid+1;
			}
			else if(arr[mid]>x)
			{
				end=mid-1;
			}
			else
			{
				return mid;
			}
		}
		return -1;
	}
	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int x=s.nextInt();
		int b =binary_search(arr,x);
		System.out.println(b+" ");
		s.close();
	}
}
	
