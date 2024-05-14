package RECURSION;

import java.util.Scanner;

public class ARRAY_SORTED {
	
	public static boolean issortedbetter(int arr[],int si)
	{
		if(arr.length-1==si)
		{
			return true;
		}
		else if(arr[si]>arr[si+1])
		{
			return false;
		}
		boolean isCheck = issortedbetter(arr,si+1);
		return isCheck;
	}
	
	public static boolean issorted(int arr[],int si)
	{
		if(arr.length==1)
		{
			return true;
		}
		if(arr[si]>arr[si+1])
		{
			return false;
		}
		int smallarray[]= new int[arr.length-1];
		for(int i=1;i<arr.length;i++)
		{
			smallarray[i-1]=arr[i];
		}
		boolean isCheck = issorted(smallarray);
		return isCheck;
		
	}
	public static boolean issorted(int arr[])
	{
		int si=0;
		return issorted(arr,si);
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println(issorted(arr));
		System.out.println(issorted(arr));
		
		s.close();

	}

}
