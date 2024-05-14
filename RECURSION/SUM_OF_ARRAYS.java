package RECURSION;
import java.util.Scanner;

public class SUM_OF_ARRAYS
{
	public static int SUM_OF_ARRAYS(int arr[],int a)
	{
		if(a==arr.length)
		{
			return 0;
		}
		else
		{
			return arr[a]+SUM_OF_ARRAYS(arr,a+1);
		}
	}
	
	public static int SUM_OF_ARRAYS(int arr[])
	{
		int a=0;
		return SUM_OF_ARRAYS(arr,a);
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
		System.out.println(SUM_OF_ARRAYS(arr));
		s.close();
	}
}
    
    