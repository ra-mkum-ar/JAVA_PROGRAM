package BINARY_SEARCH;
import java.util.Scanner;
public class Kth_SMALLEST {

	public static void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static int kthsmallest(int arr[],int k)
	{
		int n=arr.length;
		boolean swapped=false;
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped=true;
				}
				
			}
			if(!swapped)
			{
				break;
			}
		}
		return arr[k-1];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int arr[]= {3,2,11,5,1};
		int k = s.nextInt();
        int result = kthsmallest(arr,k);
        System.out.print(result);
        s.close();

	}

}
