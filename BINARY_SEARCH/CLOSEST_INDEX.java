package BINARY_SEARCH;
import java.util.Scanner;
public class CLOSEST_INDEX {
	public static int binary_search(int arr[],int x)
	{
		int n=arr.length;
		int start=0;
		int end=n-1;
		int closest=-1;
		int min = Integer.MAX_VALUE;
		while(start<=end)
		{
			int mid=(start+end)/2;
			int current = Math.abs(arr[mid]-x);
			if(current<min)
			{
				min=current;
				closest=mid;
			}
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
		return closest;
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
	
