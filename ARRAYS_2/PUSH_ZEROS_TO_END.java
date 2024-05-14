package ARRAYS_2;
import java.util.Scanner;
public class PUSH_ZEROS_TO_END {
	public static void push(int arr[])
	{
		int nonzero=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				int temp=arr[i];
				arr[i]=arr[nonzero];
				arr[nonzero]=temp;
				nonzero++;
			}
		}
	}
	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		push(arr);
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		s.close();
		
	}
			

}
