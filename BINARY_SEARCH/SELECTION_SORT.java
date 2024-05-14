package BINARY_SEARCH;

public class SELECTION_SORT {
	public static void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void selectionsort(int[]arr)
	{
		int n=arr.length-1;
		
		for(int i=0;i<n;i++)
		{
			int min=Integer.MAX_VALUE;
			int min_Index=-1;
			for(int j=i;j<n;j++)
			{
				if(arr[j]<min)
				{
					min=arr[j];
					min_Index=j;
				}
				
			}
			int temp=arr[min_Index];
			arr[min_Index]=arr[i];
			arr[i]=temp;
		}
	}
	public static void main(String[]args)
	{
		int arr[]= {9,1,4,6,2};
		selectionsort(arr);
		printArray(arr);
		
		
	}

}
