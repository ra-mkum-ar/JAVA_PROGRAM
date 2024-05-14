package RECURSION;
import java.util.Scanner;
public class LAST_OCCURENCE
{
	public static int lastOccurence(int arr[],int x,int ei)
	{
		if(ei==0)
		{
			return -1;
		}
		else if(arr[ei]==x)
		{
			return ei;
		}
		return lastOccurence(arr,x,--ei);
	}
	public static int lastOccurence(int arr[],int x)
	{
		int ei=arr.length-1;
		return lastOccurence(arr,x,ei);
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
		System.out.println(lastOccurence(arr,x));
		s.close();
		
	}

}
