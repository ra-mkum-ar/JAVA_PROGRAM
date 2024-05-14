package RECURSION;
import java.util.Scanner;
public class FIRST_OCCURENCE
{
	public static int firstOccurence(int arr[],int x,int si)
	{
		if(arr.length==si)
		{
			return -1;
		}
		else if(arr[si]==x)
		{
			return si;
		}
		return firstOccurence(arr,x,si+1);
	}
	public static int firstOccurence(int arr[],int x)
	{
		int si=0;
		return firstOccurence(arr,x,si);
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
		int x = s.nextInt();
		System.out.println(firstOccurence(arr,x));
		s.close();
		
	}

}
