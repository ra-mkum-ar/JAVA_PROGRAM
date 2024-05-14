package ARRAYS;

import java.util.Scanner;

public class ARRANGE_NUMBERS {
	
	public static void arrange(int arr[],int n)
	{
		int left=0;
		int right=n-1;
		int counter=1;
		while(left<=right)
		{
			if(counter%2==1)
			{
				arr[left]=counter;
				counter=counter+1;
				left=left+1;
			}
			else
			{
				arr[right]=counter;
				counter=counter+1;
				right=right-1;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[]=new int[n];

		arrange(arr,n);
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		s.close();

	}

}
