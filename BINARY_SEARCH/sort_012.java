package BINARY_SEARCH;
import java.util.Scanner;
public class sort_012 {
	
	public static void sort123(int arr[],int n)
	{
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		while(t>0)
		{
			int n = s.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=s.nextInt();
			}
			sort123(arr,n);
			for(int i=0;i<n;i++)
			{
				System.out.print(arr[i]+" ");
			}
		}
		s.close();
		

	}

}
